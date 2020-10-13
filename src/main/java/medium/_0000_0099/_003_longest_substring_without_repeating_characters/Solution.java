package medium._0000_0099._003_longest_substring_without_repeating_characters;

//Given a string s, find the length of the longest substring without repeating characters.
//
//
// Example 1:
//
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//
//
// Example 2:
//
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//
//
// Example 3:
//
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
// Example 4:
//
//
//Input: s = ""
//Output: 0
//
//
//
// Constraints:
//
//
// 0 <= s.length <= 5 * 10^4
// s consists of English letters, digits, symbols and spaces.
//
// Related Topics Hash Table Two Pointers String Sliding Window
// 👍 11201 👎 624


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了99.86% 的Java用户
  //  内存消耗:39.2 MB,击败了6.28% 的Java用户
//  public int lengthOfLongestSubstring(String s) {
//    if (s.length() < 2) {
//      return s.length();
//    }
//    Integer[] map = new Integer[256];
//    char[] arr = s.toCharArray();
//    int res = 1, cur = 1, tmp;
//    map[arr[0]] = 0;
//    //0123456789 i
//    //abcdeakgeh arr[i]
//    //1234556745 cur
//    for (int i = 1; i < arr.length; i++) {
//      if (map[arr[i]] == null) {
//        cur++;
//        if (res < cur) {
//          res = cur;
//        }
//      } else {
//        tmp = map[arr[i]];
//        init(map, arr, i - cur, tmp + 1);
//        cur = i - tmp;
//      }
//      map[arr[i]] = i;
//    }
//    return res;
//  }
//
//  public void init(Integer[] map, char[] arr, int start, int end) {
//    for (int i = start; i < end; i++) {
//      map[arr[i]] = null;
//    }
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了6.28% 的Java用户
  public int lengthOfLongestSubstring(String s) {
    if (s.length() < 2) {
      return s.length();
    }
    char[] arr = s.toCharArray();
    int res = 1, cur, start = 0;
    //0123456789 i
    //abcdeakgeh arr[i]
    //1234556745 cur
    //0000011155 start
    for (int i = 1; i < arr.length; i++) {
      for (int j = start; j < i; j++) {
        if (arr[j] == arr[i]) {
          start = j + 1;
          break;
        }
      }
      if (res < (cur = i - start + 1)) {
        res = cur;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

