package com.flt.leetcode;

/**
 * @author fenglingtong
 * @date 2018/7/15
 */
public class TreeSolution {
    //104. 二叉树的最大深度
    public int maxDepth(TreeNode root) {
        int i = 0;
        int left=0;
        int right=0;
        if(root != null){
            i++;
            if(root.left != null){
                left = maxDepth(root.left);
            }
            if(root.right != null){
                right = maxDepth(root.right);
            }
        }

        return (i + left)>(i+right) ? (i+left):(i + right);
    }

    //104. 二叉树的最大深度
    public int maxDepth1(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return left>right ? left : right;    //返回二者之中较大数
    }


      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
}
