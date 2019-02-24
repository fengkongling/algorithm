package com.flt.thread;

/**
 * @author fenglingtong
 * @date 2018/6/20
 */
public interface ThreadPool<Job extends Runnable> {

    void excute(Job job);

    void shutDown();

    void addWorkers(int num);

    void removeWorkers(int num);

    int getJobSize();
}
