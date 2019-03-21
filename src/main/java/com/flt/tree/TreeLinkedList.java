/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.tree;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/3/21
 */
public class TreeLinkedList implements Tree {

    private Object element;

    private TreeLinkedList parent,firstChild,nextSibling;

    public TreeLinkedList() {
        this(null,null,null,null);
    }

    public TreeLinkedList(Object element, TreeLinkedList parent, TreeLinkedList firstChild,
            TreeLinkedList nextSibling) {
        this.element = element;
        this.parent = parent;
        this.firstChild = firstChild;
        this.nextSibling = nextSibling;
    }

    @Override
    public Object getElem() {
        return element;
    }

    @Override
    public Object setElem(Object object) {
        Object bak = element;
        element = object;
        return bak;
    }

    @Override
    public TreeLinkedList getParent() {
        return parent;
    }

    @Override
    public TreeLinkedList getFirstChild() {
        return firstChild;
    }

    @Override
    public TreeLinkedList getNextSibling() {
        return nextSibling;
    }

    @Override
    public int getSize() {
        int size = 1;
        TreeLinkedList subtree = firstChild;
        while (null != subtree){
            size += subtree.getSize();
            subtree = subtree.getNextSibling();
        }
        return size;
    }

    @Override
    public int getHeight() {
        int height = -1;
        TreeLinkedList subtree = firstChild;
        while (null != subtree){
            height = Math.max(height, subtree.getHeight());
            subtree = subtree.getNextSibling();
        }
        return height + 1;
    }

    @Override
    public int getDepth() {
        int depth = 0;
        TreeLinkedList p = parent;
        while (null != p){
            depth++;
            p = p.getParent();
        }
        return depth;
    }
}
