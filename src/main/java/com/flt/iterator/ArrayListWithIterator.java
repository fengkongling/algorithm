package com.flt.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public class ArrayListWithIterator<T> implements ListWithIteratorInterface<T> {

    private T[] list;

    private int length;

    private static final int DEFALUT_INITIAL_CAPACITY = 25;

    public ArrayListWithIterator(){
        this(DEFALUT_INITIAL_CAPACITY);
    }

    public ArrayListWithIterator(int initialCapacity) {
        length = 0;
        list = (T[]) new Object[initialCapacity];
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

    }

    @Override
    public Iterator<T> getIterator() {
        return new IteratorForArrayList();
    }

    private class IteratorForArrayList implements Iterator<T>{
        private int nextIndex;

        private boolean wasNextCalled;

        private IteratorForArrayList(){
            nextIndex = 0;
            wasNextCalled = false;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < length;
        }

        @Override
        public T next() {
            if (hasNext()){
                wasNextCalled = true;
                T nextEntry = list[nextIndex];
                nextIndex++;
                return nextEntry;
            } else {
                throw new NoSuchElementException("Illegal call to next();" + "iterator is after end of list");
            }
        }

        @Override
        public void remove() {
            if (wasNextCalled){
                ArrayListWithIterator.this.remove(nextIndex);
                nextIndex--;
                wasNextCalled = false;
            } else {
                throw new IllegalStateException("Illegal call to remove();" + "next() was not called.");
            }
        }
    }
}
