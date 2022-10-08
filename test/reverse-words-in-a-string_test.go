package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestReverseWords(t *testing.T) {

	s := "F R  I   E    N     D      S      "
	res := leetcode.ReverseWords(s)
	if res != "bacdfeg" {
		t.Error("search error")
	}
}
