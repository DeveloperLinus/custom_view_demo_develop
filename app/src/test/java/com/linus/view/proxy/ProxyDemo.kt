package com.linus.view.proxy

import org.junit.Test

class ProxyDemo {
    // 主题接口
    interface Subject {
        fun request()
        fun greet()
    }

    class RealSubject : Subject {
        override fun request() {
            println("真实对象request")
        }

        override fun greet() {
            println("真实对象greet")
        }
    }

    class Proxy(var subject: Subject) : Subject {
        override fun request() {
            println("代理对象准备request")
            subject.request()
            println("代理对象结束request")
        }

        override fun greet() {
            println("代理对象准备greet")
            subject.greet()
            println("代理对象结束greet")
        }
    }
    @Test
    fun testStaticProxy() {
        val subject = RealSubject()
        val proxy = Proxy(subject)
        proxy.request()
        proxy.greet()
    }
}