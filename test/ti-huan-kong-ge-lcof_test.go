package test

import (
	"testing"

	"awesome.leetcode.algorithm/leetcode"
)

func TestReplaceSpace(t *testing.T) {

	s := "We are happy."
	res := leetcode.ReplaceSpace(s)
	if res != "We%20are%20happy." {
		t.Error("ReplaceSpace error")
	}
}
