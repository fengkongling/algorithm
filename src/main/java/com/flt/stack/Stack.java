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
public interface Stack {
    int getSize();

    boolean isEmpty();

    Object top();

    void push(Object object);

    Object pop();
}
