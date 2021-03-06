package com.ediancha.edcbusiness.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andview.refreshview.recyclerview.BaseRecyclerAdapter;
import com.ediancha.edcbusiness.entity.Data;
import com.ediancha.edcbusiness.util.Util;


import java.util.List;

/**
 * Created by dengmingzhi on 16/6/21.
 */
public abstract class ListBaseAdapter<T extends Data, A extends RecyclerView.ViewHolder> extends BaseRecyclerAdapter<A> {
    protected List<T> list;
    protected Context ctx;

    public ListBaseAdapter(List<T> list) {
        this.list = list;
    }

    public ListBaseAdapter(List<T> list,Context ctx) {
        this.list = list;
        this.ctx = ctx;
    }

    protected abstract void bindHolder(A holder, int position);


    @Override
    public A onCreateViewHolder(ViewGroup parent, int viewType, boolean isItem) {
        View view = LayoutInflater.from(Util.getApplication()).inflate(getViewRid(), parent, false);
        return getViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final A holder, final int position, boolean isItem) {
        bindHolder(holder, position);
    }


    @Override
    public int getAdapterItemCount() {
        return list.size();
    }

    @Override
    public int getAdapterItemViewType(int position) {
        return 0;
    }

    protected abstract int getViewRid();

}
