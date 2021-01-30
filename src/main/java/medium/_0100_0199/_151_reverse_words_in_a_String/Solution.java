package medium._0100_0199._151_reverse_words_in_a_String;

//Given an input string s, reverse the order of the words.
//
// A word is defined as a sequence of non-space characters. The words in s will
//be separated by at least one space.
//
// Return a string of the words in reverse order concatenated by a single space.
//
//
// Note that s may contain leading or trailing spaces or multiple spaces between
// two words. The returned string should only have a single space separating the w
//ords. Do not include any extra spaces.
//
//
// Example 1:
//
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//
//
// Example 2:
//
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing space
//s.
//
//
// Example 3:
//
//
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single
//space in the reversed string.
//
//
// Example 4:
//
//
//Input: s = "  Bob    Loves  Alice   "
//Output: "Alice Loves Bob"
//
//
// Example 5:
//
//
//Input: s = "Alice does not even like bob"
//Output: "bob like even not does Alice"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 104
// s contains English letters (upper-case and lower-case), digits, and spaces ' '.
// There is at least one word in s.
//
//
//
//
// Follow up:
//
//
// Could you solve it in-place with O(1) extra space?
//
//
//
// Related Topics String
// 👍 1465 👎 3127


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了76.04% 的Java用户
  public String reverseWords(String s) {
    char[] res = new char[s.length()];
    char[] arr = s.toCharArray();
    int len = s.length(), idx = 0;
    for (int i = len - 1; i > -1; i--) {
      if (arr[i] == ' ') {
        continue;
      }
      int sIdx = i;
      while (-1 < sIdx && arr[sIdx] != ' ') {
        sIdx--;
      }
      for (int j = 1; sIdx + j <= i; j++) {
        res[idx++] = arr[sIdx + j];
      }
      i = sIdx;
      if (idx < len) {
        res[idx++] = ' ';
      }
    }
    return new String(res, 0, res[idx - 1] == ' ' ? idx - 1 : idx);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

