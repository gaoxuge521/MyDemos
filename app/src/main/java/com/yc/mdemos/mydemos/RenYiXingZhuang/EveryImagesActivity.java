package com.yc.mdemos.mydemos.RenYiXingZhuang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yc.mdemos.mydemos.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.fanrunqi.avatarimageviewlibrary.AvatarImageView;

public class EveryImagesActivity extends AppCompatActivity {

    @Bind(R.id.imgview)
    AvatarImageView imgview;
    @Bind(R.id.img)
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 可以自己找些中间白色四周透明的图片当背景
         * http://iconfont.cn/plus/search/index?q=圆形
         */
        setContentView(R.layout.activity_every_images);
        ButterKnife.bind(this);


        Glide.with(this).load("http://img.ivsky.com/img/tupian/t/201402/17/xiaotiqin-008.jpg").into(imgview);
    }
}
