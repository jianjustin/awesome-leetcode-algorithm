package org.awesome.leetcode.algorithm.tree;

public class ErChaShuSeShenDuLcof {
	
	public int maxDepth(TreeNode root) {
		if(null == root)return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		System.out.println((new ErChaShuSeShenDuLcof()).maxDepth(root));
	}

}
