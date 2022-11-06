package com.linus.view

import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log

class ShuzhiActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shuzhi)
        Log.d("huqinghui", "ShuzhiActivity onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("huqinghui", "ShuzhiActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("huqinghui", "ShuzhiActivity onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("huqinghui", "ShuzhiActivity onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("huqinghui", "ShuzhiActivity onStop")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("huqinghui", " ShuzhiActivity onConfigurationChanged newConfig")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("huqinghui", "ShuzhiActivity  onDestroy")
    }
}