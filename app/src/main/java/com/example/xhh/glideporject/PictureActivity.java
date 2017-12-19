package com.example.xhh.glideporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class PictureActivity extends AppCompatActivity {
    private Button button;
    private ImageView imageView;
    String internetUrl = "http://i.imgur.com/S963yEM.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonid);
        imageView = (ImageView) findViewById(R.id.imageviewid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide
                        .with(PictureActivity.this)
                        .load(internetUrl)
                        .dontAnimate()//不添加如何效果显示图片
                        .override(1000, 1000)//设置图片的大小
                        //CenterCrop()是一个裁剪技术，即缩放图像让它填充到 ImageView 界限内并且裁剪额外的部分。ImageView 可能会完全填充，但图像可能不会完整显示。
//                        .centerCrop()
                        //fitCenter() 是裁剪技术，即缩放图像让图像都测量出来等于或小于 ImageView 的边界范围。该图像将会完全显示，但可能不会填满整个 ImageView
//                        .fitCenter()
//                        .thumbnail(0.3f)
                        .listener(new RequestListener<String, GlideDrawable>() {
                            //                            加载失败的时候回调的方法
                            @Override
                            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
//                                通过exception来得知具体是什么异常进行修改
                                Toast.makeText(PictureActivity.this, "加载失败" + e, Toast.LENGTH_SHORT).show();
                                return false;
                            }

                            //                         加载成功的时候回调的方法
                            @Override
                            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                Toast.makeText(PictureActivity.this, "加载成功", Toast.LENGTH_SHORT).show();
                                return false;
                            }
                        })
                        .into(imageView);
            }
        });
    }
}
