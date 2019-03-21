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
public interface Vector {

    int getSize();

    boolean isEmpty();

    Object getAtRank(int r) throws RuntimeException;

    Object replaceAtRank(int r, Object obj) throws RuntimeException;

    Object insertAtRank(int r, Object obj) throws RuntimeException;

    Object removeAtRank(int r) throws RuntimeException;
}
