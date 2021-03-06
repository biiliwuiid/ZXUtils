package com.stanny.demo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.stanny.demo.R;
import com.zx.zxutils.util.ZXAnimUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationTestActivity extends BaseActivity {

    @BindView(R.id.btn_openAnimTest)
    ImageView btnOpenAnimTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_test);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_test_rotateAnim, R.id.btn_test_alpha1Anim, R.id.btn_test_alpha2Anim, R.id.btn_test_lessAnim, R.id.btn_test_amplAnim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_test_rotateAnim:
                btnOpenAnimTest.startAnimation(ZXAnimUtil.getRotateAnimationByCenter(2000, null));
                break;
            case R.id.btn_test_alpha1Anim:
                btnOpenAnimTest.startAnimation(ZXAnimUtil.getAlphaAnimation(0.0f, 1.0f, 2000, null));
                break;
            case R.id.btn_test_alpha2Anim:
                btnOpenAnimTest.startAnimation(ZXAnimUtil.getHiddenAlphaAnimation(2000, null));
                break;
            case R.id.btn_test_lessAnim:
                btnOpenAnimTest.startAnimation(ZXAnimUtil.getLessenScaleAnimation(2000, null));
                break;
            case R.id.btn_test_amplAnim:
                btnOpenAnimTest.startAnimation(ZXAnimUtil.getAmplificationAnimation(2000, null));
                break;
        }
    }
}
