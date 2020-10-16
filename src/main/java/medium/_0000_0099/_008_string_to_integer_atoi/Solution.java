package medium._0000_0099._008_string_to_integer_atoi;

//Implement atoi which converts a string to an integer.
//
// The function first discards as many whitespace characters as necessary until
//the first non-whitespace character is found. Then, starting from this character
//takes an optional initial plus or minus sign followed by as many numerical digits as possible,
// and interprets them as a numerical value.
//
// The string can contain additional characters after those that form the integral number,
// which are ignored and have no effect on the behavior of this function.
//
// If the first sequence of non-whitespace characters in str is not a valid integral number,
// or if no such sequence exists because either str is empty
// or it contains only whitespace characters, no conversion is performed.
//
// If no valid conversion could be performed, a zero value is returned.
//
// Note:
//
//
// Only the space character ' ' is considered a whitespace character.
// Assume we are dealing with an environment that could only store integers with
//in the 32-bit signed integer range: [−2^31, 2^31 − 1].
// If the numerical value is out of the range of representable values,
// INT_MAX (2^31 − 1) or INT_MIN (−2^31) is returned.
//
//
//
// Example 1:
//
//
//Input: str = "42"
//Output: 42
//
//
// Example 2:
//
//
//Input: str = "   -42"
//Output: -42
//Explanation: The first non-whitespace character is '-', which is the minus sig
//n. Then take as many numerical digits as possible, which gets 42.
//
//
// Example 3:
//
//
//Input: str = "4193 with words"
//Output: 4193
//Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
//
//
// Example 4:
//
//
//Input: str = "words and 987"
//Output: 0
//Explanation: The first non-whitespace character is 'w', which is not a numerical digit
// or a +/- sign. Therefore no valid conversion could be performed.
//
//
// Example 5:
//
//
//Input: str = "-91283472332"
//Output: -2147483648
//Explanation: The number "-91283472332" is out of the range of a 32-bit signed
//integer. Thefore INT_MIN (−231) is returned.
//
//
//
// Constraints:
//
//
// 0 <= s.length <= 200
// s consists of English letters (lower-case and upper-case), digits, ' ', '+',
//'-' and '.'.
//
// Related Topics Math String
// 👍 1834 👎 10321


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了6.48% 的Java用户
  public int myAtoi(String s) {
    int len = s.length(), idx = -1;
    char[] arr = s.toCharArray();
    boolean minus = false;
    Long res = 0L;
    while (++idx < len) {
      if (arr[idx] == '-') {
        minus = true;
        break;
      } else if (arr[idx] != ' ') {
        if (arr[idx] != '+') {
          idx--;
        }
        break;
      }
    }
    while (++idx < len) {
      if (Character.isDigit(arr[idx])) {
        res = res * 10 + (arr[idx] - '0');
        if (Integer.MAX_VALUE < res) {
          return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
      } else {
        break;
      }
    }
    return minus ? -res.intValue() : res.intValue();

  }


}
//leetcode submit region end(Prohibit modification and deletion)

