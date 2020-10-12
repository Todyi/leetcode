package easy._0400_0499._415_add_strings;

//Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
//
// Note:
//
// The length of both num1 and num2 is < 5100.
// Both num1 and num2 contains only digits 0-9.
// Both num1 and num2 does not contain any leading zero.
// You must not use any built-in BigInteger library or convert the inputs to int
//eger directly.
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了96.69% 的Java用户
  //  内存消耗:39.4 MB,击败了6.25% 的Java用户
//  public String addStrings(String num1, String num2) {
//    if (num1.length() < num2.length()) {
//      return addStrings(num2, num1);
//    }
//    StringBuilder sb = new StringBuilder();
//    int n1L = num1.length();
//    int n2L = num2.length();
//    int carry = 0;
//    for (int i = 1; i <= n1L; i++) {
//      int n1 = num1.charAt(n1L - i) - '0';
//      int n2 = -1 < n2L - i ? num2.charAt(n2L - i) - '0' : 0;
//      int sum = (n1 + n2 + carry) % 10;
//      carry = (n1 + n2 + carry) / 10;
//      sb.append(sum);
//    }
//    if (0 < carry) {
//      sb.append(carry);
//    }
//
//    return sb.reverse().toString();
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了6.25% 的Java用户
  public String addStrings(String num1, String num2) {
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (-1 < i || -1 < j) {
      int sum = carry;
      if (-1 < i) {
        sum += num1.charAt(i--) - '0';
      }
      if (-1 < j) {
        sum += num2.charAt(j--) - '0';
      }
      carry = sum / 10;
      sum = sum % 10;
      sb.append(sum);
    }
    if (0 < carry) {
      sb.append(carry);
    }
    return sb.reverse().toString();

  }
}
//leetcode submit region end(Prohibit modification and deletion)

