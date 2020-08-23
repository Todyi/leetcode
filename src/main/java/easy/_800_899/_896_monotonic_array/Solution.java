package easy._800_899._896_monotonic_array;

//An array is monotonic if it is either monotone increasing or monotone decreasing.
//
// An array A is monotone increasing if for all i <= j, A[i] <= A[j].
// An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
//
// Return true if and only if the given array A is monotonic.
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
//Input: [1,2,2,3]
//Output: true
//
//
//
// Example 2:
//
//
//Input: [6,5,4,4]
//Output: true
//
//
//
// Example 3:
//
//
//Input: [1,3,2]
//Output: false
//
//
//
// Example 4:
//
//
//Input: [1,2,4,5]
//Output: true
//
//
//
// Example 5:
//
//
//Input: [1,1,1]
//Output: true
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 50000
// -100000 <= A[i] <= 100000
//
//
//
//
//
//
// Related Topics Array
// 👍 720 👎 37


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:47.8 MB,击败了48.15% 的Java用户
  public boolean isMonotonic(int[] A) {
    if (A.length == 1) {
      return true;
    }
    boolean increasing = A[0] <= A[A.length - 1];
    for (int i = 1; i < A.length; i++) {
      if ((increasing && A[i] < A[i - 1]) || (!increasing && A[i - 1] < A[i])) {
        return false;
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

