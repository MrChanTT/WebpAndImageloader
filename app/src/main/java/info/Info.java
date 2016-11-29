package info;

import com.example.chenquan.webpapplication.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * Created by chenquan on 2016/11/28.
 */

public class Info {
    public static DisplayImageOptions options = new DisplayImageOptions.Builder().showImageOnLoading(R.drawable.item) // 设置图片下载期间显示的图片
            .showImageForEmptyUri(R.drawable.item) // 设置图片Uri为空或是错误的时候显示的图片
            .showImageOnFail(R.drawable.item) // 设置图片加载或解码过程中发生错误显示的图片
            .cacheInMemory(false) // 设置下载的图片是否缓存在内存中
            .cacheOnDisk(true) // 设置下载的图片是否缓存在SD卡中
            .displayer(new RoundedBitmapDisplayer(10)) // 设置成圆角图片
            .build(); // 构建完成
}
