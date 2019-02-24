package com.flt.iterator;

import com.flt.arrays.ListInterface;

import java.util.Iterator;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public class ListWithTraversal<T> implements ListInterface<T>,Iterator<T> {

//    private Node firstNode;

    private int length;

//    private Node nextNode;

    public ListWithTraversal(){
        clear();
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public T getEntry(int givenPosition) {
        return null;
    }

    @Override
    public T remove(int givenPosition) {
        return null;
    }

    @Override
    public void clear() {
//        firstNode = null;
        length = 0;
//        nextNode = null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    public void resetTraversal(){
//        nextNode = firstNode;
    }


}
