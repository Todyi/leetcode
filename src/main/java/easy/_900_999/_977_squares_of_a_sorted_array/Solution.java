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
//  public int[] sortedSquares(int[] A) {
//    for (int i = 0; i < A.length; i++) {
//      A[i] = A[i] * A[i];
//    }
//    Arrays.sort(A);
//    return A;
//  }

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
  //  Memory Usage: 41.8 MB, less than 40.75% of Java online submissions for Squares of a Sorted Array.
  public int[] sortedSquares(int[] A) {
    int len = A.length, lSquare, rSquare;
    int l = 0, r = len - 1, i = len - 1;
    int[] res = new int[len];
    while (l <= r) {
      lSquare = A[l] * A[l];
      rSquare = A[r] * A[r];
      if (lSquare < rSquare) {
        res[i--] = rSquare;
        r--;
      } else {
        res[i--] = lSquare;
        l++;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

