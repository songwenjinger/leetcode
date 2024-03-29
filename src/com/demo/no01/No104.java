package com.demo.no01;

import com.common.TreeNode;

public class No104 {
    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        } else {
//            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//        }
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;

    }
}
