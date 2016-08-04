package com.ediancha.edcbusiness.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ediancha.edcbusiness.R;
import com.ediancha.edcbusiness.view.Color2Text;
import com.ediancha.edcbusiness.view.GlideCircleTransform;
import com.ediancha.edcbusiness.view.TextImage;

/**
 */
public class MainOneFragment extends BaseTestFragment {
    private ImageView iv_head;
    private TextView tv_title;
    private TextView tv_money;
    private Color2Text tv_shop;
    private Color2Text tv_seat;
    private Color2Text tv_ch;
    private TextImage tv_1;
    private TextImage tv_2;
    private TextImage tv_3;
    private TextImage tv_4;
    private TextImage tv_5;
    private TextImage tv_6;
    private View view_msg;

    @Override
    protected void initData() {
        setStopRefresh();
        Glide.with(getActivity()).load("http://img3.imgtn.bdimg.com/it/u=3981112317,1329694126&fm=206&gp=0.jpg")
                .transform(new GlideCircleTransform(getActivity()))
                .into(iv_head);

    }

    @Override
    protected void initView(View view) {
        iv_head = (ImageView) view.findViewById(R.id.iv_head);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        tv_money = (TextView) view.findViewById(R.id.tv_money);
        tv_shop = (Color2Text) view.findViewById(R.id.tv_shop);
        tv_seat = (Color2Text) view.findViewById(R.id.tv_seat);
        tv_ch = (Color2Text) view.findViewById(R.id.tv_ch);
        tv_1 = (TextImage) view.findViewById(R.id.tv_1);
        tv_2 = (TextImage) view.findViewById(R.id.tv_2);
        tv_3 = (TextImage) view.findViewById(R.id.tv_3);
        tv_4 = (TextImage) view.findViewById(R.id.tv_4);
        tv_5 = (TextImage) view.findViewById(R.id.tv_5);
        tv_6 = (TextImage) view.findViewById(R.id.tv_6);
        view_msg = view.findViewById(R.id.view_msg);

        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        tv_3.setOnClickListener(this);
        tv_4.setOnClickListener(this);
        tv_5.setOnClickListener(this);
        tv_6.setOnClickListener(this);
        view_msg.setOnClickListener(this);

    }

    @Override
    protected int getViewId() {
        return R.layout.fragment_one;
    }

    @Override
    protected boolean isFirstInitData() {
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_1:
                break;
            case R.id.tv_2:
                break;
            case R.id.tv_3:
                break;
            case R.id.tv_4:
                break;
            case R.id.tv_5:
                break;
            case R.id.tv_6:
                break;
            case R.id.view_msg:
                break;
        }
    }
}
