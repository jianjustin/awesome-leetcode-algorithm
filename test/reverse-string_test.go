package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestReverseString(t *testing.T) {
	nums := []byte{'h', 'e', 'l', 'l', 'o'}

	leetcode.ReverseString(nums)
	if nums[0] != 'o' {
		t.Error("search error")
	}
}
