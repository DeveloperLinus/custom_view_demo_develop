package com.linus.view.fragment

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.linus.view.R
import com.linus.view.utils.log

class AFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        log("AFragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("AFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        log("AFragment onCreateView")
        return inflater.inflate(R.layout.a_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        log("AFragment onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        log("AFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        log("AFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        log("AFragment onPause")
    }

    override fun onStop() {
        super.onStop()
        log("AFragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        log("AFragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("AFragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        log("AFragment onDetach")
    }
}