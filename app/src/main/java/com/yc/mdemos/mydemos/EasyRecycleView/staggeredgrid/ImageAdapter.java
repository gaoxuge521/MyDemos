package com.yc.mdemos.mydemos.EasyRecycleView.staggeredgrid;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.yc.mdemos.mydemos.EasyRecycleView.entites.Picture;
import com.yc.mdemos.mydemos.EasyRecycleView.viewholder.ImageViewHolder;

//import com.jude.dome.entites.Picture;
//import com.jude.dome.viewholder.ImageViewHolder;

/**
 * Created by Mr.Jude on 2016/6/7.
 */
public class ImageAdapter extends RecyclerArrayAdapter<Picture> {
    public ImageAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageViewHolder(parent);
    }
}
