package medium._0000_0099._012_integer_to_roman;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//
// For example, 2 is written as II in Roman numeral, just two one's added together.
// 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
// which is XX + V + II.
//
// Roman numerals are usually written largest to smallest from left to right.
// However, the numeral for four is not IIII. Instead, the number four is written as IV.
// Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX. There are six instance
//s where subtraction is used:
//
//
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.
//
//
// Given an integer, convert it to a roman numeral.
//
//
// Example 1:
//
//
//Input: num = 3
//Output: "III"
//
//
// Example 2:
//
//
//Input: num = 4
//Output: "IV"
//
//
// Example 3:
//
//
//Input: num = 9
//Output: "IX"
//
//
// Example 4:
//
//
//Input: num = 58
//Output: "LVIII"
//Explanation: L = 50, V = 5, III = 3.
//
//
// Example 5:
//
//
//Input: num = 1994
//Output: "MCMXCIV"
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//
//
//
// Constraints:
//
//
// 1 <= num <= 3999
//
// Related Topics Math String
// 👍 1268 👎 2790


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了89.66% 的Java用户
  //  内存消耗:38.5 MB,击败了8.01% 的Java用户
  public String intToRoman(int num) {
    String[] digit = {
        "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
    };
    String[] ten = {
        "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"
    };
    String[] hundred = {
        "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
    };
    StringBuilder sb = new StringBuilder();
    int tmp;
    while (1000 <= num) {
      sb.append('M');
      num -= 1000;
    }
    if (100 <= num) {
      tmp = num / 100;
      num -= tmp * 100;
      sb.append(hundred[tmp]);
    }
    if (10 <= num) {
      tmp = num / 10;
      num -= tmp * 10;
      sb.append(ten[tmp]);
    }
    sb.append(digit[num]);
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

