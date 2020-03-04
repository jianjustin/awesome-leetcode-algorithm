package org.awesome.leetcode.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * leetcode 102. 二叉树的层次遍历
 */
public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(null == root)return result;
		List<Integer> result1 = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);//添加根节点
		int end = 1;
		
		while(queue.size()>0) {
			TreeNode item = queue.remove();
			end--;
			result1.add(item.val);
			if(null != item.left)queue.add(item.left);
			if(null != item.right)queue.add(item.right);
			
			if(0 == end) {
				result.add(result1);
				result1 = new ArrayList<>();
				end = queue.size();
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);
		
		List<List<Integer>> list = (new BinaryTreeLevelOrderTraversal()).levelOrder(root);
		
		for (List<Integer> list2 : list) {
			for (int item : list2) {
				System.out.println("  "+item);
			}
			System.out.println();
		}
	}
	
}
