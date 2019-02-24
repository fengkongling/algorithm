package com.flt.iterator;

import com.flt.arrays.ListInterface;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public class SeparateIterator<T> implements Iterator<T> {

    private ListInterface<T> list;

    private int nextPosition;

    private boolean wasNextCalled;

    public SeparateIterator(ListInterface<T> aList){
        list = aList;
        nextPosition = 0;
        wasNextCalled = false;
    }

    @Override
    public boolean hasNext() {
        return nextPosition < list.getLength();
    }

    @Override
    public T next() {
        if (hasNext()){
            wasNextCalled = true;
            nextPosition++;
            return list.getEntry(nextPosition);
        } else {
            throw new NoSuchElementException("Illegal call to next();" + "iterator is after end of list");
        }
    }

    @Override
    public void remove() {
        if (wasNextCalled){
            list.remove(nextPosition);
            nextPosition--;
            wasNextCalled = false;
        } else {
            throw new IllegalStateException("Illegal call to remove();" + "next() was not called.");
        }
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {

    }
}
