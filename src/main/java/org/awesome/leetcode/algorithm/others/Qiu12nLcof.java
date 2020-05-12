package org.awesome.leetcode.algorithm.others;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题64. 求1+2+…+n
 * @author jian
 *
 */
public class Qiu12nLcof {
	
	public int sumNums(int n) {
		if(n <= 1)return n;
		return n+sumNums(n-1);
    }

}

class Producer extends Thread{
	
	private Queue<Integer> queue;
	
	public Producer(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		queue.poll();
	}
	
}

class Consumer extends Thread{
	
	private Queue<Integer> queue;
	
	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		queue.add((int) Math.random());
	}
	
}
