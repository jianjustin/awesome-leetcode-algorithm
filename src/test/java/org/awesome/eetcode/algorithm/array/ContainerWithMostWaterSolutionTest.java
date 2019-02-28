package org.awesome.eetcode.algorithm.array;

import org.awesome.leetcode.algorithm.array.ContainerWithMostWaterSolution;
import org.junit.Test;

public class ContainerWithMostWaterSolutionTest {
	
	@Test
	public void maxAreaTest() {
		ContainerWithMostWaterSolution con = new ContainerWithMostWaterSolution();
		int[] height = {1,8,6,2,5,4,8,3,7};
		int result = con.maxArea(height);
		System.out.println(result);
	}

}
