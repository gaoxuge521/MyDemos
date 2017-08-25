package com.yc.mdemos.mydemos.jiazaidonghua2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yc.mdemos.mydemos.MainActivity;
import com.yc.mdemos.mydemos.R;

public class JiaZaiDongHua2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jia_zai_dong_hua2);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JiaZaiDongHua2Activity.this.startActivity(new Intent(JiaZaiDongHua2Activity.this,ViewDemoActivity.class));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JiaZaiDongHua2Activity.this.startActivity(new Intent(JiaZaiDongHua2Activity.this,DialogDemoActivity.class));
            }
        });
    }
}
