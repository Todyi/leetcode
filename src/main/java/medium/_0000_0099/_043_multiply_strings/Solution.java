package medium._0000_0099._043_multiply_strings;

//Given two non-negative integers num1 and num2 represented as strings,
// return the product of num1 and num2, also represented as a string.
//
// Note: You must not use any built-in BigInteger library or convert the inputs
//to integer directly.
//
//
// Example 1:
// Input: num1 = "2", num2 = "3"
//Output: "6"
// Example 2:
// Input: num1 = "123", num2 = "456"
//Output: "56088"
//
//
// Constraints:
//
//
// 1 <= num1.length, num2.length <= 200
// num1 and num2 consist of digits only.
// Both num1 and num2 do not contain any leading zero, except the number 0 itself.
//
// Related Topics Math String
// 👍 1997 👎 871


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了5.38% 的Java用户
  public String multiply(String num1, String num2) {
    int len1 = num1.length(), len2 = num2.length(), productLen = len1 + len2;
    char[] arr1 = num1.toCharArray(), arr2 = num2.toCharArray();
    int[] product = new int[productLen];
    for (int i = len1 - 1; i > -1; i--) {
      int n1 = arr1[i] - '0';
      for (int j = len2 - 1; j > -1; j--) {
        product[i + j + 1] += n1 * (arr2[j] - '0');
      }
    }
    int carry = 0, idx = 0;
    for (int i = productLen - 1; i >= 0; i--) {
      product[i] += carry;
      carry = product[i] / 10;
      product[i] %= 10;
    }
    while (idx < productLen && product[idx] == 0) {
      idx++;
    }
    if (idx == productLen) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    for (int i = idx; i < productLen; i++) {
      sb.append(product[i]);
    }
    return sb.toString();
  }
}
//leetcode submit region end(Prohibit modification and deletion)

