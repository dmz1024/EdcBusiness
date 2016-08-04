package com.ediancha.edcbusiness.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ediancha.edcbusiness.R;
import com.ediancha.edcbusiness.entity.VipMember;
import com.ediancha.edcbusiness.view.Color2Text;

import java.util.List;

/**
 * Created by dengmingzhi on 16/8/4.
 */
public class VipmemberAdapter extends ListBaseAdapter<VipMember.Data, VipmemberAdapter.VipMemberHolder> {


    public VipmemberAdapter(List<VipMember.Data> list) {
        super(list);
    }

    public VipmemberAdapter(List<VipMember.Data> list, Context ctx) {
        super(list, ctx);
    }

    @Override
    protected void bindHolder(VipMemberHolder holder, int position) {

    }

    @Override
    protected int getViewRid() {
        return R.layout.item_vip_member;
    }

    @Override
    public VipMemberHolder getViewHolder(View view) {
        return new VipMemberHolder(view);
    }

    public class VipMemberHolder extends RecyclerView.ViewHolder {
        public Color2Text tv_nick;
        public TextView tv_money;
        public TextView tv_money_1;
        public TextView tv_integral;
        public Button bt_vip;

        public VipMemberHolder(View itemView) {
            super(itemView);
            tv_nick = (Color2Text) itemView.findViewById(R.id.tv_nick);
            tv_money = (TextView) itemView.findViewById(R.id.tv_money);
            tv_money_1 = (TextView) itemView.findViewById(R.id.tv_money_1);
            tv_integral = (TextView) itemView.findViewById(R.id.tv_integral);
            bt_vip = (Button) itemView.findViewById(R.id.bt_vip);
        }
    }
}
