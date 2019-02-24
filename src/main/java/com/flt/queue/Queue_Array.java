/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.queue;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/2/24
 */
public class Queue_Array implements Queue {

    public static final int CAPACITY = 1000;

    protected int capacity;

    protected Object[] Q;

    protected int f = 0;
    protected int r = 0;

    public Queue_Array() {
        this(CAPACITY);
    }

    public Queue_Array(int capacity) {
        this.capacity = capacity;
        this.Q = new Object[capacity];
    }

    @Override
    public int getSize() {
        return (this.capacity - f + r) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return (f == r);
    }

    @Override
    public Object front() {
        return null;
    }

    @Override
    public void enqueue(Object object) {
        if (getSize() == capacity -1){
            throw new RuntimeException();
        }
        Q[r] = object;
        r = (r + 1) % capacity;
    }

    @Override
    public Object dequeue() {
        Object elem;
        if (isEmpty()){
            throw new RuntimeException();
        }
        elem = Q[f];
        Q[f] = null;
        f = (f + 1) % capacity;
        return elem;
    }

    @Override
    public void traversal() {
        for (int i = f; i<r; i++){
            System.out.print(Q[i]+" ");
        }
    }
}
