package easy._1400_1499._1422_maximum_score_after_splitting_a_string;

//Given a string s of zeros and ones,
// return the maximum score after splitting the string into two non-empty substrings
// (i.e. left substring and right substring).
//
// The score after splitting a string is
// the number of zeros in the left substring plus the number of ones in the right substring.
//
//
// Example 1:
//
//
//Input: s = "011101"
//Output: 5
//Explanation:
//All possible ways of splitting s into two non-empty substrings are:
//left = "0" and right = "11101", score = 1 + 4 = 5
//left = "01" and right = "1101", score = 1 + 3 = 4
//left = "011" and right = "101", score = 1 + 2 = 3
//left = "0111" and right = "01", score = 1 + 1 = 2
//left = "01110" and right = "1", score = 2 + 1 = 3
//
//
// Example 2:
//
//
//Input: s = "00111"
//Output: 5
//Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
//
//
// Example 3:
//
//
//Input: s = "1111"
//Output: 3
//
//
//
// Constraints:
//
//
// 2 <= s.length <= 500
// The string s consists of characters '0' and '1' only.
//
// Related Topics String
// 👍 221 👎 13


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了89.22% 的Java用户
  public int maxScore(String s) {
    char[] arr = s.toCharArray();
    int oneCount = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == '1') {
        oneCount++;
      }
    }
    int zeroCount = arr[0] == '0' ? 1 : 0, score = zeroCount + oneCount, tmp;
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] == '0') {
        zeroCount++;
      } else {
        oneCount--;
      }
      if (score < (tmp = zeroCount + oneCount)) {
        score = tmp;
      }
    }

    return score;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

