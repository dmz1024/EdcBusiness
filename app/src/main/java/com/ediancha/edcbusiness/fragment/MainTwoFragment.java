package com.ediancha.edcbusiness.fragment;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.ediancha.edcbusiness.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainTwoFragment extends BaseTestFragment {
    private View view_search;
    private VipMemberFragment vipMemberFragment;

    @Override
    protected void initData() {
        setStopRefresh();
        getChildFragmentManager().beginTransaction().replace(R.id.fg, vipMemberFragment = new VipMemberFragment()).commit();
    }

    @Override
    protected void initView(View view) {
        view_search = view.findViewById(R.id.view_search);
    }

    @Override
    protected int getViewId() {
        return R.layout.fragment_two;
    }

    @Override
    protected boolean isSetRefreshListener() {
        return false;
    }
}
