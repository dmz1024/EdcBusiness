package com.ediancha.edcbusiness.fragment;

import android.content.Context;

import com.ediancha.edcbusiness.adapter.VipmemberAdapter;
import com.ediancha.edcbusiness.entity.VipMember;

import java.util.List;
import java.util.Map;

/**
 * Created by dengmingzhi on 16/8/4.
 */
public class VipMemberFragment extends ListDataBaseFragment<VipMember, VipMember.Data, VipmemberAdapter> {
    @Override
    protected VipmemberAdapter getAdapter(Context context, List<VipMember.Data> totalList) {
        return new VipmemberAdapter(totalList, context);
    }

    @Override
    protected Class<VipMember> getTClass() {
        return VipMember.class;
    }

    @Override
    protected String getUrl() {
        return "";
    }

    @Override
    protected Map<String, String> getMap(Map<String, String> map) {
        return map;
    }
}
