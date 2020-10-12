package easy._0800_0899._844_backspace_string_compare;

//Given two strings S and T, return if they are equal when both are typed into empty text editors.
// # means a backspace character.
//
// Note that after backspacing an empty text, the text will continue empty.
//
//
// Example 1:
//
//
//Input: S = "ab#c", T = "ad#c"
//Output: true
//Explanation: Both S and T become "ac".
//
//
//
// Example 2:
//
//
//Input: S = "ab##", T = "c#d#"
//Output: true
//Explanation: Both S and T become "".
//
//
//
// Example 3:
//
//
//Input: S = "a##c", T = "#a#c"
//Output: true
//Explanation: Both S and T become "c".
//
//
//
// Example 4:
//
//
//Input: S = "a#c", T = "b"
//Output: false
//Explanation: S becomes "c" while T becomes "b".
//
//
// Note:
//
//
// 1 <= S.length <= 200
// 1 <= T.length <= 200
// S and T only contain lowercase letters and '#' characters.
//
//
// Follow up:
//
//
// Can you solve it in O(N) time and O(1) space?
//
//
//
//
//
// Related Topics Two Pointers Stack
// 👍 1750 👎 91


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.7 MB,击败了75.85% 的Java用户
  public boolean backspaceCompare(String S, String T) {
    S = toRealStr(S.toCharArray());
    T = toRealStr(T.toCharArray());
    return S.equals(T);
  }

  public String toRealStr(char[] arr) {
    StringBuilder sb = new StringBuilder();
    for (char c : arr) {
      if (c == '#') {
        if (0 < sb.length()) {
          sb.setLength(sb.length() - 1);
        }
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

