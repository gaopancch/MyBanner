package com.jd.jdbannerlib.loader;

import android.content.Context;
import android.view.View;

import java.io.Serializable;

/**
 * Created by gaopan on 2018/4/26.
 * Class Description：
 */
public interface ImageLoaderInterface<T extends View> extends Serializable {

    void displayImage(Context context, Object path, T imageView);

    T createImageView(Context context,float radius);
}
