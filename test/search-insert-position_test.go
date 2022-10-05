package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestSearchInsert(t *testing.T) {
	nums := []int{2, 7, 11, 15}
	target := 9

	res := leetcode.SearchInsert(nums, target)
	if res != 2 {
		t.Error("two sum error")
	}
}
