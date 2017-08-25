package com.yc.mdemos.mydemos.mojiXiaxuedonghua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yc.mdemos.mydemos.R;

public class MoJiXiaXueActivity extends AppCompatActivity {

    //修改背景图片在RenderThread
    // scene.setBg(BitmapFactory.decodeResource(context.getResources(), R.drawable.bg_snow_night));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ji_xia_xue);
    }
}
