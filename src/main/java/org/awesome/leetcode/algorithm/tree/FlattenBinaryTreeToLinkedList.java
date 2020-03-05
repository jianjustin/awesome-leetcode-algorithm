package org.awesome.leetcode.algorithm.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
	
	public void flatten(TreeNode root) {
		if(null == root)return;
		List<Integer> list = new ArrayList<>();
		PrintBinaryTree(root,list);//先序遍历，获取值列表
		
		TreeNode node = root;
		for (int i=1; i<list.size(); i++) {
			node.left = null;
			if(null == node.right)node.right = new TreeNode(list.get(i));
			node.right.val = list.get(i);
			node = node.right;
		}
		
    }
	
	public void PrintBinaryTree(TreeNode root, List<Integer> list) {
		if(null == root)return;
		list.add(root.val);
		PrintBinaryTree(root.left, list);
		PrintBinaryTree(root.right, list);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);
		
		(new FlattenBinaryTreeToLinkedList()).flatten(root);
		TreeNode node = root;
		while (node != null) {
			System.out.print(node.val+"   ");
			node = node.right;
		}
	}


}
