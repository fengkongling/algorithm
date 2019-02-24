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
public interface Queue {
    int getSize();

    boolean isEmpty();

    Object front();

    void enqueue(Object object);

    Object dequeue();

    void traversal();
}
