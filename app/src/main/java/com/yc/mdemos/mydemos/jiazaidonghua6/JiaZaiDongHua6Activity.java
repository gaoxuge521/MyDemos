package com.yc.mdemos.mydemos.jiazaidonghua6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.liangfeizc.RubberIndicator;
import com.yc.mdemos.mydemos.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class JiaZaiDongHua6Activity extends AppCompatActivity {

    @Bind(R.id.rubber)
    RubberIndicator mRubberIndicator;
    @Bind(R.id.moves)
    Button moves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jia_zai_dong_hua6);
        ButterKnife.bind(this);

        mRubberIndicator.setCount(5);
    }

    @OnClick(R.id.moves)
    public void onClick() {
        mRubberIndicator.move();
    }
}
