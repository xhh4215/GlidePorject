package com.example.xhh.glideporject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.Target;

import java.io.File;


public class DownloadActivity extends AppCompatActivity {
    private Button button;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        button = (Button) findViewById(R.id.download_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadImageView(imageView);
                loadImage(imageView);
            }
        });
    }

    public void downloadImageView(final View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String url = "http://i.imgur.com/S963yEM.jpg";
                    Context context = getApplicationContext();
                    FutureTarget<File> target = Glide.with(context)
                            .load(url)
                            .downloadOnly(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL);
                    final File file = target.get();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(DownloadActivity.this, "图片的路径为"+file.getPath(), Toast.LENGTH_SHORT).show();

                       }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public void loadImage(View view) {
        String url = "http://i.imgur.com/S963yEM.jpg";
        Glide.with(this)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into((ImageView) view);
    }
}
