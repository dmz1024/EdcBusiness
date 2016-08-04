package com.ediancha.edcbusiness.fragment;

import android.view.View;
import android.widget.TextView;

import com.ediancha.edcbusiness.R;


/**
 */
public class MainThreeFragment extends BaseTestFragment {
    TextView tv;

    @Override
    protected void initData() {
        tv.setText("第三个页面");
        setStopRefresh();
    }

    @Override
    protected void initView(View view) {
        tv= (TextView) view.findViewById(R.id.tv);
    }

    @Override
    protected int getViewId() {
        return R.layout.fragment_three;
    }

    @Override
    protected boolean isSetRefreshListener() {
        return false;
    }
}
