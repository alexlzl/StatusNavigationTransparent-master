package com.cy.statusnavigationtrans;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @ describe 
 * 
 * @author lzl
 *
 * @ time 2019/3/28 17:23
 * 
 * @ param
 * 
 * @ return
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.textview)).setText(getResources().getIdentifier("timg","drawable","com.cy.statusnavigationtrans")+"");

        findViewById(R.id.activity_main).setBackgroundResource(getResources().getIdentifier("timg","drawable","com.cy.statusnavigationtrans"));
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                startAppcompatActivity(Status1Activity.class);
                break;
            case R.id.btn_2:
                startAppcompatActivity(Status2Activity.class);
                break;
            case R.id.btn_3:
                startAppcompatActivity(Status3Activity.class);
                break;
            case R.id.btn_4:
                startAppcompatActivity(Status4Activity.class);
                break;
            case R.id.btn_5:
                startAppcompatActivity(Status5Activity.class);
                break;
            case R.id.btn_6:
                startAppcompatActivity(Status6Activity.class);
                break;
            case R.id.btn_7:
                startAppcompatActivity(Navigation1Activity.class);
                break;
            case R.id.btn_8:
                startAppcompatActivity(Navigation2Activity.class);
                break;
                default:
        }
    }
}
