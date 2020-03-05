package org.awesome.leetcode.algorithm.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 95. 不同的二叉搜索树 II
 * @author jian
 *
 */
public class UniqueBinarySearchTreesii {
	
	public List<TreeNode> generate_trees(int start, int end){
		List<TreeNode> list = new LinkedList<>();
		if (start > end) {
			list.add(null);
			return list;
		}
			
		for (int i = start; i <= end; i++) {
			List<TreeNode> left = generate_trees(start, i-1);
			List<TreeNode> right = generate_trees(i+1, end);
			
			for (TreeNode item: left) {
				for (TreeNode item2: right) {
					TreeNode root = new TreeNode(i);
					root.left = item;
					root.right = item2;
					list.add(root);
				}
			}
		}
		
		return list;
	}
	
    public List<TreeNode> generateTrees(int n) {
      if (n == 0) return new LinkedList<TreeNode>();
      return generate_trees(1, n);
    }
    
    public static void main(String[] args) {
		int n = 3;
		UniqueBinarySearchTreesii uniqueBinarySearchTreesii = new UniqueBinarySearchTreesii();
		List<TreeNode> list = uniqueBinarySearchTreesii.generateTrees(n);
		for (int i = 0; i < list.size(); i++) {
			uniqueBinarySearchTreesii.printTree(list.get(i));
			System.out.println();
		}
	}
    
    public void printTree(TreeNode root) {
    	if (null == root) {
			System.out.print("  null");
			return;
		}
    	System.out.print("  "+root.val);
    	if(null == root.left && root.right == null)return;
    	printTree(root.left);
    	if(null == root.right)return;
    	printTree(root.right);
    }
}
