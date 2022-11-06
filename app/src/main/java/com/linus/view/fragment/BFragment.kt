package com.linus.view.fragment

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linus.view.R
import com.linus.view.utils.log

class BFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        log("BFragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("BFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        log("BFragment onCreateView")
        return inflater.inflate(R.layout.b_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        log("BFragment onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        log("BFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        log("BFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        log("BFragment onPause")
    }

    override fun onStop() {
        super.onStop()
        log("BFragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        log("BFragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("BFragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        log("BFragment onDetach")
    }
}