package com.umiitkose.tree.easy.quiz111;

public class MinimumDepthOfBinaryTree {

    //Root of the Binary Tree
    TreeNode root;

    /* Driver program to test above functions */
    public static void main(String[] args) {
        MinimumDepthOfBinaryTree tree = new MinimumDepthOfBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("The minimum depth of " +
                "binary tree is : " + tree.minimumDepth());
    }

    int minimumDepth() {
        return minimumDepth(root);
    }

    /* Function to calculate the minimum depth of the tree */
    int minimumDepth(TreeNode root) {
        // Corner case. Should never be hit unless the code is
        // called on root = NULL
        if (root == null)
            return 0;

        // Base case : Leaf TreeNode. This accounts for height = 1.
        if (root.left == null && root.right == null)
            return 1;

        // If left subtree is NULL, recur for right subtree
        if (root.left == null)
            return minimumDepth(root.right) + 1;

        // If right subtree is NULL, recur for left subtree
        if (root.right == null)
            return minimumDepth(root.left) + 1;

        return Math.min(minimumDepth(root.left),
                minimumDepth(root.right)) + 1;
    }
}
