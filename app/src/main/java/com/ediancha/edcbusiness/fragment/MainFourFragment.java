package com.ediancha.edcbusiness.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ediancha.edcbusiness.R;
import com.ediancha.edcbusiness.view.GlideCircleTransform;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFourFragment extends BaseTestFragment {
    private ImageView iv_head;

    @Override
    protected void initData() {
        setStopRefresh();
        Glide.with(getActivity()).load("http://img3.imgtn.bdimg.com/it/u=3981112317,1329694126&fm=206&gp=0.jpg").into(iv_head);

    }

    @Override
    protected void initView(View view) {
        iv_head = (ImageView) view.findViewById(R.id.iv_head);
    }

    @Override
    protected int getViewId() {
        return R.layout.fragment_four;
    }

    @Override
    protected boolean isSetRefreshListener() {
        return false;
    }
}
