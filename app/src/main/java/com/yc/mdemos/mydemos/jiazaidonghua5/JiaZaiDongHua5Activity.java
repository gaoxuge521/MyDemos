package com.yc.mdemos.mydemos.jiazaidonghua5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.yc.mdemos.mydemos.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class JiaZaiDongHua5Activity extends AppCompatActivity {

    @Bind(R.id.metaball)
    MetaballView metaballView;
    @Bind(R.id.action_fill)
    Button actionFill;
    @Bind(R.id.action_strock)
    Button actionStrock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jia_zai_dong_hua5);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.action_fill, R.id.action_strock})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.action_fill:
                metaballView.setPaintMode(1);
                break;
            case R.id.action_strock:
                metaballView.setPaintMode(0);
                break;
        }
    }
}
