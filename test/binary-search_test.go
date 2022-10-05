package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestSearch(t *testing.T) {
	nums := []int{-1, 0, 3, 5, 9, 12}
	target := 9

	res := leetcode.Search(nums, target)
	if res != -1 && nums[res] != target {
		t.Error("search error")
	}
}
