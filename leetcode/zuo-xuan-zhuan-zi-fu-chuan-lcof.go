package leetcode

func ReverseLeftWords(s string, n int) string {
	arr := []byte(s)
	Reverse1(arr, 0, len(s)-1)
	Reverse1(arr, 0, len(s)-n-1)
	Reverse1(arr, len(s)-n, len(s)-1)
	return string(arr)

}

func Reverse1(s []byte, start int, end int) {
	for start < end {
		s[start], s[end] = s[end], s[start]

		start++
		end--
	}
}
