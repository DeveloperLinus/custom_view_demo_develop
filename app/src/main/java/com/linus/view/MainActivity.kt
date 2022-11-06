package com.linus.view

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : Activity() {
    private var shuzhiBtn:Button? = null
    private var shuipingBtn:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("huqinghui", "MainActivity onCreate")
        shuzhiBtn = findViewById(R.id.shuzhi_btn)
        shuzhiBtn?.setOnClickListener {
            startActivity(Intent(this, ShuzhiActivity::class.java))
        }
        shuipingBtn = findViewById(R.id.shuiping_btn)
        shuipingBtn?.setOnClickListener {
            startActivity(Intent(this, ShuiPingActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("huqinghui", "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("huqinghui", "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("huqinghui", "MainActivity onPause")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d("huqinghui", "MainActivity onConfigurationChanged")
    }

    override fun onStop() {
        super.onStop()
        Log.d("huqinghui", "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("huqinghui", "MainActivity onDestroy")
    }
}