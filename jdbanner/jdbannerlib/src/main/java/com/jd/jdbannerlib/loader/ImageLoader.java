package com.jd.jdbannerlib.loader;

import android.content.Context;
import android.view.View;

import com.jd.jdbannerlib.ViewPagerCardView;


public abstract class ImageLoader implements ImageLoaderInterface<View> {

    @Override
    public View createImageView(Context context,float radius) {
        View imageView = ViewPagerCardView.createCardView(context,radius);
        return imageView;
    }

}
