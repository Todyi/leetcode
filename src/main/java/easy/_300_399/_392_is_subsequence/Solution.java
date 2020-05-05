package easy._300_399._392_is_subsequence;

//
//Given a string s and a string t, check if s is subsequence of t.
//
//
//
//You may assume that there is only lower case English letters in both s and t.
//t is potentially a very long (length ~= 500,000) string, and s is a short string
// (<=100).
//
//
//
//A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters
//without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
//
//
// Example 1:
//s = "abc", t = "ahbgdc"
//
//
//Return true.
//
//
// Example 2:
//s = "axc", t = "ahbgdc"
//
//
//Return false.
//
//
// Follow up:
//If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you w
//ant to check one by one to see if T has its subsequence. In this scenario, how w
//ould you change your code?
//
// Credits: Special thanks to @pbrother for adding this problem and creating all
// test cases. Related Topics Binary Search Dynamic Programming Greedy


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


  //  解答成功:
  //  执行耗时:4 ms,击败了87.72% 的Java用户
  //  内存消耗:44.6 MB,击败了100.00% 的Java用户
  public boolean isSubsequence(String s, String t) {
    if (s.length() == 0 && t.length() == 0) {
      return true;
    }

    if (t.length() == 0) {
      return false;
    }

    if (s.length() == 0) {
      return true;
    }

    char[] tArr = t.toCharArray();
    char[] sArr = s.toCharArray();

    int tLeft = 0;
    int sLeft = 0;

    while (sLeft < sArr.length && tLeft < tArr.length) {
      if (sArr[sLeft] == tArr[tLeft]) {
        sLeft++;
        tLeft++;
      } else {
        tLeft++;
      }
    }

    return sLeft == sArr.length;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

