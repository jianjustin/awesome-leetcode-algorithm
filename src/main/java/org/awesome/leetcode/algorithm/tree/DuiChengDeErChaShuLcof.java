package org.awesome.leetcode.algorithm.tree;

public class DuiChengDeErChaShuLcof {
	
	public boolean isSymmetric(TreeNode root) {
		if(null == root)return true;
		return isSymmetric(root.left, root.right);
    }
	
	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if(null == left && right == null)return true;
		if(null == left || right == null)return false;
		if(left.val != right.val)return false;
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}
	
}
