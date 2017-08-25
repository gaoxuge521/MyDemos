package com.yc.mdemos.mydemos.jiazaidonghua7;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JiaZaiDongHua7Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        adapter.add("RotateLoading");
        adapter.add("BookLoading");
        adapter.add("NewtonCradleLoading");
        setListAdapter(adapter);
    }
        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            Class<?> activity = null;
            super.onListItemClick(l, v, position, id);
            switch (position) {
                case 0:
                    activity = RotateActivity.class;
                    break;
                case 1:
                    activity = BookActivity.class;
                    break;
                case 2:
                    activity = NewtonCradleActivity.class;
                    break;
            }
            if (null != activity) {
                Intent intent = new Intent(this, activity);
                startActivity(intent);
            }
        }
    }
