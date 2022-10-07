package leetcode

func ReplaceSpace(s string) string {
	var str = []byte{}
	arr := []byte(s)

	for i := 0; i < len(arr); i++ {
		if arr[i] == ' ' {
			str = append(str, '%', '2', '0')
		} else {
			str = append(str, arr[i])
		}
	}
	return string(str)
}
