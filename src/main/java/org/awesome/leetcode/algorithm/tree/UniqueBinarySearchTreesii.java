package org.awesome.leetcode.algorithm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 * @author jian
 *
 */
public class UniqueBinarySearchTreesii {
	public List<TreeNode> generate_trees(int start, int end) {
	    List<TreeNode> all_trees = new LinkedList<TreeNode>();
	    if (start > end) {
	      all_trees.add(null);
	      return all_trees;
	    }

	    for (int i = start; i <= end; i++) {
	      LinkedList<TreeNode> left_trees = (LinkedList<TreeNode>)generate_trees(start, i - 1);
	      LinkedList<TreeNode> right_trees = (LinkedList<TreeNode>)generate_trees(i + 1, end);

	      for (TreeNode l : left_trees) {
	        for (TreeNode r : right_trees) {
	          TreeNode current_tree = new TreeNode(i);
	          current_tree.left = l;
	          current_tree.right = r;
	          all_trees.add(current_tree);
	        }
	      }
	    }
	    return all_trees;
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
