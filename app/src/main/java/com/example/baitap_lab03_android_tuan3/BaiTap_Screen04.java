package com.example.baitap_lab03_android_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class BaiTap_Screen04 extends AppCompatActivity {

    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap__screen04);
        img = findViewById(R.id.img4);
        img.setImageResource(R.drawable.vs_red_a);
    }
}