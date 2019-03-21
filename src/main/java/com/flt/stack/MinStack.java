/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.stack;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/3/2
 */
public class MinStack {

    private static final int CAPACITY = 100;

    private int capacity;

    private Object[] objects;

    private int min;

    private int top = -1;
    /** initialize your data structure here. */
    public MinStack() {
        this.capacity = CAPACITY;
        this.objects = new Object[capacity];
    }

    public void push(int x) {
        objects[++top] = x;

    }

    public void pop() {
        if (top < 0){
            throw new RuntimeException();
        }
        Object pop = objects[top];
        objects[top--] = null;
    }

    public int top() {
        if (top < 0){
            throw new RuntimeException();
        }
        return (int)objects[top];
    }

    /*public int getMin() {

    }*/
}
