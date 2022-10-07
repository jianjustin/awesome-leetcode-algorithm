package leetcode

func ReverseStr(s string, k int) string {
	if len(s) > 2*k {
		return ReverseStr(s[:2*k], k) + ReverseStr(s[2*k:], k)
	}

	arr := []byte(s)
	start, end := 0, len(s)-1
	if len(s) > k {
		end = k - 1
	}

	for start < end {
		arr[start], arr[end] = arr[end], arr[start]

		start++
		end--
	}

	return string(arr[:])
}
