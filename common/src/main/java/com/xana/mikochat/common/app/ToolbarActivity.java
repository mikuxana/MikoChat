package com.xana.mikochat.common.app;

import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import com.xana.mikochat.common.R;

public abstract class ToolbarActivity extends Activity {
    protected Toolbar mToolbar;

    @Override
    protected void initWidget() {
        super.initWidget();
        initToolbar(findViewById(R.id.toolbar));
    }

    /**
     * 初始化 Toolbar
     * @param toolbar
     */
    public void initToolbar(Toolbar toolbar) {
        mToolbar = toolbar;
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }
        initTitleNeedBack();
    }

    protected void initTitleNeedBack() {
        // 设置左上角的返回的按钮的实际的返回效果
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
