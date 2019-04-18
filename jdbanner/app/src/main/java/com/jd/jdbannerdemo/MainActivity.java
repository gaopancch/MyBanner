package com.jd.jdbannerdemo;

import android.Manifest;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jd.jdbannerlib.CustomRoundAngleImageView;
import com.jd.jdbannerlib.JDBannerView;
import com.jd.jdbannerlib.BannerConfig;
import com.jd.jdbannerlib.Transformer;
import com.jd.jdbannerlib.listener.OnBannerListener;
import com.jd.jdbannerlib.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private JDBannerView jdBannerView;
    private List<String> list_path;
    private List<String> list_title;
    private final int REQUEST_CODE_STORE = 3001;
    private final int REQUEST_CODE_AUDIO = 3002;
    private final int REQUEST_CODE_INTERNEW = 3002;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jdBannerView = findViewById(R.id.banner);
        PermissionUtil.getExternalStoragePermissions(this,REQUEST_CODE_STORE);
        PermissionUtil.getAudioPermissions(this,REQUEST_CODE_AUDIO);
        PermissionUtil.requestPerssions(this,REQUEST_CODE_INTERNEW, Manifest.permission.INTERNET);
        init();
    }

    public void init() {
        //放图片地址的集合
        list_path = new ArrayList<>();
        //放标题的集合
        list_title = new ArrayList<>();

        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");
        list_title.add("好好学习");
        list_title.add("天天向上");
        list_title.add("热爱劳动");
        list_title.add("不搞对象");
        //设置内置样式，共有六种可以点入方法内逐一体验使用。
        jdBannerView.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器，图片加载器在下方
        jdBannerView.setImageLoader(new MyLoader());
        //设置图片网址或地址的集合
        jdBannerView.setImages(list_path);
        //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
        jdBannerView.setBannerAnimation(Transformer.ZoomSlide2);
        //设置轮播图的标题集合
        jdBannerView.setBannerTitles(list_title);
        //设置轮播间隔时间
        jdBannerView.setDelayTime(3000);
        //设置是否为自动轮播，默认是“是”。
        jdBannerView.isAutoPlay(true);
        //设置圆角角度
        jdBannerView.setCornerRadius(70);
        //设置图片缩放格式
        jdBannerView.setScaleType(6);

        //设置指示器的位置，小点点，左中右。
        jdBannerView.setIndicatorGravity(BannerConfig.CENTER)
                //以上内容都可写成链式布局，这是轮播图的监听。比较重要。方法在下面。
                .setOnBannerListener(new OnBannerListener() {
                    @Override
                    public void OnBannerClick(int position) {
                        Log.i("gaopan","OnBannerClick positon = "+position);
                    }
                })
                //必须最后调用的方法，启动轮播图。
                .start();
    }

    //自定义的图片加载器
    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, View imageViewLayout) {
            Glide.with(context).load((String)path)
//                    .bitmapTransform(new RoundedCornersTransformation(MainActivity.this, 50, 0))
                    .into((CustomRoundAngleImageView) imageViewLayout.findViewById(R.id.card_view_imageview));
        }
    }
}
