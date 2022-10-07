package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestReverseStr(t *testing.T) {

	s := "abcdefg"
	k := 2
	res := leetcode.ReverseStr(s, k)
	if res != "bacdfeg" {
		t.Error("search error")
	}
}
