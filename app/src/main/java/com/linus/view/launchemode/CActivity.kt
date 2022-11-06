package com.linus.view.launchemode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.linus.view.R
import com.linus.view.utils.log

class CActivity : Activity() {
    private var btnToA: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        btnToA = findViewById(R.id.btn_to_a)
        log("CActivity onCreate")
        btnToA?.setOnClickListener {
//            startActivity(Intent(this, AActivity::class.java))
            log("CActivity click Listener")
        }
        Thread.sleep(20000)
    }

    override fun onPause() {
        super.onPause()
        log("CActivity onPause")
    }

    override fun onStart() {
        super.onStart()
        log("CActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        log("CActivity onResume")
    }

    override fun onStop() {
        super.onStop()
        log("CActivity onStop")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        log("CActivity onNewIntent")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("CActivity onDestroy")
    }
}