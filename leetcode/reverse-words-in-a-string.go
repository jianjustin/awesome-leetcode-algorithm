package leetcode

func ReverseWords(s string) string {
	arr := []byte(s)
	arr = ClearBlackWord(arr)

	Reverse(arr)
	ReverseWord(arr)

	return string(arr)
}

/*
 * 反转单个单词
 */
func ReverseWord(s []byte) {
	start, i, end := 0, 0, len(s)-1

	for i <= end+1 {
		if i == end+1 || s[i] == ' ' {
			start1, end1 := start, i-1

			for start1 < end1 {
				s[start1], s[end1] = s[end1], s[start1]

				start1++
				end1--
			}
			start = i + 1
		}
		i++
	}
}

/*
 * 反转整个字符串
 */
func Reverse(s []byte) {
	start, end := 0, len(s)-1

	for start < end {
		s[start], s[end] = s[end], s[start]

		start++
		end--
	}
}

/*
 * 清理头尾空格和中间多余空格
 */
func ClearBlackWord(s []byte) []byte {
	start, end := 0, len(s)-1

	for start < end {
		if s[start] == ' ' {
			start++
		}
		if s[end] == ' ' {
			end--
		}
		if s[start] != ' ' && s[end] != ' ' {
			break
		}
	}

	i, j := start, start
	for i <= end {
		s[j] = s[i]
		i++
		j++

		for i <= end && s[i] == ' ' && s[i-1] == ' ' {
			i++
		}
	}

	return s[start:j]
}
