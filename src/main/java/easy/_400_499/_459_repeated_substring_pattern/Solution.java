package easy._400_499._459_repeated_substring_pattern;

//Given a non-empty string check if it can be constructed by taking a substring of it
// and appending multiple copies of the substring together. You may assume
// the given string consists of lowercase English letters only and its length will not exceed 10000.
//
//
//
// Example 1:
//
//
//Input: "abab"
//Output: True
//Explanation: It's the substring "ab" twice.
//
//
// Example 2:
//
//
//Input: "aba"
//Output: False
//
//
// Example 3:
//
//
//Input: "abcabcabcabc"
//Output: True
//Explanation: It's the substring "abc" four times. (And the substring "abcabc"
//twice.)
//
// Related Topics String


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1557 ms,击败了5.02% 的Java用户
  //  内存消耗:40.2 MB,击败了9.52% 的Java用户
  public boolean repeatedSubstringPattern(String s) {
    char[] sArr = s.toCharArray();
    int subLen = 1;
    int half = sArr.length >> 1;
    boolean isRepeated = false;
    while (subLen <= half) {
      char[] sub = Arrays.copyOf(sArr, subLen);
      for (int i = 0; i < sArr.length; i++) {
        if (sub[i % subLen] != sArr[i]) {
          isRepeated = false;
          subLen++;
          break;
        }
        isRepeated = true;
      }
      if (isRepeated) {
        break;
      }
    }
    return isRepeated && subLen <= half && sArr.length % subLen == 0 ? true : false;

  }
}
//leetcode submit region end(Prohibit modification and deletion)

