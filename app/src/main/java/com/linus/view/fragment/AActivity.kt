package com.linus.view.fragment

import android.app.Activity
import android.os.Bundle
import com.linus.view.R
import com.linus.view.utils.log

class AActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_activity)
        log("AActivity onCreate")
    }

    override fun onStart() {
        super.onStart()
        log("AActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        log("AActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        log("AActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        log("AActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("AActivity onDestroy")
    }
}