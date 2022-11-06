package com.linus.view.launchemode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.linus.view.R
import com.linus.view.utils.log

class BActivity : Activity() {
    private var btnToC: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        btnToC = findViewById(R.id.btn_to_c)
        log("BActivity onCreate")
        btnToC?.setOnClickListener {
            startActivity(Intent(this, CActivity::class.java))
        }
    }

    override fun onPause() {
        super.onPause()
        log("BActivity onPause")
    }

    override fun onRestart() {
        super.onRestart()
        log("BActivity onRestart")
    }

    override fun onStart() {
        super.onStart()
        log("BActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        log("BActivity onResume")
    }

    override fun onStop() {
        super.onStop()
        log("BActivity onStop")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        log("BActivity onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("BActivity onDestroy")
    }
}