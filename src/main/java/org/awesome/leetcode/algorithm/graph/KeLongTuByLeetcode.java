package org.awesome.leetcode.algorithm.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeLongTuByLeetcode {
	
	private Map<Node, Node> visitedMap = new HashMap<>();
	
	public Node cloneGraph(Node node) {
        if(null == node)return node;
        if(visitedMap.containsKey(node))return visitedMap.get(node);
        Node item = new Node(node.val, new ArrayList<>());
        visitedMap.put(node, item);
        for (Node i : node.neighbors) 
			item.neighbors.add(cloneGraph(i));
		return item;
    }

}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};