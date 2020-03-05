package org.awesome.leetcode.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 113. 路径总和 II
 * @author jian
 *
 */
public class PathSumii {

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<>();
		if(null == root)return result;
		
		List<Integer> beforeList = new ArrayList<>();
		pathSum(root, sum, beforeList, result);
		
		return result;
    }
	
	public void pathSum(TreeNode root, int sum, List<Integer> beforeList, List<List<Integer>> result) {
		sum -=root.val;
		beforeList.add(root.val);
		
		if(null == root.left && root.right == null) {//说明是叶子结点
			if(sum == 0) 
				result.add(beforeList);
			else 
				beforeList.clear();
		}else {
			List<Integer> leftList = new ArrayList<>(beforeList), rightList = new ArrayList<>(beforeList);
			if(null != root.left) pathSum(root.left, sum, leftList, result);
			if(null != root.right) pathSum(root.right, sum, rightList, result);
			
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		List<List<Integer>> list = (new PathSumii()).pathSum(root, 22);
		
		for (List<Integer> list2 : list) {
			for (int val : list2) {
				System.out.print(val+",");
			}
			System.out.println();
		}
	}
	
}
