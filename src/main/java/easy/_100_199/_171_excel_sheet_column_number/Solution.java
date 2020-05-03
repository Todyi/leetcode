package easy._100_199._171_excel_sheet_column_number;

//Given a column title as appear in an Excel sheet, return its corresponding col
//umn number.
//
// For example:
//
//
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28
//    ...
//
//
// Example 1:
//
//
//Input: "A"
//Output: 1
//
//
// Example 2:
//
//
//Input: "AB"
//Output: 28
//
//
// Example 3:
//
//
//Input: "ZY"
//Output: 701
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.4 MB,击败了5.88% 的Java用户
  public int titleToNumber(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    int num = 0;
    for (int i = s.length() - 1; 0 <= i; i--) {
      num += (s.charAt(i) - 65 + 1) * Math.pow(26, s.length() - 1 - i);
    }
    return num;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

