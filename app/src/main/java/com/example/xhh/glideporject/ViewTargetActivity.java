package com.example.xhh.glideporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.xhh.glideporject.view.MyLayout;

public class ViewTargetActivity extends AppCompatActivity {
    private Button button;
    private MyLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_target);
        button = (Button) findViewById(R.id.viewarget_button);
        myLayout = (MyLayout) findViewById(R.id.mylayoutid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://i.imgur.com/S963yEM.jpg";
                Glide.with(ViewTargetActivity.this)
                        .load(url)
                        .preload();
                Glide.with(ViewTargetActivity.this)
                        .load(url)
                        .into(myLayout.getViewTarget());
            }
        });
    }
}
