package com.jd.jdbannerlib.transformer;

import android.util.Log;
import android.view.View;

/**
 * FileName: ZoomSlide2Transformer
 * Author:gaopan
 * Date: 2019/4/17 17:34
 * Description:
 */
public class ZoomSlide2Transformer extends ABaseTransformer {
    private float MAX_SCALE = 1.0f;
    private float MIN_SCALE = 0.95f;
    private float MIN_Alpha = 0.2f;

    @Override
    protected void onTransform(View view, float position) {
        //setScaleY只支持api11以上
        if (position < -1) {
            view.setScaleX(MIN_SCALE);
            view.setScaleY(MIN_SCALE);
        } else if (position <= 1) //a页滑动至b页 ; a页从 0.0 -1 ;b页从1 ~ 0.0
        { // [-1,1]
            float scaleFactor = MIN_SCALE + (1 - Math.abs(position)) * (MAX_SCALE - MIN_SCALE);
            float alpha = MIN_Alpha + ((1 - Math.abs(position)) * (MAX_SCALE - MIN_Alpha));
            if (position > 0) {
                view.setTranslationX(-scaleFactor * 2);
            } else if (position < 0) {
                view.setTranslationX(scaleFactor * 2);
            }
            view.setPivotX(position < 0 ? 0 : view.getWidth());
            view.setPivotY(view.getHeight() / 2f);
            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);
            view.setAlpha(alpha);
        } else { // (1,+Infinity]
//            view.setScaleX(MIN_SCALE);
//            view.setScaleY(MIN_SCALE);
//            view.setAlpha(MIN_Alpha);
        }
    }
}