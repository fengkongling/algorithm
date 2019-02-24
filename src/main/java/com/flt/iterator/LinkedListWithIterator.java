package com.flt.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * @author fenglingtong
 * @date 2018/7/1
 */
public class LinkedListWithIterator<T> implements ListWithIteratorInterface<T> {

//    private Node firstNode;

    private int length;

    public LinkedListWithIterator(){
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

    }

    @Override
    public Iterator<T> getIterator() {
        return new IteratorForLinkedList();
    }

    private class IteratorForLinkedList implements Iterator<T>{

//        private Node nextNode;

        private IteratorForLinkedList(){
//            nextNode = firstNode;
        }

        @Override
        public boolean hasNext() {
//            return nextNode != null;
            return false;
        }

        @Override
        public T next() {
            if (hasNext()){
//                Node returnNode = nextNode;
//                nextNode = nextNode.next;
//                return returnNode.data;
                return null;
            } else {
                throw new NoSuchElementException("Illegal call to next();" + "iteration is after end of list");
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove() is not" + "supported by this iterator");
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {

        }
    }
}
