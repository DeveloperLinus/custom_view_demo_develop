package com.linus.view.liftcycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class LifecycleOwnerActivity() : LifecycleOwner{
    private val mLifecycleRegistry = LifecycleRegistry(this)
    override fun getLifecycle(): Lifecycle {
        return mLifecycleRegistry
    }
}