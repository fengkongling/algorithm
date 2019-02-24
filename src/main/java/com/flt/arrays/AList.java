package com.flt.arrays;

/**
 * @author fenglingtong
 * @date 2018/5/6
 */
public class AList<T> {

    private T[] entry;

    private int length;

    private static final int MAX_SIZE = 50;

    public AList() {
        this(MAX_SIZE);
    }

    public AList(int maxSize) {
        length = 0;
        entry = (T[]) new Object[maxSize];
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
        if (!isFull() && newPosition >= 1 && newPosition <= (length + 1)) {
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
        return length == entry.length;
    }

    public void display() {
        for (T t : entry) {
            System.out.println(t);
        }
    }
}
