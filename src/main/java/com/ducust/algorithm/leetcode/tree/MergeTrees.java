package com.ducust.algorithm.leetcode.tree;

/**
 * Created by Custing on 2017/8/18.
 */
public class MergeTrees {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {


        return new TreeNode(0);
    }


    private int treeDepth(TreeNode tree) {      //计算二叉树深度

        int leftDepth, rightDepth;
        if (tree == null) {
            return 0;
        } else {
            leftDepth = treeDepth(tree.left);
            rightDepth = treeDepth(tree.right);
            if (leftDepth > rightDepth) {
                return leftDepth + 1;
            } else {
                return rightDepth + 1;
            }
        }

    }


    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(0);

        TreeNode t2 = new TreeNode(0);

    }


}
