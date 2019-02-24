package com.flt.tree;

/**
 * @author fenglingtong
 * @date 2018/6/4
 */
public interface BinaryTreeInterface<T> extends TreeInterface<T>, TreeIteratorInterface<T> {

    void setTree(T rootData);

    void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);
}
