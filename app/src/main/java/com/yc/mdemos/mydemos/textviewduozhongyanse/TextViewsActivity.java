package com.yc.mdemos.mydemos.textviewduozhongyanse;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.yc.mdemos.mydemos.R;

import java.util.ArrayList;

public class TextViewsActivity extends AppCompatActivity implements ClickListener {
    private TextView textView1;
    private ArrayList<String> str_list;
    private ArrayList<Integer> color_list;
    private ArrayList<Float> text_size_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_views);
        initView();
        setData();
    }

    private void initView() {
        textView1 = (TextView) findViewById(R.id.textView1);

    }

    private void setData() {
        str_list = new ArrayList<String>();
        color_list = new ArrayList<Integer>();
        text_size_list = new ArrayList<Float>();
        str_list.add("今天");
        str_list.add("天气");
        str_list.add("还不错！");
        color_list.add(Color.RED);
        color_list.add(Color.GREEN);
        color_list.add(Color.BLUE);
        text_size_list.add(15f);
        text_size_list.add(17f);
        text_size_list.add(20f);
        Util.setText(this, textView1, str_list, color_list, text_size_list,
                this);
    }

    @Override
    public void click(int position) {
        Log.e("position", position + "");
        Toast.makeText(this, str_list.get(position), Toast.LENGTH_SHORT).show();

    }
}

