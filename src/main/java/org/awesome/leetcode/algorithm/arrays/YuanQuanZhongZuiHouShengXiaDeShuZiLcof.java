package org.awesome.leetcode.algorithm.arrays;

public class YuanQuanZhongZuiHouShengXiaDeShuZiLcof {
	
	public int lastRemaining(int n, int m) {
		int[] arr = new int[n];
		
		int begin = 0, result = 0;
		for(int i=1; i<n; i++) {
			int item = m%n+begin-1;
			while(arr[item] == -1)item++;
			arr[item] = -1;
			while(arr[item] == -1)item++;
			begin = item;
		}
		
		for(int i=1; i<n; i++) 
			if(arr[i]==0) {
				result = arr[i];
				break;
			}
		return result;
    }
	
	public static void main(String[] args) {
		System.out.println((new YuanQuanZhongZuiHouShengXiaDeShuZiLcof()).lastRemaining(5, 3));
	}

}
