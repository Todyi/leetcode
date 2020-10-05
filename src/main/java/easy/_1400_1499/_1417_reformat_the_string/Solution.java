package easy._1400_1499._1417_reformat_the_string;

//Given alphanumeric string s.
// (Alphanumeric string is a string consisting of lowercase English letters and digits).
//
// You have to find a permutation of the string where no letter is followed by another letter
// and no digit is followed by another digit.
// That is, no two adjacent characters have the same type.
//
// Return the reformatted string or return an empty string
// if it is impossible to reformat the string.
//
//
// Example 1:
//
//
//Input: s = "a0b1c2"
//Output: "0a1b2c"
//Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c",
// "0c2a1b" are also valid permutations.
//
//
// Example 2:
//
//
//Input: s = "leetcode"
//Output: ""
//Explanation: "leetcode" has only characters so we cannot separate them by digits.
//
//
// Example 3:
//
//
//Input: s = "1229857369"
//Output: ""
//Explanation: "1229857369" has only digits so we cannot separate them by characters.
//
//
// Example 4:
//
//
//Input: s = "covid2019"
//Output: "c2o0v1i9d"
//
//
// Example 5:
//
//
//Input: s = "ab123"
//Output: "1a2b3"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 500
// s consists of only lowercase English letters and/or digits.
//
// Related Topics String
// 👍 156 👎 41


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Reformat The String.
  //  Memory Usage: 38.6 MB, less than 99.95% of Java online submissions for Reformat The String.
  public String reformat(String s) {
    char[] arr = s.toCharArray();
    String res = reformat(arr, 0, 1);
    if (0 < res.length()) {
      return res;
    }
    return reformat(arr, 1, 0);
  }

  public void swap(int i, int j, char[] arr) {
    char tmp = arr[j];
    arr[j] = arr[i];
    arr[i] = tmp;
  }

  public String reformat(char[] arr, int charIdx, int digitIdx) {
    while (charIdx < arr.length) {
      if (Character.isLetter(arr[charIdx])) {
        charIdx += 2;
      } else {
        if (arr.length <= digitIdx) {
          return "";
        }
        swap(charIdx, digitIdx, arr);
        digitIdx += 2;
      }
    }
    while (digitIdx < arr.length) {
      if (Character.isLetter(arr[digitIdx])) {
        return "";
      }
      digitIdx += 2;
    }
    return String.valueOf(arr);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

