package com.example.chenquan.webpapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.iv);
        imageLoader = com.nostra13.universalimageloader.core.ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(MainActivity.this));
//        imageView.setImageResource(R.mipmap.mywebp);//webp格式的图片
        MyHandle myHandle = new MyHandle();
        myHandle.sendMessage(myHandle.obtainMessage(1));

    }
    protected class MyHandle extends Handler{
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    imageLoader .displayImage(
                            "http://photo.enterdesk.com/2010-11-2/enterdesk.com-5CA99D47E472CBF6C9FC93C4B07709B8.jpg"
                            ,imageView);
                    break;
            }
            super.handleMessage(msg);
        }
    }
}
