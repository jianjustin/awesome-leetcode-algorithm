package org.awesome.leetcode.algorithm.arrays;

import java.util.Stack;

/**
 * 面试题09. 用两个栈实现队列
 * @author jian
 *
 */
public class YongLiangGeZhanShiXianDuiLieLcof {
	

}

class CQueue{
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
	public CQueue() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
    }
    
    public void appendTail(int value) {
    	stack1.push(value);
    }
    
    public int deleteHead() {
    	if(stack1.size()==0 && stack2.size()==0)return -1;
    	if(stack2.size() == 0)
    		while(stack1.size() > 0)stack2.push(stack1.pop());
    	return stack2.pop();
    }
}
