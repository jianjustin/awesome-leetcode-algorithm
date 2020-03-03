package org.awesome.leetcode.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 94. 二叉树的中序遍历
 *
 *
 */
public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> stack = new ArrayList<Integer>();
        checkNode(stack,root);
        return stack;
    }

    public void checkNode(List<Integer> stack , TreeNode node){
        if (null == node)return;
        if (null != node.left)checkNode(stack,node.left);
        stack.add(node.val);
        if (null != node.right)checkNode(stack,node.right);
    }

    
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		List<Integer> list = (new BinaryTreeInorderTraversal()).inorderTraversal(root);
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
