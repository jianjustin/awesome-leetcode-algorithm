package org.awesome.leetcode.algorithm.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/**
 * 310. 最小高度树
 * @author jian
 *
 */
public class MinimumHeightTrees {
	
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		int[] indegrees = new int[n];//计算度
		Map<Integer, List<Integer>> graph = new HashMap<>();//图
		Queue<Integer> queue = new LinkedList<>();
		for (int[] item: edges) {
			indegrees[item[0]]++;
			indegrees[item[1]]++;
			if(null == graph.get(item[1]))graph.put(item[1], new LinkedList<>());
			if(null == graph.get(item[0]))graph.put(item[0], new LinkedList<>());
			graph.get(item[1]).add(item[0]);
			graph.get(item[0]).add(item[1]);
		}
		
		List<Integer> ans = new ArrayList<>(queue);
		if(0 == n)return ans;
		if(1 == n) {
			ans.add(0);
			return ans;
		}
		
		for(int i = 0; i < n; i++)
            if(indegrees[i] == 1) queue.add(i);
		
		while (n!=1 && n!=2) {
			int len = queue.size();
			for (int i = 0; i < len; i++) {
				int item = queue.poll();
				n--;
				indegrees[item]--;
				if(null == graph.get(item))continue;
				for (int k: graph.get(item)) 
					if(--indegrees[k] == 1)queue.add(k);
			}
		}
		
		ans.addAll(queue);
		return ans;
    }
	
	public static void main(String[] args) {
		int n = 4;
		int[][] edges = {{1,0}, {1,2}, {1,3}};
		
		List<Integer> ans = (new MinimumHeightTrees()).findMinHeightTrees(n, edges);
		for (int i : ans) 
			System.out.print(i+",");
	}

}
