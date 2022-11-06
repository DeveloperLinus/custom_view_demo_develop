package com.linus.view.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    interface Subject {
        void request();
        void greet(String msg);
    }

    class RealSubject implements Subject {
        @Override
        public void request() {
            System.out.println("真实对象request");
        }

        @Override
        public void greet(String msg) {
            System.out.println("真实对象greet->" + msg);
        }
    }

    class ProxyHandler implements InvocationHandler {
        private Subject subject;
        public ProxyHandler(Subject subject) {
            this.subject = subject;
        }
        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            System.out.println("代理对象准备调用");
            Object result =method.invoke(subject, objects);
            System.out.println("代理对象结束调用");
            return result;
        }
    }

    @Test
    public void test() {
        RealSubject realSubject = new RealSubject();
        ProxyHandler handler = new ProxyHandler(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
        subject.request();
        subject.greet("您好  ");
    }
}
