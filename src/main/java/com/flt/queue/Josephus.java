/*
 *   阔地教育科技有限公司版权所有（codyy.com/codyy.cn）
 *   Copyright (c) 2017, Codyy and/or its affiliates. All rights reserved.
 */
package com.flt.queue;

/**
 * @author 冯灵通
 * @version 1.0
 * @date 2019/2/24
 */
public class Josephus {
    public static Object Josephus(Queue Q, int k){
        if (Q.isEmpty()){
            return null;
        }
        while (Q.getSize() > 1){
            Q.traversal();
            for (int i = 0; i < k; i++){
                Q.enqueue(Q.dequeue());
            }
            Object e = Q.dequeue();
            System.out.print("\n\t" + e + "退出");
        }
        return Q.dequeue();
    }

    public static Queue buildQueue(Object a[]){
        Queue Q = new Queue_Array();
        for (int i = 0; i < a.length; i++){
            Q.enqueue(a[i]);
        }
        return Q;
    }

    public static void main(String[] args) {
        String[] kid = {"A","B","c","d","e","f","g"};
        System.out.println("最后:" + Josephus(buildQueue(kid),2));
    }
}
