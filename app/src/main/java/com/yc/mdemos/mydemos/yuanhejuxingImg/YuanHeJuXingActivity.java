package com.yc.mdemos.mydemos.yuanhejuxingImg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.yc.mdemos.mydemos.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class YuanHeJuXingActivity extends AppCompatActivity {

    @Bind(R.id.cus_img)
    CustomShapeImageView cusImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuan_he_ju_xing);
        ButterKnife.bind(this);

        Glide.with(this).load("http://img.ivsky.com/img/tupian/t/201402/17/xiaotiqin-005.jpg").into(cusImg);
    }
}
