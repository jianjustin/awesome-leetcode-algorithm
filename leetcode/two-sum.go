package leetcode

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
