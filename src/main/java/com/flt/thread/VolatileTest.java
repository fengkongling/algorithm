/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.thread;

import java.util.Set;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/3/7
 */
public class VolatileTest {
    public static volatile int race = 0;

    public static void increase(){
        race += 1;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1){
            Thread.yield();
//            Thread.currentThread().getThreadGroup().list();

            Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
            for (Thread thread : threadSet){

                System.out.println(thread.getName());
            }
            System.out.println(Thread.activeCount());
        }
        System.out.println(race);
    }
}
