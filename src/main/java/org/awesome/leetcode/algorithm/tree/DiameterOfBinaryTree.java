package org.awesome.leetcode.algorithm.tree;

/**
 * 543. 二叉树的直径
 * @author jian
 *
 */
public class DiameterOfBinaryTree {
	int ans;
	public int diameterOfBinaryTree(TreeNode root) {
		depth(root);
		return ans;
    }
	
	public int depth(TreeNode root) {
		if(null == root)return 0;
		int left = depth(root.left);
		int right = depth(root.right);
		ans = Math.max(ans, left+right);
		return Math.max(left, right)+1;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		System.out.println((new DiameterOfBinaryTree()).diameterOfBinaryTree(root));
	}
}
