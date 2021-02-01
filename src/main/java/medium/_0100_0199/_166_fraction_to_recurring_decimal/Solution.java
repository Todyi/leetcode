package medium._0100_0199._166_fraction_to_recurring_decimal;

//Given two integers representing the numerator and denominator of a fraction,
// return the fraction in string format.
//
// If the fractional part is repeating, enclose the repeating part in parentheses.
//
// If multiple answers are possible, return any of them.
//
// It is guaranteed that the length of the answer string is less than 104 for al
//l the given inputs.
//
//
// Example 1:
// Input: numerator = 1, denominator = 2
//Output: "0.5"
// Example 2:
// Input: numerator = 2, denominator = 1
//Output: "2"
// Example 3:
// Input: numerator = 2, denominator = 3
//Output: "0.(6)"
// Example 4:
// Input: numerator = 4, denominator = 333
//Output: "0.(012)"
// Example 5:
// Input: numerator = 1, denominator = 5
//Output: "0.2"
//
//
// Constraints:
//
//
// -231 <= numerator, denominator <= 231 - 1
// denominator != 0
//
// Related Topics Hash Table Math
// 👍 1055 👎 2159


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Fraction to Recurring Decimal.
  //  Memory Usage: 36.4 MB, less than 64.61% of Java online submissions for Fraction to Recurring Decimal.
  public String fractionToDecimal(int numerator, int denominator) {
    if (numerator == 0) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();

    if (0 < numerator ^ 0 < denominator) {
      sb.append('-');
    }
    long a = Math.abs((long) numerator), b = Math.abs((long) denominator);
    long remain = a % b;
    sb.append(a / b);
    if (0 < remain) {
      sb.append('.');
    }
    HashMap<Long, Integer> map = new HashMap<>();
    a = remain * 10;
    while (0 != remain) {
      if (map.containsKey(remain)) {
        sb.insert(map.get(remain), "(");
        sb.append(')');
        break;
      }
      map.put(remain, sb.length());
      sb.append(a / b);
      remain = a % b;
      a = remain * 10;
    }
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

