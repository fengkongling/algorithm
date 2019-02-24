package com.flt.tree;

import java.io.Serializable;
import java.util.Iterator;

/**
 * @author fenglingtong
 * @date 2018/6/6
 */
public class BinaryTree<T> implements BinaryTreeInterface<T>, Serializable {

    private BinaryNodeInterface<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        privateSetTree(rootData, (BinaryTree) leftTree, (BinaryTree) rightTree);
    }

    @Override
    public T getRootData() {
        T rootData = null;
        if (root != null){
            rootData = root.getData();
        }
        return rootData;
    }

    @Override
    public int getHeight() {
        return root.getHeight();
    }

    @Override
    public int getNumberOfNodes() {
        return root.getNumberOfNodes();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public Iterator<T> getPreorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getPostorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getInorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getLevelorderIterator() {
        return null;
    }

    public void inorderTraverse(){
        inorderTraverse(root);
    }

    private void inorderTraverse(BinaryNodeInterface<T> node){
/*        if (node != null){
            inorderTraverse(node.getLeftChild());
            System.out.println(node.getData());
            inorderTraverse(node.getRightChild());
        }*/
    }

    public void preorderTraverse(){
        preorderTraverse(root);
    }

    private void preorderTraverse(BinaryNodeInterface<T> node){
        if (node != null){
            System.out.println(node.getData());
            preorderTraverse(node.getLeftChild());
            preorderTraverse(node.getRightChild());
        }
    }

    public void postorderTraverse(){
        postorderTraverse(root);
    }

    private void postorderTraverse(BinaryNodeInterface<T> node){
        if (node != null){
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRightChild());
            System.out.println(node.getData());
        }
    }

    @Override
    public void setTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    @Override
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree) leftTree, (BinaryTree) rightTree);
    }

    protected void setRootData(T rootData){
        root.setData(rootData);
    }

    protected void setRootNode(BinaryNodeInterface<T> rootNode){
        root = rootNode;
    }

    protected BinaryNodeInterface<T> getRootNode(){
        return root;
    }

    private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        root = new BinaryNode<>(rootData);
        if (leftTree != null && !leftTree.isEmpty()) {
            root.setLeftChild(leftTree.root);
        }
        if (rightTree != null && !rightTree.isEmpty()) {
            if (rightTree != leftTree){
                root.setRightChild(rightTree.root);
            } else {
                root.setRightChild(rightTree.root.copy());
            }
        }

        if (leftTree != null && leftTree != this){
            leftTree.clear();
        }

        if (rightTree != null && rightTree != this){
            rightTree.clear();
        }
    }
}
