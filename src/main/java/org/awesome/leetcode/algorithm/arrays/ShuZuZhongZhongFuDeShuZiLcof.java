package org.awesome.leetcode.algorithm.arrays;

import java.util.HashMap;
import java.util.Map;

public class ShuZuZhongZhongFuDeShuZiLcof {
	
	public int findRepeatNumber(int[] nums) {
		if(null == nums || nums.length == 0)return -1;
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if(null == map.get(i))
                map.put(i, 1);
			else
                return i;
		}
		return -1;
    }

}
