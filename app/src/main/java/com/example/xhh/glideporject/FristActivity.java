package com.example.xhh.glideporject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FristActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;
    private Button button07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        button01 = (Button) findViewById(R.id.button01);
        button02 = (Button) findViewById(R.id.button02);
        button03 = (Button) findViewById(R.id.button03);
        button04 = (Button) findViewById(R.id.button04);
        button05 = (Button) findViewById(R.id.button05);
        button06 = (Button) findViewById(R.id.button06);
        button07 = (Button) findViewById(R.id.button07);
        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);
        button05.setOnClickListener(this);
        button06.setOnClickListener(this);
        button07.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button01:
                Intent intent = new Intent(FristActivity.this, PictureActivity.class);
                startActivity(intent);
                break;
            case R.id.button02:
                Intent intent1 = new Intent(FristActivity.this, GifActivity.class);
                startActivity(intent1);
                break;
            case R.id.button03:
                Intent intent2 = new Intent(FristActivity.this, ListViewActivity.class);
                startActivity(intent2);
                break;
            case R.id.button04:
                Intent intent4 = new Intent(FristActivity.this, PriorityActivity.class);
                startActivity(intent4);
                break;
            case R.id.button05:
                Intent intent5 = new Intent(FristActivity.this, SimpleActivity.class);
                startActivity(intent5);
                break;
            case R.id.button06:
                Intent intent6 = new Intent(FristActivity.this, ViewTargetActivity.class);
                startActivity(intent6);
                break;
            case R.id.button07:
                Intent intent7 = new Intent(FristActivity.this, DownloadActivity.class);
                startActivity(intent7);
                break;

        }
    }
}
