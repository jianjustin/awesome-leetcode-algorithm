package org.awesome.leetcode.algorithm.tree;

public class ErChaSouSuoShuDeZuiJinGongGongZuXianLcof {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root)return root;
        
        TreeNode ans = root;
        while(null != ans) {
        	if(ans.val < p.val && ans.val < q.val)ans = ans.right;
        	if(ans.val > p.val && ans.val > q.val)ans = ans.left;
        	if(ans.val == p.val || ans.val == q.val)return ans;
        	if(ans.val > Math.min(p.val, q.val) && ans.val < Math.max(p.val, q.val)) 
        		return ans;
        }
        return ans;
    }
}
