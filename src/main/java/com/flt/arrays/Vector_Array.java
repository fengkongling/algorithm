/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.arrays;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/3/10
 */
public class Vector_Array implements Vector {

    private final int N = 1024;
    private int n = 0;

    private Object[] A;

    public Vector_Array() {
        A = new Object[N];
        n = 0;
    }

    @Override
    public int getSize() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return (0 == n) ? true : false;
    }

    @Override
    public Object getAtRank(int r) throws RuntimeException {
        return null;
    }

    @Override
    public Object replaceAtRank(int r, Object obj) throws RuntimeException {
        return null;
    }

    @Override
    public Object insertAtRank(int r, Object obj) throws RuntimeException {
        return null;
    }

    @Override
    public Object removeAtRank(int r) throws RuntimeException {
        return null;
    }
}
