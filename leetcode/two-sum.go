package main

import "fmt"

func main() {
	//输入：nums = [2,7,11,15], target = 9
	//输出：[0,1]
	nums := []int{2, 7, 11, 15}
	target := 9

	res := TwoSum(nums, target)
	fmt.Println("res = ", res)
}

func TwoSum(nums []int, target int) []int {
	var result []int = make([]int, 2)
	for k, v := range nums {
		for k1, v1 := range nums {
			if k == k1 {
				continue
			}

			if v+v1 == target {
				result = []int{k, k1}
				return result
			}
		}
	}
	return result
}
