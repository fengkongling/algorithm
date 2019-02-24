package com.flt.arrays;

/**
 * @author fenglingtong
 * @date 2018/5/6
 */
public class AExtendList<T> {

    private T[] entry;

    private int length;

    private static final int DEFALUT_INITIAL_CAPACITY = 50;

    public AExtendList() {
        this(DEFALUT_INITIAL_CAPACITY);
    }

    public AExtendList(int initialCapacity) {
        length = 0;
        entry = (T[]) new Object[initialCapacity];
    }

    public boolean add(T newEntry) {
        return add(length + 1, newEntry);
/*        boolean isSuccessFul = true;
        if (! isFull()){
            entry[length] = newEntry;
            length ++;
        } else {
            isSuccessFul = false;
        }
        return isSuccessFul;*/
    }

    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessFul = true;
        if (isArrayFull()){
            doubleArray();
        }
        if ( newPosition >= 1 ) {
            makeRoom(newPosition);
            entry[newPosition - 1] = newEntry;
            length++;
        } else {
            isSuccessFul = false;
        }
        return isSuccessFul;
    }

    private void makeRoom(int newPosition) {
        for (int index = length; index >= newPosition; index--) {
            entry[index] = entry[index - 1];
        }
    }

    public T remove(int givenPosition) {
        T result = null;
        if ((givenPosition >= 1) && (givenPosition <= length)) {
            result = entry[givenPosition - 1];
            if (givenPosition < length) {
                removeGap(givenPosition);
            }
            length--;
        }
        return result;
    }

    private void removeGap(int givenPosition) {
        int removeIndex = givenPosition - 1;
        int lastIndex = length - 1;
        for (int index = removeIndex; index < lastIndex; index++) {
            entry[index] = entry[index + 1];
        }
    }

    public void clear() {
        length = 0;
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessFul = true;
        if (1<= givenPosition &&  givenPosition <= length){
            entry[givenPosition - 1] = newEntry;
        } else {
            isSuccessFul = false;
        }
        return isSuccessFul;
    }

    public T getEntry(int givenPosition) {
        T result = null;
        if (1<= givenPosition &&  givenPosition <= length){
            result = entry[givenPosition - 1];
        }
        return result;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        for (int index = 0; !found && index < length; index ++){
            if (anEntry.equals(entry[index])){
                found = true;
            }
        }
        return found;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isArrayFull(){
        return length == entry.length;
    }

    public void doubleArray(){
        T[] oldEntry = entry;
        entry = (T[]) new Object[oldEntry.length * 2];
        for (int index = 0 ; index < length; index++){
            entry[index] = oldEntry[index];
        }
    }

    public void display() {
        for (T t : entry) {
            System.out.println(t);
        }
    }
}
