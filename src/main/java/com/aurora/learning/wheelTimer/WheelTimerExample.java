package com.aurora.learning.wheelTimer;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WheelTimerExample {
    public static void test1() {
        HashedWheelTimer timer = new HashedWheelTimer();

        TimerTask task = timeout -> System.out.println("周期性任务执行！");

        // 安排任务每 3 秒执行一次
        timer.newTimeout(task, 3, java.util.concurrent.TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test2() {
        HashedWheelTimer timer = new HashedWheelTimer(Executors.defaultThreadFactory(), 100, TimeUnit.MILLISECONDS, 32);

        TimerTask task = timeout -> System.out.println("周期性任务执行！");

        // 安排任务每 3 秒执行一次
        timer.newTimeout(task, 1000, java.util.concurrent.TimeUnit.MILLISECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}