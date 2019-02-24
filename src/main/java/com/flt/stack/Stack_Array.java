/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.stack;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/2/17
 */
public class Stack_Array implements Stack {

    public static final int CAPACITY = 1024;

    protected int capacity;

    protected Object[] objects;

    protected int top = -1;

    public Stack_Array(){
        this(CAPACITY);
    }

    public Stack_Array(int capacity) {
        this.capacity = capacity;
        objects = new Object[capacity];
    }

    @Override
    public int getSize() {
        return (top + 1);
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public Object top() {
        if (isEmpty()){
            throw new RuntimeException();
        }
        return objects[top];
    }

    @Override
    public void push(Object object) {
        if (getSize() == capacity){
            throw new RuntimeException();
        }
        objects[++top] = object;
    }

    @Override
    public Object pop() {
        if (isEmpty()){
            throw new RuntimeException();
        }
        Object object = objects[top];
        objects[top--] = null;
        return object;
    }
}
