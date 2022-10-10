package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestReverseLeftWords(t *testing.T) {

	s := "abcdefg"
	k := 2
	res := leetcode.ReverseLeftWords(s, k)
	if res != "bacdfeg" {
		t.Error("search error")
	}
}
