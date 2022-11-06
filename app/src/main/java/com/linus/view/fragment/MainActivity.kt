package com.linus.view.fragment

import android.app.Activity
import android.app.FragmentManager
import android.os.Bundle
import android.widget.Button
import com.linus.view.R
import com.linus.view.utils.log

class MainActivity : Activity() {
    private lateinit var btnA: Button
    private lateinit var btnB: Button
    private lateinit var manager:FragmentManager
    private lateinit var aFragment: AFragment
    private lateinit var bFragment: BFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        log("MainActivity onCreate")
        btnA = findViewById(R.id.btn_a_fragment)
        btnB = findViewById(R.id.btn_b_fragment)
        aFragment = AFragment()
        bFragment = BFragment()
        manager = fragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.my_fragment, aFragment).commit()
        btnA.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.my_fragment, aFragment).commit()
        }
        btnB.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.my_fragment, bFragment).commit()
        }
    }

    override fun onStart() {
        super.onStart()
        log("MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        log("MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        log("MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        log("MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("MainActivity onDestroy")
    }
}

// 10-25 10:21:28.773 14773-14773/com.linus.view D/huqinghui: MainActivity onCreate
//10-25 10:21:28.774 14773-14773/com.linus.view D/huqinghui: AFragment onAttach
//10-25 10:21:28.774 14773-14773/com.linus.view D/huqinghui: AFragment onCreate
//10-25 10:21:28.774 14773-14773/com.linus.view D/huqinghui: AFragment onCreateView
//10-25 10:21:28.775 14773-14773/com.linus.view D/huqinghui: AFragment onActivityCreated
//10-25 10:21:28.775 14773-14773/com.linus.view D/huqinghui: MainActivity onStart
//10-25 10:21:28.775 14773-14773/com.linus.view D/huqinghui: AFragment onStart
//10-25 10:21:28.775 14773-14773/com.linus.view D/huqinghui: MainActivity onResume
//10-25 10:21:28.775 14773-14773/com.linus.view D/huqinghui: AFragment onResume
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: AFragment onPause
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: AFragment onStop
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: AFragment onDestroyView
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: AFragment onDestroy
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: AFragment onDetach
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: BFragment onAttach
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: BFragment onCreate
//10-25 10:21:33.067 14773-14773/com.linus.view D/huqinghui: BFragment onCreateView
//10-25 10:21:33.068 14773-14773/com.linus.view D/huqinghui: BFragment onActivityCreated
//10-25 10:21:33.068 14773-14773/com.linus.view D/huqinghui: BFragment onStart
//10-25 10:21:33.068 14773-14773/com.linus.view D/huqinghui: BFragment onResume