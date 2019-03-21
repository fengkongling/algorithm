/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.tree;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/3/21
 */
public interface Tree {


    Object getElem();

    Object setElem(Object object);

    TreeLinkedList getParent();

    TreeLinkedList getFirstChild();

    TreeLinkedList getNextSibling();

    int getSize();

    int getHeight();

    int getDepth();
}
