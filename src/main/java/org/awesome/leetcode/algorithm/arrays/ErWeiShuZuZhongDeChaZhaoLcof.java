package org.awesome.leetcode.algorithm.arrays;

/**
 * 面试题04. 二维数组中的查找
 * @author jian
 *
 */
public class ErWeiShuZuZhongDeChaZhaoLcof {
	
	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(null == matrix || matrix.length == 0 || matrix[0].length == 0)return false;
		int lenx = matrix.length, leny = matrix[0].length;
		
		for (int i = 0; i < matrix.length; i++) {
			if(target < matrix[i][0] || target > matrix[i][leny-1])continue;
			for (int j = 0; j < matrix[i].length; j++) 
				if(target == matrix[i][j])return true;	
		}
		
		return false;
    }
	
	public static void main(String[] args) {
		int[][] arr = {{-1,3}};
		System.out.println((new ErWeiShuZuZhongDeChaZhaoLcof()).findNumberIn2DArray(arr, 3));
	}

}
