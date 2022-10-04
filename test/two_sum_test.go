package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestTwoSum(t *testing.T) {
	nums := []int{2, 7, 11, 15}
	target := 9

	res := leetcode.TwoSum(nums, target)
	if res[0] != 0 || res[1] != 1 {
		t.Error("two sum error")
	}
}
