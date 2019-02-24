package com.flt.iterator;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public class ArrayListWithListIterator<T> implements ListWithListIteratorInterface<T> {

    private T[] list;

    private int length;

    private static final int DEFALUT_INITIAL_CAPACITY = 25;

    public ArrayListWithListIterator() {
        this(DEFALUT_INITIAL_CAPACITY);
    }

    public ArrayListWithListIterator(int initialCapacity) {
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
    public ListIterator<T> getIterator() {
        return new IteratorForArrayList();
    }

    private enum Move{
        NEXT,
        PREVIOUS
    }

    private class IteratorForArrayList implements ListIterator<T> {
        private int nextIndex;

        private boolean isRemoveOrSetLegal;

        private Move lastMove;

        private IteratorForArrayList() {
            nextIndex = 0;
            isRemoveOrSetLegal = false;
            lastMove = null;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < length;
        }

        @Override
        public T next() {
            if (hasNext()) {
                lastMove = Move.NEXT;
                isRemoveOrSetLegal = true;
                T nextEntry = list[nextIndex];
                nextIndex++;
                return nextEntry;
            } else {
                throw new NoSuchElementException("Illegal call to next();" + "iterator is after end of list");
            }
        }

        @Override
        public boolean hasPrevious() {
            return (nextIndex > 0) && (nextIndex <= length);
        }

        @Override
        public T previous() {
            if (hasPrevious()) {
                lastMove = Move.PREVIOUS;
                isRemoveOrSetLegal = true;
                nextIndex--;
                return list[nextIndex];
            } else {
                throw new NoSuchElementException(
                        "Illegal call to previous();" + "iterator is before beginning of list");
            }
        }

        @Override
        public int nextIndex() {
            int result;
            if (hasNext()) {
                result = nextIndex;
            } else {
                result = length;
            }
            return result;
        }

        @Override
        public int previousIndex() {
            int result;
            if (hasPrevious()) {
                result = nextIndex - 1;
            } else {
                result = -1;
            }
            return result;
        }

        @Override
        public void remove() {
            /*if (isRemoveOrSetLegal) {
                isRemoveOrSetLegal = false;
                if (lastMove.equals(Move.NEXT)){

                }
                ArrayListWithListIterator.this.remove(nextIndex);
                nextIndex--;
            } else if (wasPreviousCalled && !wasAddCalled){
                ArrayListWithListIterator.this.remove(nextIndex + 1);
            } else {
                throw new IllegalStateException("Illegal call to remove();" + "next() was not called.");
            }*/
        }

        @Override
        public void set(T newEntry) {
            /*if (isRemoveOrSetLegal) {
                if (lastMove.equals(Move.NEXT)){
                    list[nextIndex - 1] = newEntry;
                } else {
                    list[nextIndex - 1] = newEntry;
                }
            } else if (wasPreviousCalled && !wasAddCalled){
                ArrayListWithListIterator.this.remove(nextIndex + 1);
            } else {
                throw new IllegalStateException("Illegal call to remove();" + "next() was not called.");
            }*/
        }

        @Override
        public void add(T newEntry) {
            isRemoveOrSetLegal = true;
            nextIndex++;
//            ArrayListWithListIterator.this.add(nextIndex, newEntry);
        }
    }
}
