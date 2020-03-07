package org.awesome.leetcode.algorithm.arrays;

public class DistributeCandiesToPeople {
	
	public int[] distributeCandies(int candies, int num_people) {
		int[] childs = new int[num_people];
		int i = 0, candy = 0;
		
		while(candies > 0) {
			candy = ((candies-1) < candy)?candies:candy+1;
			childs[i]+=candy;
			i = (i+1)%num_people;
			candies -=candy;
		}
		
		return childs;
    }
	
	public static void main(String[] args) {
		int candies = 7, num_people = 4;
		int[] result = (new DistributeCandiesToPeople()).distributeCandies(candies, num_people);
		for (int i : result) {
			System.out.print(i+",");
		}
	}

}
