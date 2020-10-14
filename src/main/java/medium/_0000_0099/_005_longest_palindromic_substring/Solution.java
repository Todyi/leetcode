package medium._0000_0099._005_longest_palindromic_substring;

//Given a string s, return the longest palindromic substring in s.
//
//
// Example 1:
//
//
//Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//
//
// Example 2:
//
//
//Input: s = "cbbd"
//Output: "bb"
//
//
// Example 3:
//
//
//Input: s = "a"
//Output: "a"
//
//
// Example 4:
//
//
//Input: s = "ac"
//Output: "a"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s consist of only digits and English letters (lower-case and/or upper-case),
//
//
// Related Topics String Dynamic Programming
// 👍 8272 👎 583


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了5.18% 的Java用户
  int l, r, len;

  public String longestPalindrome(String s) {
    len = s.length();
    if (len < 2) {
      return s;
    }
    findPalindrome(s.toCharArray(), 0);
    return s.substring(l, r + 1);
  }

  public void findPalindrome(char[] arr, int i) {
    if (i == len - 1 || 2 * (len - i) < r - l) {
      return;
    }
    int start = i, end = i;
    while (end < arr.length - 1 && arr[end] == arr[end + 1]) {
      end++;
    }
    i = end;
    while (0 < start && end < arr.length - 1 && arr[start - 1] == arr[end + 1]) {
      start--;
      end++;
    }
    if (r - l < end - start) {
      l = start;
      r = end;
    }
    findPalindrome(arr, i + 1);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

