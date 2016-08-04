package com.ediancha.edcbusiness.activity;


import com.ediancha.edcbusiness.R;
import com.ediancha.edcbusiness.fragment.MapTestFragment;

public class WebViewActivity extends FragmentBaseActivity {

    @Override
    protected void initTitleBar() {
        title_bar.setTvTitleText("正在加载...");
    }

    @Override
    protected void initData() {
        MapTestFragment fragment = MapTestFragment.getInstance(getIntent().getStringExtra("url"));
        fragment.setOnReturnTitleListener(new MapTestFragment.OnReturnTitleListener() {
            @Override
            public void title(String title) {
                title_bar.setTvTitleText(title);
            }
        });
        getSupportFragmentManager().beginTransaction().add(R.id.fg_base, fragment).commit();
    }

    @Override
    protected void initView() {

    }

}
