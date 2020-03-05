package org.awesome.leetcode.algorithm.tree;

import java.util.Arrays;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(null == postorder || postorder.length == 0)return null;
		TreeNode root = new TreeNode(postorder[postorder.length-1]);
		
		for (int i = 0; i < inorder.length; i++) {
			if(inorder[i] == root.val) {//获取根节点在中序遍历中的位置
				root.left = buildTree(Arrays.copyOfRange(inorder, 0, i), Arrays.copyOfRange(postorder, 0, i));
				root.right = buildTree(Arrays.copyOfRange(inorder, i+1, inorder.length), Arrays.copyOfRange(postorder, i, inorder.length-1));
			}
		}
		
		return root;
    }
	
	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7}, postorder = {9,15,7,20,3};
		TreeNode root = (new ConstructBinaryTreeFromInorderAndPostorderTraversal()).buildTree(inorder, postorder);
		System.out.println(root);
	}

}
