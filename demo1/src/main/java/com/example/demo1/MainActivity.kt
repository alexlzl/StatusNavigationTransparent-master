package com.example.demo1

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 *  设置状态栏透明
 *  设置布局全屏
 *  设置fitsSystemWindows为true
 *  PS：如果背景的顶部是白色，可能使用沉浸式statusBar的时候，statusBar中的图标可能会看不清楚，
 *  所以在设置布局全屏的时候需要设置statusBar是LIGHT_STATUS_BAR
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = resources.getColor(android.R.color.transparent)
        }

    }
}
