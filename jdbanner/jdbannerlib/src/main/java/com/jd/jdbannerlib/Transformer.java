package com.jd.jdbannerlib;

import android.support.v4.view.ViewPager.PageTransformer;

import com.jd.jdbannerlib.transformer.AccordionTransformer;
import com.jd.jdbannerlib.transformer.BackgroundToForegroundTransformer;
import com.jd.jdbannerlib.transformer.CubeInTransformer;
import com.jd.jdbannerlib.transformer.CubeOutTransformer;
import com.jd.jdbannerlib.transformer.DefaultTransformer;
import com.jd.jdbannerlib.transformer.DepthPageTransformer;
import com.jd.jdbannerlib.transformer.FlipHorizontalTransformer;
import com.jd.jdbannerlib.transformer.FlipVerticalTransformer;
import com.jd.jdbannerlib.transformer.ForegroundToBackgroundTransformer;
import com.jd.jdbannerlib.transformer.RotateDownTransformer;
import com.jd.jdbannerlib.transformer.RotateUpTransformer;
import com.jd.jdbannerlib.transformer.ScaleInOutTransformer;
import com.jd.jdbannerlib.transformer.StackTransformer;
import com.jd.jdbannerlib.transformer.TabletTransformer;
import com.jd.jdbannerlib.transformer.ZoomInTransformer;
import com.jd.jdbannerlib.transformer.ZoomOutSlideTransformer;
import com.jd.jdbannerlib.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;//右向左平滑滑动
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;//右向左，翻页效果
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;//右向左，后图片覆盖前图
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;//右向左，前图隐藏到后图
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;//
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;//沿竖直中线翻转
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;//沿横中线翻转
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
