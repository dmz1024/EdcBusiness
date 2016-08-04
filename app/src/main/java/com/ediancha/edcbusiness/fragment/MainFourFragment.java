package com.ediancha.edcbusiness.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.ediancha.edcbusiness.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFourFragment extends BaseTestFragment {
    TextView tv;

    @Override
    protected void initData() {
        tv.setText("第四个页面");
        setStopRefresh();
    }

    @Override
    protected void initView(View view) {
        tv= (TextView) view.findViewById(R.id.tv);
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
