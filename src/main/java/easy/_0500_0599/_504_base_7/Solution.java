package easy._0500_0599._504_base_7;

//Given an integer, return its base 7 string representation.
//
// Example 1:
//
//Input: 100
//Output: "202"
//
//
//
// Example 2:
//
//Input: -7
//Output: "-10"
//
//
//
// Note:
//The input will be in range of [-1e7, 1e7].
//


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了88.98% 的Java用户
  //  内存消耗:36.8 MB,击败了7.14% 的Java用户
//  public String convertToBase7(int num) {
//    if (0 == num) {
//      return "0";
//    }
//
//    StringBuilder sb = new StringBuilder();
//
//    int tmp = 0 < num ? num : -num;
//
//    while (0 < tmp) {
//      sb.append(tmp % 7);
//      tmp /= 7;
//    }
//    sb.append(0 < num ? "" : "-");
//
//    return sb.reverse().toString();
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.7 MB,击败了7.14% 的Java用户
  public String convertToBase7(int num) {
    return Integer.toString(num, 7);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

