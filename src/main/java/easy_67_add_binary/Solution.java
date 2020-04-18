package easy_67_add_binary;/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {

  //294/294 cases passed (2 ms)
  //Your runtime beats 78.21 % of java submissions
  //Your memory usage beats 5.62 % of java submissions (39.3 MB)
  public String addBinary(String a, String b) {
    boolean aLonger = b.length() < a.length();
    char[] longArr = aLonger ? a.toCharArray() : b.toCharArray();
    char[] shortArr = !aLonger ? a.toCharArray() : b.toCharArray();
    int carry = 0;
    for (int i = longArr.length - 1; i >= 0; i--) {
      int shortFlag = shortArr.length - (longArr.length - i);
      int shortItem = 0 <= shortFlag ? Integer.valueOf(shortArr[shortFlag] - '0') : 0;
      int longItem = Integer.valueOf(longArr[i] - '0');
      int sum = shortItem + longItem + carry;
      longArr[i] = (char) (sum % 2 + '0');
      carry = sum >> 1;
    }
    String result = new String(longArr);
    if (carry == 1) {
      result = "1" + result;
    }

    return result;
  }

}
// @lc code=end

