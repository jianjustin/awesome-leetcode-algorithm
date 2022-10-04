package main

import (
	"fmt"

	"awesome.leetcode.algorithm/leetcode"
)

func main() {
	//输入：nums = [2,7,11,15], target = 9
	//输出：[0,1]
	nums := []int{2, 7, 11, 15}
	target := 9

	res := leetcode.TwoSum(nums, target)
	fmt.Println("res = ", res)
}
