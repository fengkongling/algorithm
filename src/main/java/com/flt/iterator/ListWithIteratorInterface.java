package com.flt.iterator;

import com.flt.arrays.ListInterface;

import java.util.Iterator;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public interface ListWithIteratorInterface<T> extends ListInterface<T> {

    Iterator<T> getIterator();
}
