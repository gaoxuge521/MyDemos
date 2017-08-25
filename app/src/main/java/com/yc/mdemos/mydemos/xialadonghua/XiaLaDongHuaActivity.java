package com.yc.mdemos.mydemos.xialadonghua;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.cjj.library.HaoKanRefreshLayout;
import com.github.cjj.library.listener.OnRefreshListener;
import com.yc.mdemos.mydemos.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class XiaLaDongHuaActivity extends AppCompatActivity {

    @Bind(R.id.lv_xiala)
    ListView lvXiala;
    List<String> list = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xia_la_dong_hua);
        ButterKnife.bind(this);
        final HaoKanRefreshLayout haoKanRefreshLayout = (HaoKanRefreshLayout) findViewById(R.id.haokan_refresh);
        initData();
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,list);
        lvXiala.setAdapter(adapter);
        haoKanRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        haoKanRefreshLayout.setRefreshing(false);
                        list.add("添加商品"+pos);
                        pos++;
                        adapter.notifyDataSetChanged();
                    }
                }, 3000);
            }
        });

        haoKanRefreshLayout.setRefreshing(true);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                haoKanRefreshLayout.setRefreshing(false);
            }
        }, 3000);

        haoKanRefreshLayout.setWaveBackgroundColor(Color.parseColor("#19191b"));
    }

    private void initData() {
        for (int i  = 0;i<20;i++){
            list.add("商品"+i);
            pos = i;
        }
    }
}
