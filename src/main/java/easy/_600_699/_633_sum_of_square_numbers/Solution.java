package easy._600_699._633_sum_of_square_numbers;

//Given a non-negative integer c,
// your task is to decide whether there're two integers a and b such that a2 + b2 = c.
//
// Example 1:
//
//
//Input: 5
//Output: True
//Explanation: 1 * 1 + 2 * 2 = 5
//
//
//
//
// Example 2:
//
//
//Input: 3
//Output: False
//
//
//
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  public boolean judgeSquareSum(int c) {
    int flag = (int) Math.sqrt(c);
    if (flag * flag == c) {
      return true;
    }
    for (int a = 1; a <= flag; a++) {
      int b = (int) Math.sqrt(c - (a * a));
      if (a * a + b * b == c) {
        return true;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

