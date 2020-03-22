package org.awesome.leetcode.algorithm.tree;

public class ErChaShuDeZuiJinGongGongZuXianLcof {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q ==root)return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return (right == null) ? left : (left == null) ? right : root;
    }

}
