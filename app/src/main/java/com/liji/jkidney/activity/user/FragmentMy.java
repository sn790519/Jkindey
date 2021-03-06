package com.liji.jkidney.activity.user;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.liji.dev.androidutils.utils.PictureSelectDialog.PictureSelectPop;
import com.liji.jkidney.R;
import com.liji.jkidney.activity.ActSetting;
import com.liji.jkidney.activity.message.ActMessage;
import com.liji.jkidney.activity.user.account.ActPasswordRest;
import com.liji.jkidney.activity.user.account.ActUserInfoUpdate;
import com.liji.jkidney.activity.user.post.ActMyPost;
import com.liji.jkidney.fragment.FragmentBase;
import com.liji.jkidney.model.user.MyUser;
import com.liji.jkidney.utils.HttpCallback;
import com.liji.jkidney.utils.JHttpUtils;
import com.liji.jkidney.utils.JLogUtils;
import com.liji.jkidney.utils.JToastUtils;
import com.liji.jkidney.widget.CustomeHeadView;
import com.liji.jkidney.widget.RoundImageView;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.UpdateListener;

public class FragmentMy extends FragmentBase {

    @ViewInject(R.id.headview)
    CustomeHeadView headView;

    @ViewInject(R.id.item_head_ico)
    RoundImageView roundImageView;

    @ViewInject(R.id.item_ll_setting)
    LinearLayout item_ll_setting;
    @ViewInject(R.id.item_tv_nickname)
    TextView itemTvNickname;
    @ViewInject(R.id.item_tv_sign)
    TextView itemTvSign;

    //登录后item
    @ViewInject(R.id.item_rl_logined)
    RelativeLayout loginedView;

    //未登录item
    @ViewInject(R.id.item_ll_logout)
    LinearLayout loginoutView;


    @ViewInject(R.id.ll_account)
    LinearLayout ll_account;

    @ViewInject(R.id.item_ll_account)
    LinearLayout item_ll_account;

    @ViewInject(R.id.item_ll_post)
    LinearLayout item_ll_post;

    @ViewInject(R.id.item_ll_message)
    LinearLayout item_ll_message;


    @ViewInject(R.id.item_head_bg)
    RelativeLayout itemHeadBg;

    //登录成功后整体item
    @ViewInject(R.id.item_ll_logout)
    LinearLayout ll_info;

    MyUser userLocal = new MyUser();

    public FragmentMy() {

    }

    @Override
    public View getOnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my, container, false);
        x.view().inject(this, view);

        headView.setTitle(getResources().getString(R.string.fragment_my));
        headView.setBackgroundColor(getResources().getColor(R.color.color_tab_my));
        initView();

        item_ll_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startActivity(new Intent(getContext(), ActSetting.class));
            }
        });

        item_ll_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startActivity(new Intent(getContext(), ActMyPost.class));
            }
        });

        item_ll_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startActivity(new Intent(getContext(), ActMessage.class));
            }
        });

        roundImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PictureSelectPop pictureSelectPop = new PictureSelectPop(getContext(), new com.liji.dev.androidutils.utils.citypickerWheelView.widget.XCallbackListener() {
                    @Override
                    protected void callback(Object... obj) {
                        String file = ((String) obj[0]).substring(7, ((String) obj[0]).length());
                        JHttpUtils.requset(getContext(), file, new HttpCallback() {
                            @Override
                            public void success(String result) {
                                JLogUtils.D("request: " + result);
                                ImageLoader.getInstance().displayImage(result, roundImageView);
                                updateUserInfo(result);
                            }


                            @Override
                            public void failure(String message) {
                                JToastUtils.showToast(getContext(), "" + message);

                            }
                        });

                    }
                });
                pictureSelectPop.show();

            }
        });
        return view;
    }

    private void initView() {
        userLocal = BmobUser.getCurrentUser(getContext(), MyUser.class);
        if (userLocal == null) {
            ll_account.setVisibility(View.GONE);
            loginedView.setVisibility(View.GONE);
            loginoutView.setVisibility(View.VISIBLE);
            //跳转登录
            ll_info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), ActLogin.class));
                }
            });

        } else {
            ll_account.setVisibility(View.VISIBLE);
            loginedView.setVisibility(View.VISIBLE);
            loginoutView.setVisibility(View.GONE);
            JLogUtils.D("headImg: " + userLocal.getHeadimg());
            if (!TextUtils.isEmpty(userLocal.getHeadimg())) {
                ImageLoader.getInstance().displayImage(userLocal.getHeadimg(), roundImageView);
            }
            itemTvNickname.setText(userLocal.getNickname());
            itemTvSign.setText(userLocal.getInfo());


            //跳转修改个人信息
            item_ll_account.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), ActUserInfoUpdate.class));
                }
            });

            //跳转修改个人信息
            loginedView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getContext().startActivity(new Intent(getContext(), ActUserInfoUpdate.class));
                }
            });


        }
    }

    /**
     * 保存用户头像
     *
     * @param result
     */
    private void updateUserInfo(String result) {
        MyUser user = new MyUser();
        user.setHeadimg(result);
        user.update(getContext(), userLocal.getObjectId(), new UpdateListener() {
            @Override
            public void onSuccess() {
                JToastUtils.showToast(getContext(), "上传成功");
            }

            @Override
            public void onFailure(int i, String s) {
                JToastUtils.showToast(getContext(), "上传失败： " + s);

            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        initView();
    }
}
