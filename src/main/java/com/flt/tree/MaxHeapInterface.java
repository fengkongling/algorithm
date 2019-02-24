package com.flt.tree;

/**
 * @author fenglingtong
 * @date 2018/6/30
 */
public interface MaxHeapInterface <T extends Comparable<? super T>> {
    void add(T newEntry);

    T removeMax();

    T getMax();

    boolean isEmpty();

    int getSize();

    void clear();
}
