package easy._66_plus_one;/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {

//  Accepted
//109/109 cases passed (0 ms)
//Your runtime beats 100 % of java submissions
//Your memory usage beats 5.64 % of java submissions (37.9 MB)

  public int[] plusOne(int[] digits) {
    if (digits[0] == 0) {
      digits[0] = 1;
      return digits;
    }
    boolean carry = false;
    for (int i = digits.length - 1; i >= 0; i--) {
      int right = digits[i];
      if (i == digits.length - 1) {
        right++;
      }

      if (carry) {
        right++;
        carry = false;
      }

      if (right < 10) {
        digits[i] = right;
        break;
      }
      digits[i] = right - 10;
      carry = true;
    }

    if (carry) {
      int[] carryArr = new int[digits.length + 1];
      carryArr[0] = 1;
      for (int i = 0; i < digits.length; i++) {
        carryArr[i + 1] = digits[i];
      }
      digits = carryArr;
    }

    return digits;
  }
}
// @lc code=end

