package easy._900_999._941_valid_mountain_array;

//Given an array A of integers, return true if and only if it is a valid mountain array.
//
// Recall that A is a mountain array if and only if:
//
//
// A.length >= 3
// There exists some i with 0 < i < A.length - 1 such that:
//
// A[0] < A[1] < ... A[i-1] < A[i]
// A[i] > A[i+1] > ... > A[A.length - 1]
//
//
//
//
//
//
//
//
//
// Example 1:
//
//
//Input: [2,1]
//Output: false
//
//
//
// Example 2:
//
//
//Input: [3,5,5]
//Output: false
//
//
//
// Example 3:
//
//
//Input: [0,3,2,1]
//Output: true
//
//
//
//
//
// Note:
//
//
// 0 <= A.length <= 10000
// 0 <= A[i] <= 10000
//
//
//
//
//
//
//
//
// Related Topics Array
// 👍 472 👎 74


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.4 MB,击败了57.32% 的Java用户
  public boolean validMountainArray(int[] A) {
    if (A.length < 3) {
      return false;
    }
    int i = 1;
    for (; i < A.length; i++) {
      if (A[i] <= A[i - 1]) {
        break;
      }
    }
    if (i == A.length || i == 1) {
      return false;
    }
    for (; i < A.length; i++) {
      if (A[i - 1] <= A[i]) {
        return false;
      }
    }

    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

