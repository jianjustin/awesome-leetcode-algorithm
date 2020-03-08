package org.awesome.leetcode.algorithm.tree;

public class ErChaShuDeJingXiangLcof {
	public TreeNode mirrorTree(TreeNode root) {
		if(null == root)return null;
		TreeNode temp = mirrorTree(root.right);
		root.right = mirrorTree(root.left);
		root.left = temp;
		return root;
    }
}
