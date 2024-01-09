package com.umiitkose.tree.easy.quiz938;

import com.umiitkose.tree.base.TreeNode;

/**
 * Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
 * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
 * Output: 32
 * Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
 */
public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int currentVal = (root.val >= low && root.val <= high) ? root.val : 0;

        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);

        return currentVal + leftSum + rightSum;
    }

}
