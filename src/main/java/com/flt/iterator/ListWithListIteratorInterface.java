package com.flt.iterator;

import com.flt.arrays.ListInterface;

import java.util.ListIterator;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public interface ListWithListIteratorInterface<T> extends ListInterface<T> {

    ListIterator<T> getIterator();
}
