package com.cy.statusnavigationtrans;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cy.translucentparent.StatusNavUtils;


/**
 * @ describe 
 * 
 * @author lzl
 *
 * @ time 2019/3/28 16:38
 * 
 * @ param
 * 
 * @ return
 */


public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StatusNavUtils.setStatusBarColor(this,android.R.color.holo_red_dark);
    }
    public void startAppcompatActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }


}
