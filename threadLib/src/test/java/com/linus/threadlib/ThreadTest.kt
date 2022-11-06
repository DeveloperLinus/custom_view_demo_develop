package com.linus.threadlib

import org.junit.Test
import java.util.concurrent.Callable
import java.util.concurrent.FutureTask
import java.util.concurrent.Semaphore

class ThreadTest {

    @Test
    fun testCallable() {
        val callable = Callable<Int> {
            println("执行了耗时操作")
            Thread.sleep(5000)
            10
        }

        val futureTask = FutureTask<Int>(callable)
        println("开始执行线程->${System.nanoTime()}")
        Thread(futureTask).start()
        val value = futureTask.get()
        println("终止执行线程->${System.nanoTime()}")
        println("得到返回值,value->$value->${System.nanoTime()}")
        Thread.sleep(10000)
    }

    @Test
    fun semaphoreTest() {
        val semaphore = Semaphore(3, true)
        val runnableA = Runnable {
            semaphore.acquire()
            println("开始执行耗时操作...")
            Thread.sleep(5000)
            println("执行完耗时操作...")
            semaphore.release()
        }

        println("开始执行线程")
        for (index in 0..10) {
            Thread(runnableA).start()
        }
        println("完成线程创建")
        Thread.sleep(80000)
        println("完成执行线程")
    }


    @Test
    fun testYield() {
         val yieldRunnable = Runnable {
             println("开始执行线程->${Thread.currentThread().name}")
             for (index in 0..5) {
                 if (index == 3) {
                     Thread.yield()
                 }
                 Thread.sleep(500)
                 println("线程->${Thread.currentThread().name},执行完index->$index")
             }
             println("开始完成线程->${Thread.currentThread().name}")
         }

        val threadA = Thread(yieldRunnable, "Thread-A").start()
        val threadB = Thread(yieldRunnable, "Thread-B").start()
        Thread.sleep(20000)
    }
}