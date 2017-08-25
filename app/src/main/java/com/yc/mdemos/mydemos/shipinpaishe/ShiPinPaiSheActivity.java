package com.yc.mdemos.mydemos.shipinpaishe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yc.mdemos.mydemos.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShiPinPaiSheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shi_pin_pai_she);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.recordBTN)
    public void onClick() {
        Intent intent = new Intent(this, RecordActivity.class);
        startActivity(intent);
    }
}

