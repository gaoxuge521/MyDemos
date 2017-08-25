package com.yc.mdemos.mydemos.EasyRecycleView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.yc.mdemos.mydemos.EasyRecycleView.collapsing.CollapsingActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.header.HeaderFooterActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.horizontal.HorizontalActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.insert.InsertActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.loadmore.RefreshAndMoreActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.multistyle.MultiStyleActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.staggeredgrid.StaggeredGridActivity;
import com.yc.mdemos.mydemos.EasyRecycleView.sticky.StickyHeaderActivity;
import com.yc.mdemos.mydemos.R;

public class EasyRecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button refreshAndMore;
        Button multiStyle;
        Button headerAndFooter;
        Button collapsing;
        Button staggeredGrid;
        Button horizontal;
        Button stickyHeader;
        Button insert;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_recycle_view);
        EasyRecyclerView.DEBUG = true;
        refreshAndMore = (Button) findViewById(R.id.refresh_and_more);
        refreshAndMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, RefreshAndMoreActivity.class));
            }
        });
        multiStyle = (Button) findViewById(R.id.multi_style);
        multiStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, MultiStyleActivity.class));
            }
        });
        headerAndFooter = (Button) findViewById(R.id.header_footer);
        headerAndFooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, HeaderFooterActivity.class));
            }
        });
        collapsing = (Button) findViewById(R.id.collapsing);
        collapsing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, CollapsingActivity.class));
            }
        });
        staggeredGrid = (Button) findViewById(R.id.staggered_grid);
        staggeredGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, StaggeredGridActivity.class));
            }
        });
        horizontal = (Button) findViewById(R.id.horizontal);
        horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, HorizontalActivity.class));
            }
        });  stickyHeader = (Button) findViewById(R.id.stiky_header);
        stickyHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, StickyHeaderActivity.class));
            }
        });
        insert = (Button) findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EasyRecycleViewActivity.this, InsertActivity.class));
            }
        });
    }
}

