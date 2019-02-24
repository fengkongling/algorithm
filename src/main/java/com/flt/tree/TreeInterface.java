package com.flt.tree;

/**
 * @author fenglingtong
 * @date 2018/6/4
 */
public interface TreeInterface<T> {

    T getRootData();

    int getHeight();

    int getNumberOfNodes();

    boolean isEmpty();

    void clear();
}
