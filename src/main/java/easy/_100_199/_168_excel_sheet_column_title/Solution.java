package easy._100_199._168_excel_sheet_column_title;

//Given a positive integer, return its corresponding column title as appear in a
//n Excel sheet.
//
// For example:
//
//
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB
//    ...
//
//
// Example 1:
//
//
//Input: 1
//Output: "A"
//
//
// Example 2:
//
//
//Input: 28
//Output: "AB"
//
//
// Example 3:
//
//
//Input: 701
//Output: "ZY"
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了5.13% 的Java用户
  public String convertToTitle(int n) {
    StringBuffer result = new StringBuffer();
    int flag = n;
    while (0 < flag) {
      int remain = flag % 26;
      flag = flag / 26;
      if (remain == 0) {
        remain = 26;
        flag--;
      }
      result.append((char) (remain + 65 - 1));
    }
    return result.reverse().toString();

  }

  public static void main(String[] args) {
    System.out.println(Integer.valueOf('A'));
    System.out.println(Integer.valueOf('Z'));
    System.out.println(1 / 26);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

