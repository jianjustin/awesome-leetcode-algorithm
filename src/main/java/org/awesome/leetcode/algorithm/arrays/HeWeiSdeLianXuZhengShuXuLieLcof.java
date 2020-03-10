package org.awesome.leetcode.algorithm.arrays;

import java.util.ArrayList;
import java.util.List;

public class HeWeiSdeLianXuZhengShuXuLieLcof {
	
	public int[][] findContinuousSequence(int target) {
		List<int[]> list = new ArrayList<>();
		if(1 == target || target == 2)return (int[][]) list.toArray();
		
		int m = 1;
		while(m<target) {
			int j = m++, i = j, k = target;
			while((k-=i)>0)i++;
			if(k<0)continue;
			int[] item = new int[i-j+1];
			for(k=0; k<item.length; k++)item[k] = j+k;
			list.add(item);
		}
		
		
		return list.toArray(new int[list.size()][]);
    }
	
	public static void main(String[] args) {
		int[][] result = (new HeWeiSdeLianXuZhengShuXuLieLcof()).findContinuousSequence(9);
		for (int[] is : result) {
			for (int is2 : is) {
				System.out.print(is2+",");
			}
			System.out.println();
		}
	}

}
