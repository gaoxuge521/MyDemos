package com.yc.mdemos.mydemos.yuanxinghekekongyuanjiao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.beiing.roundimage.CircleImageView;
import com.beiing.roundimage.RoundImageView;
import com.bumptech.glide.Glide;
import com.yc.mdemos.mydemos.R;

public class RoundImageActivity extends AppCompatActivity {
    CircleImageView circleImageViewGlide;

    RoundImageView roundImageViewPicasso;
    RoundImageView roundImageViewXutils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_image);
        circleImageViewGlide = (CircleImageView) findViewById(R.id.circle_image_glide);
        roundImageViewPicasso = (RoundImageView) findViewById(R.id.round_image_picasso);
        roundImageViewXutils = (RoundImageView) findViewById(R.id.round_image_xutils);

        Glide.with(this).load("http://img.ivsky.com/img/tupian/t/201402/17/xiaotiqin-005.jpg").into(circleImageViewGlide);
        Glide.with(this).load("http://img.ivsky.com/img/tupian/t/201402/17/xiaotiqin-008.jpg").into(roundImageViewPicasso);
        Glide.with(this).load("http://img.ivsky.com/img/tupian/t/201402/17/xiaotiqin-010.jpg").into(roundImageViewXutils);

//        Picasso.with(this).load("http://img0.imgtn.bdimg.com/it/u=2263418180,3668836868&fm=206&gp=0.jpg").fit().into(roundImageViewPicasso);
//
//        x.image().bind(roundImageViewXutils, "http://img0.imgtn.bdimg.com/it/u=2263418180,3668836868&fm=206&gp=0.jpg",
//                new ImageOptions.Builder().setCrop(true).build());
    }
}
