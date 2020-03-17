package org.awesome.leetcode.algorithm.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 207. 课程表
 * @author jian
 *
 */
public class CourseSchedule {
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegrees = new int[numCourses];//计算入度
		Map<Integer, List<Integer>> graph = new HashMap<>();//图
		Queue<Integer> queue = new LinkedList<>();
		for (int[] item: prerequisites) {
			indegrees[item[0]]++;
			if(null == graph.get(item[1]))graph.put(item[1], new LinkedList<>());
			graph.get(item[1]).add(item[0]);
		}
		
		for(int i = 0; i < numCourses; i++)
            if(indegrees[i] == 0) queue.add(i);//获取无前置课程的课
		
		while (0!=queue.size()) {
			int item = queue.poll();
			numCourses--;
			if(null == graph.get(item))continue;
			for (int k: graph.get(item)) 
				if(--indegrees[k] == 0)queue.add(k);
		}
		return numCourses==0;
    }
	
	public static void main(String[] args) {
		int numCourses = 8;
		int[][] prerequisites = {{1,0},{2,6},{1,7},{6,4},{7,0},{0,5}};
		System.out.println((new CourseSchedule()).canFinish(numCourses, prerequisites));
	}

}
