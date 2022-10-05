package leetcode

func SearchInsert(nums []int, target int) int {
	i := len(nums) / 2

	if nums[i] == target {
		return i
	}

	if i == 0 && nums[i] < target {
		return 1
	}

	if i == 0 {
		return 0
	}

	if nums[i] < target {
		return SearchInsert(nums[i:], target) + i
	}

	return SearchInsert(nums[:i], target)
}
