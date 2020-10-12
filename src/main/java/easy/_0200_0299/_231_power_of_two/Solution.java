package easy._0200_0299._231_power_of_two;

//Given an integer, write a function to determine if it is a power of two.
//
// Example 1:
//
//
//Input: 1
//Output: true
//Explanation: 20 = 1
//
//
// Example 2:
//
//
//Input: 16
//Output: true
//Explanation: 24 = 16
//
// Example 3:
//
//
//Input: 218
//Output: false
// Related Topics Math Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:36.2 MB,击败了7.32% 的Java用户
  public boolean isPowerOfTwo(int n) {
    if (n == 0){
      return false;
    }

    if (n == 1) {
      return true;
    }

    int num = n;
    if (n != (num >> 1) << 1) {
      return false;
    }
    return isPowerOfTwo(n >> 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

