package org.awesome.leetcode.algorithm.arrays;

public class PartitionArrayIntoThreePartsWithEqualSum {
	
	public boolean canThreePartsEqualSum(int[] A) {
		int i = 0, j = A.length-1, m = 0, n = 0, count = 0;
		
		for(int k=0; k<A.length; k++) count += A[k];
		
		while(i<A.length) {
			m += A[i];
			if(m == count/3)break;
			i++;
		}
		
		while(j>=0) {
			n += A[j];
			if(n == count/3)break;
			j--;
		}
		
		if(m==count/3 && n==count/3 && j-i>1)return true;
		return false;
    }
	
	public static void main(String[] args) {
		int[] arr = {18,12,-18,18,-19,-1,10,10};
		System.out.println((new PartitionArrayIntoThreePartsWithEqualSum()).canThreePartsEqualSum(arr));
	}

}
