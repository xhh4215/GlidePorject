package com.example.xhh.glideporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

public class SimpleActivity extends AppCompatActivity {
    private Button button;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        button = (Button) findViewById(R.id.simple_button);
        imageView = (ImageView) findViewById(R.id.simple_image);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleTarget<GlideDrawable> simpleTarget = new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        imageView.setImageDrawable(resource);
                    }
                };
                String url ="http://i.imgur.com/S963yEM.jpg";
                Glide.with(SimpleActivity.this)
                        .load(url)
                        .into(simpleTarget);
            }
        });


    }

}
