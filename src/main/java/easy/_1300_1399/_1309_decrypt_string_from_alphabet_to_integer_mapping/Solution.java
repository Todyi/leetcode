package easy._1300_1399._1309_decrypt_string_from_alphabet_to_integer_mapping;

//Given a string s formed by digits ('0' - '9') and '#' .
// We want to map s to English lowercase characters as follows:
//
//
// Characters ('a' to 'i') are represented by ('1' to '9') respectively.
// Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//
//
// Return the string formed after mapping.
//
// It's guaranteed that a unique mapping will always exist.
//
//
// Example 1:
//
//
//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
//
//
// Example 2:
//
//
//Input: s = "1326#"
//Output: "acz"
//
//
// Example 3:
//
//
//Input: s = "25#"
//Output: "y"
//
//
// Example 4:
//
//
//Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
//Output: "abcdefghijklmnopqrstuvwxyz"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s[i] only contains digits letters ('0'-'9') and '#' letter.
// s will be valid string such that mapping is always possible.
//
// Related Topics String
// 👍 372 👎 39


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.3 MB,击败了85.91% 的Java用户
  public String freqAlphabets(String s) {
    StringBuilder sb = new StringBuilder();
    char[] map = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g',
        'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'
    };
    char[] arr = s.toCharArray();

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == '#') {
        sb.append(map[(arr[i - 2] - '0') * 10 + (arr[i - 1] - '0') - 1]);
        i -= 2;
      } else {
        sb.append(map[arr[i] - '0' - 1]);
      }
    }
    return sb.reverse().toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

