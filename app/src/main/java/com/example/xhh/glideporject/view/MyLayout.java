package com.example.xhh.glideporject.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.ViewTarget;

/**
 * Created by xhh on 2017/12/18.
 */

public class MyLayout extends LinearLayout {
    private ViewTarget<MyLayout,GlideDrawable> viewTarget;
    public MyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        viewTarget = new ViewTarget<MyLayout, GlideDrawable>(this) {
            @Override
            public void onResourceReady(GlideDrawable resource, GlideAnimation  glideAnimation) {
                MyLayout myLayout = (MyLayout) getView();
                myLayout.setImageAsBackground(resource);
            }
        };
    }

    public ViewTarget<MyLayout, GlideDrawable> getViewTarget() {
        return viewTarget;
    }
    public void setImageAsBackground(GlideDrawable resource) {
       this.setBackground(resource);
    }
}
