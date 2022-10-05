package leetcode

func Search(nums []int, target int) int {
	i := len(nums) / 2

	if nums[i] == target {
		return i
	}

	if i == 0 {
		return -1
	}

	if nums[i] < target {
		num := Search(nums[i:], target)
		if num == -1 {
			return -1
		} else {
			return num + i
		}
	}

	return Search(nums[:i], target)
}
