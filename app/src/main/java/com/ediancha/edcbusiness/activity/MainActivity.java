package com.ediancha.edcbusiness.activity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.ediancha.edcbusiness.R;
import com.ediancha.edcbusiness.entity.TabEntity;
import com.ediancha.edcbusiness.fragment.MainOneFragment;
import com.ediancha.edcbusiness.fragment.MainTwoFragment;
import com.ediancha.edcbusiness.fragment.MainThreeFragment;
import com.ediancha.edcbusiness.fragment.MainFourFragment;
import com.ediancha.edcbusiness.view.NoScrollViewPager;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private String[] mTitles = {"店铺", "会员", "订单", "更多"};
    private int[] mIconUnselectIds = {
            R.mipmap.common_nav_shopstore, R.mipmap.common_nav_vip,
            R.mipmap.common_nav_order, R.mipmap.common_nav_more};
    private int[] mIconSelectIds = {
            R.mipmap.common_nav_shopstore_cur, R.mipmap.common_nav_vip_cur,
            R.mipmap.common_nav_order_cur, R.mipmap.common_nav_more_cur};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private NoScrollViewPager vp_main;
    private List<Fragment> fragments;
    private CommonTabLayout tab_bottom;

    @Override
    protected int getRid() {
        return R.layout.activity_main;
    }

    @Override
    protected void initTitleBar() {
        title_bar.toggleTitleBar(false);
    }


    @Override
    protected void initData() {
        fragments = new ArrayList<>();
        fragments.add(new MainOneFragment());
        fragments.add(new MainTwoFragment());
        fragments.add(new MainThreeFragment());
        fragments.add(new MainFourFragment());
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        tab_bottom.setTabData(mTabEntities);
        tab_bottom.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                vp_main.setCurrentItem(position, false);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

        vp_main.setOffscreenPageLimit(3);
        vp_main.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return 4;
            }
        });
    }


    @Override
    protected void initView() {
        vp_main = getView(R.id.vp_main);
        tab_bottom = getView(R.id.tab_bottom);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finishAll();
    }

}
