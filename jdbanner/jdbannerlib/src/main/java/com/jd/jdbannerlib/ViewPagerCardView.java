package com.jd.jdbannerlib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
/**
 * FileName: ViewPagerCardView
 * Author:gaopan
 * Date: 2019/4/18 10:14
 * Description:
 */
public class ViewPagerCardView{

    public static View createCardView(Context context, int resourceId,float cornerRadius){
        View view = LayoutInflater.from(context).inflate(resourceId,null,false);
        ImageView roundedImageView = view.findViewById(R.id.card_view_imageview);
//        roundedImageView.setCornerRadius(cornerRadius);
        return view;
    }

    public static View createCardView(Context context){
        return createCardView(context,R.layout.card_view_layout,0);
    }

    public static View createCardView(Context context,float cornerRadius){
        return createCardView(context,R.layout.card_view_layout,cornerRadius);
    }
}
