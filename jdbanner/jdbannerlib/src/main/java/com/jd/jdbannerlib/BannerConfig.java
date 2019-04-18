package com.jd.jdbannerlib;


public class BannerConfig {
    /**
     * indicator style
     */
    public static final int NOT_INDICATOR=0;//banner只有图片，没有任何文字和indicator
    public static final int CIRCLE_INDICATOR=1;//轮播图片，正中间有圆点的indicator
    public static final int NUM_INDICATOR=2;//轮播图片，右下键有数字的显示第几张图片的indicator，如1/4
    public static final int NUM_INDICATOR_TITLE=3;//轮播图片，下面有文字title和数字显示的indicator
    public static final int CIRCLE_INDICATOR_TITLE=4;//轮播图片，文字title和在文字栏上方圆点indicator
    public static final int CIRCLE_INDICATOR_TITLE_INSIDE=5;//轮播图片，文字title和在文字栏右下角圆点indicator
    /**
     * indicator gravity
     */
    public static final int LEFT=5;
    public static final int CENTER=6;
    public static final int RIGHT=7;

    /**
     * jdbannerview
     */
    public static final int PADDING_SIZE=5;
    public static final int TIME=2000;
    public static final int DURATION=800;
    public static final boolean IS_AUTO_PLAY=true;
    public static final boolean IS_SCROLL=true;

    /**
     * title style
     */
    public static final int TITLE_BACKGROUND=-1;
    public static final int TITLE_HEIGHT=-1;
    public static final int TITLE_TEXT_COLOR=-1;
    public static final int TITLE_TEXT_SIZE=-1;

}
