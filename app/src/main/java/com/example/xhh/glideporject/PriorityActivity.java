package com.example.xhh.glideporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;

public class PriorityActivity extends AppCompatActivity {
    private ImageView imageview1;
    private ImageView imageview2;
    public static String[] eatFoodyImages = {
            "http://i.imgur.com/rFLNqWI.jpg",
            "http://i.imgur.com/C9pBVt7.jpg",
            "http://i.imgur.com/rT5vXE1.jpg",
            "http://i.imgur.com/aIy5R2k.jpg",
            "http://i.imgur.com/MoJs9pT.jpg",
            "http://i.imgur.com/S963yEM.jpg",
            "http://i.imgur.com/rLR2cyc.jpg",
            "http://i.imgur.com/SEPdUIx.jpg",
            "http://i.imgur.com/aC9OjaM.jpg",
            "http://i.imgur.com/76Jfv9b.jpg",
            "http://i.imgur.com/fUX7EIB.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "http://i.imgur.com/COzBnru.jpg",
            "http://i.imgur.com/Z3QjilA.jpg",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority);
        imageview1 = (ImageView) findViewById(R.id.pro_imageview1);
        imageview2 = (ImageView) findViewById(R.id.pro_imageview2);
        Glide.with(PriorityActivity.this)
                .load(eatFoodyImages[2])
                .priority(Priority.HIGH)
                 .into(imageview2);
        Glide.with(PriorityActivity.this)
                .load(eatFoodyImages[1])
                .priority(Priority.NORMAL)
                .into(imageview1);
    }
}
