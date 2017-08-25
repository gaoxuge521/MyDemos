package com.yc.mdemos.mydemos.fangmeituanpaowuxiandonghua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yc.mdemos.mydemos.MainActivity;
import com.yc.mdemos.mydemos.R;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MeiTuanActivity extends AppCompatActivity {
    private RecyclerView mRv;
    List<Integer> mList;
    private ImageView mCart;
    private RelativeLayout mRl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mei_tuan);
        mRl = (RelativeLayout) findViewById(R.id.rl);
        mRv = (RecyclerView) findViewById(R.id.rv);
        mCart = (ImageView) findViewById(R.id.cart);
        mList = new ArrayList<>();
        mList.add(R.mipmap.icon1);
        mList.add(R.mipmap.icon2);
        mList.add(R.mipmap.icon3);
        mList.add(R.mipmap.icon1);
        mList.add(R.mipmap.icon2);
        mList.add(R.mipmap.icon3);
        mList.add(R.mipmap.icon1);
        mList.add(R.mipmap.icon2);
        mList.add(R.mipmap.icon3);
        mList.add(R.mipmap.icon1);
        mList.add(R.mipmap.icon2);
        mList.add(R.mipmap.icon3);
        CommonAdapter<Integer> mAdapter = new CommonAdapter<Integer>(this, R.layout.meituan_item, mList) {
            @Override
            protected void convert(ViewHolder holder, Integer integer, int position) {
                holder.setImageResource(R.id.iv,integer);
                final ImageView imageView = holder.getView(R.id.iv);
                TextView view = holder.getView(R.id.buy);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AddCartAnimation.AddToCart(imageView,mCart,MeiTuanActivity.this,mRl,1);
                    }
                });
            }
        };
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(mAdapter);
    }
}
