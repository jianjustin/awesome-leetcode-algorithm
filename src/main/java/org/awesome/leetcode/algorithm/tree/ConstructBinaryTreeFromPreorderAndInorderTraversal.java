package org.awesome.leetcode.algorithm.tree;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(null == preorder || preorder.length == 0)return null;
		TreeNode root = new TreeNode(preorder[0]);
		
		for (int i = 0; i < inorder.length; i++) {
			if(inorder[i] == preorder[0]) {//获取根节点在中序遍历中的位置
				root.left = buildTree(Arrays.copyOfRange(preorder, 1, i+1), Arrays.copyOfRange(inorder, 0, i));
				root.right = buildTree(Arrays.copyOfRange(preorder, i+1, preorder.length), Arrays.copyOfRange(inorder, i+1, inorder.length));
			}
		}
		
		return root;
    }
	
	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};
		TreeNode root = (new ConstructBinaryTreeFromPreorderAndInorderTraversal()).buildTree(preorder, inorder);
		System.out.println(root);
	}

}
