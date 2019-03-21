/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/3/1
 */
public class TwinsLockTest {

    public void test(){
        final Lock lock = new ReentrantLock();

        class Worker extends Thread {

            @Override
            public void run(){
                while(true){
//                    lock.lock();
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch (Exception e){

                    } finally {
                        lock.unlock();
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++){
            Worker worker = new Worker();
//            worker.setDaemon(true);
            worker.start();
        }


    }

    public static void main(String[] args) {
        TwinsLockTest twinsLockTest = new TwinsLockTest();
        twinsLockTest.test();
    }
}
