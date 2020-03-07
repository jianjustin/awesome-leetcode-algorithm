package org.awesome.leetcode.algorithm.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode 面试题59 - II. 队列的最大值
 * @author jian
 *
 */
public class MaxQueue {
	private List<Integer> queue;
	private int max_value;
	
	public MaxQueue() {
		queue = new LinkedList<>();
    }
    
    public int max_value() {
    	if(0==queue.size())return -1;
    	return max_value;
    }
    
    public void push_back(int value) {
    	queue.add(value);
    	if(value > max_value)max_value = value;
    }
    
    public int pop_front() {
    	if(0==queue.size())return -1;
    	int value = queue.remove(0);
    	if(0==queue.size())
    		max_value = -1;
    	else
    		max_value = Collections.max(queue);
    	return value;
    }
}
