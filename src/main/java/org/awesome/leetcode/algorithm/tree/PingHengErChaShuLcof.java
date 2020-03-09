package org.awesome.leetcode.algorithm.tree;

/**
 * 面试题55 - II. 平衡二叉树
 * @author jian
 *
 */
public class PingHengErChaShuLcof {
	public boolean isBalanced(TreeNode root) {
		if(null == root)return true;
		if(!isBalanced(root.left))return false;
		if(!isBalanced(root.right))return false;
		int count = treeHight(root.left)-treeHight(root.right);
		if(Math.abs(count)>1)return false;
		return true;
    }
	
	public int treeHight(TreeNode root) {
		if(null == root)return 0;
		return Math.max(treeHight(root.left), treeHight(root.right))+1;
	}
	
}
