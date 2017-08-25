package com.yc.mdemos.mydemos.EasyRecycleView.loadmore;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.yc.mdemos.mydemos.EasyRecycleView.entites.Person;
import com.yc.mdemos.mydemos.EasyRecycleView.viewholder.PersonViewHolder;

//import com.jude.dome.entites.Person;
//import com.jude.dome.viewholder.PersonViewHolder;

/**
 * Created by Mr.Jude on 2015/7/18.
 */
public class PersonAdapter extends RecyclerArrayAdapter<Person> {
    public PersonAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new PersonViewHolder(parent);
    }
}
