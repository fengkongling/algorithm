package com.flt.tree;

/**
 * @author fenglingtong
 * @date 2018/6/5
 */
public interface BinaryNodeInterface<T> {

    T getData();

    void setData(T newData);

    BinaryNodeInterface<T> getLeftChild();

    BinaryNodeInterface<T> getRightChild();

    void setLeftChild(BinaryNodeInterface<T> leftChild);

    void setRightChild(BinaryNodeInterface<T> rightChild);

    boolean hasLeftChild();

    boolean hasRightChild();

    boolean isLeaf();

    int getNumberOfNodes();

    int getHeight();

    BinaryNodeInterface<T> copy();
}
