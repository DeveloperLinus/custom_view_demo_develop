package com.linus.view

import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log

class ShuiPingActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shuiping)
        Log.d("huqinghui", "ShuiPingActivity onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("huqinghui", "ShuiPingActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("huqinghui", "ShuiPingActivity onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("huqinghui", "ShuiPingActivity onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("huqinghui", "ShuiPingActivity onStop")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("huqinghui", " ShuiPingActivity onConfigurationChanged newConfig")
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE) {
            //横向
        } else {
            //竖向
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("huqinghui", "ShuiPingActivity  onDestroy")
    }
}