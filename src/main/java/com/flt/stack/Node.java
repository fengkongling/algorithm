/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/2/24
 */
public class Node implements Position {
    private Object element;
    private Node next;

    public Node(){
        this(null,null);
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public Object getElem(){
        return element;
    }

    @Override
    public Object setElem(Object e){
        Object oldElem = element;
        element = e;
        return oldElem;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node newNext){
        next = newNext;
    }

    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        List<Object> collect = nodes.stream().map(Node::getElem).collect(Collectors.toList());

    }
}
