package org.awesome.leetcode.algorithm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 332. 重新安排行程
 * @author jian
 *
 */
public class ReconstructItinerary {
	
	public List<String> findItinerary(List<List<String>> tickets) {
		List<String> ans = new LinkedList<>();
		
		if(null == tickets || tickets.size() == 0)return ans;
		Map<String, List<String>> graph = new HashMap<>();
		for (List<String> ticket : tickets) {
			List<String> list = graph.computeIfAbsent(ticket.get(0), k -> new LinkedList<String>());
			list.add(ticket.get(1));
		}
		
		visit(graph, "JFK", ans);
		return ans;
	}
	
	private void visit(Map<String, List<String>> graph, String src, List<String> ans) {
        List<String> nbr = graph.get(src);
        while (nbr != null && nbr.size() > 0) {
            String dest = nbr.remove(0);
            visit(graph, dest, ans);
        }
        ans.add(0, src); // 逆序插入
    }
	
	public static void main(String[] args) {
		String[][] str = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		List<List<String>> tickets = new ArrayList<>();
		for (String[] item : str) {
			List<String> list = new ArrayList<>();
			list.add(item[0]);
			list.add(item[1]);
			tickets.add(list);
		}
		
		List<String> ans = (new ReconstructItinerary()).findItinerary(tickets);
		for (String string : ans) {
			System.out.println(string+",");
		}
	}

}
