package easy._900_999._977_squares_of_a_sorted_array;

//Given an array of integers A sorted in non-decreasing order,
// return an array of the squares of each number, also in sorted non-decreasing order.
//
//
//
//
// Example 1:
//
//
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//
//
//
// Example 2:
//
//
//Input: [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 10000
// -10000 <= A[i] <= 10000
// A is sorted in non-decreasing order.
//
//
// Related Topics Array Two Pointers
// 👍 1362 👎 91


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了40.39% 的Java用户
  //  内存消耗:40.9 MB,击败了91.96% 的Java用户
  public int[] sortedSquares(int[] A) {
    for (int i = 0; i < A.length; i++) {
      A[i] = A[i] * A[i];
    }
    Arrays.sort(A);
    return A;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

