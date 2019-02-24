package com.flt.tree;

import java.util.Iterator;

/**
 * @author fenglingtong
 * @date 2018/6/4
 */
public interface TreeIteratorInterface<T> {

    Iterator<T> getPreorderIterator();

    Iterator<T> getPostorderIterator();

    Iterator<T> getInorderIterator();

    Iterator<T> getLevelorderIterator();
}
