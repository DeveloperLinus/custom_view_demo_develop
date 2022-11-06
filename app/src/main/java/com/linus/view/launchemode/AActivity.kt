package com.linus.view.launchemode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.linus.view.R
import com.linus.view.utils.log

class AActivity : Activity() {
    private var btnToB: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        btnToB = findViewById(R.id.btn_to_b)
        log("AActivity onCreate")
        btnToB?.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
            intent.putExtra("nanoTime", System.nanoTime())
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        log("AActivity onPause")
    }

    override fun onRestart() {
        super.onRestart()
        log("AActivity onRestart")
    }

    override fun onStart() {
        super.onStart()
        log("AActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        log("AActivity onResume")
    }

    override fun onStop() {
        super.onStop()
        log("AActivity onStop")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        intent?.let {
            val nanoTime = intent.getLongExtra("nanoTime", 0)
            log("nanoTime->$nanoTime")
        }
        log("AActivity onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("AActivity onDestroy")
    }
}