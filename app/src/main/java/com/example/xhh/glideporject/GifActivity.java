package com.example.xhh.glideporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GifActivity extends AppCompatActivity {
    private Button button;
    private ImageView imageView;
    String gifUrl = "http://i.kinja-img.com/gawker-media/image/upload/s--B7tUiM5l--/gf2r69yorbdesguga10i.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        button = (Button) findViewById(R.id.gif_buttonid);
        imageView = (ImageView) findViewById(R.id.gif_imageviewid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(GifActivity.this)
                        .load(gifUrl)
                        .error(R.mipmap.ic_launcher_round)
                        .into(imageView);
            }
        });
    }
}
