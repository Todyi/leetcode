package easy._1400_1499._1486_xor_operation_in_an_array;

//Given an integer n and an integer start.
//
// Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
//
// Return the bitwise XOR of all elements of nums.
//
//
// Example 1:
//
//
//Input: n = 5, start = 0
//Output: 8
//Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8)
//= 8.
//Where "^" corresponds to bitwise XOR operator.
//
//
// Example 2:
//
//
//Input: n = 4, start = 3
//Output: 8
//Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
//
// Example 3:
//
//
//Input: n = 1, start = 7
//Output: 7
//
//
// Example 4:
//
//
//Input: n = 10, start = 5
//Output: 2
//
//
//
// Constraints:
//
//
// 1 <= n <= 1000
// 0 <= start <= 1000
// n == nums.length
// Related Topics Array Bit Manipulation
// 👍 249 👎 134


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:35.4 MB,击败了99.79% 的Java用户
  public int xorOperation(int n, int start) {
    int res = 0;
    for (int i = 0; i < n; i++) {
      res ^= start + 2 * i;

    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
