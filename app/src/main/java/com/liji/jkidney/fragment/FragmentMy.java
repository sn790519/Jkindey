package com.liji.jkidney.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.liji.jkidney.R;
import com.liji.jkidney.activity.ActSetting;
import com.liji.jkidney.activity.user.ActLogin;
import com.liji.jkidney.model.user.MyUser;
import com.liji.jkidney.utils.XCallbackListener;
import com.liji.jkidney.widget.CustomeHeadView;
import com.liji.jkidney.widget.RoundImageView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import cn.bmob.v3.BmobUser;

public class FragmentMy extends FragmentBase {

    @ViewInject(R.id.headview)
    CustomeHeadView headView;

    @ViewInject(R.id.item_head_ico)
    RoundImageView roundImageView;

    @ViewInject(R.id.item_ll_setting)
    LinearLayout item_ll_setting;

    @ViewInject(R.id.item_ll_fav)
    LinearLayout item_ll_fav;
    @ViewInject(R.id.item_tv_nickname)
    TextView itemTvNickname;
    @ViewInject(R.id.item_tv_sign)
    TextView itemTvSign;
    @ViewInject(R.id.item_ll_login_info)
    LinearLayout itemLlLoginInfo;
    @ViewInject(R.id.ll_info)
    LinearLayout llInfo;
    @ViewInject(R.id.item_head_bg)
    RelativeLayout itemHeadBg;
    @ViewInject(R.id.ll_function)
    LinearLayout llFunction;
    @ViewInject(R.id.item_ll_login)
    LinearLayout itemLlLogin;


    public FragmentMy() {

    }

    @Override
    public View getOnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my, container, false);
        x.view().inject(this, view);

        headView.setTitle("我的");
        headView.setRightImgAction(R.drawable.my_edit_selector, new XCallbackListener() {
            @Override
            protected void callback(Object... obj) {
                Toast.makeText(getContext(), "editting", Toast.LENGTH_SHORT).show();
            }
        });

        initView();

        item_ll_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "fav", Toast.LENGTH_SHORT).show();
            }
        });

        item_ll_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startActivity(new Intent(getContext(), ActSetting.class));
            }
        });

        return view;
    }

    private void initView() {
        MyUser user = BmobUser.getCurrentUser(getContext(), MyUser.class);
        if (user == null) {
            llInfo.setVisibility(View.GONE);
            itemLlLogin.setVisibility(View.VISIBLE);
            itemLlLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), ActLogin.class));
                }
            });

        } else {
            llInfo.setVisibility(View.VISIBLE);
            itemLlLogin.setVisibility(View.GONE);
            itemTvNickname.setText(user.getUsername());
            itemTvSign.setText(user.getInfo());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        initView();
    }
}
