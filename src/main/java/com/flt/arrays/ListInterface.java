package com.flt.arrays;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public interface ListInterface<T> {
    int getLength();

    T getEntry(int givenPosition);

    T remove(int givenPosition);

    void clear();
}
