package org.awesome.leetcode.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree {
	
	public boolean isValidBST(TreeNode root) {
		if(null == root)return true;
		List<Integer> list = inOrderStack(root);
		
		for (int i = 1; i < list.size(); i++) 
			if(list.get(i-1)>=list.get(i))return false;
		
		return true;
    }
	
	public static List<Integer> inOrderStack(TreeNode root){
		List<Integer> list = new ArrayList<>();
		
		Stack<TreeNode> s=new Stack<>();
		while(root!=null||!s.isEmpty()){
			while(root!=null){
				s.push(root);
				root=root.left;
			}
			root=s.pop();
			list.add(root.val);
			root=root.right;
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);
		
		System.out.println((new ValidateBinarySearchTree()).isValidBST(root));
	}

}
