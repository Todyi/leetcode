package easy._0900_0999._908_smallest_range_i;

//Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K,
// and add x to A[i].
//
// After this process, we have some array B.
//
// Return the smallest possible difference
// between the maximum value of B and the minimum value of B.
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
//Input: A = [1], K = 0
//Output: 0
//Explanation: B = [1]
//
//
//
// Example 2:
//
//
//Input: A = [0,10], K = 2
//Output: 6
//Explanation: B = [2,8]
//
//
//
// Example 3:
//
//
//Input: A = [1,3,6], K = 3
//Output: 0
//Explanation: B = [3,3,3] or B = [4,4,4]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 10000
// 0 <= A[i] <= 10000
// 0 <= K <= 10000
//
//
//
// Related Topics Math
// 👍 222 👎 1100


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Smallest Range I.
  //  Memory Usage: 47 MB, less than 9.03% of Java online submissions for Smallest Range I.
  public int smallestRangeI(int[] A, int K) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int i : A) {
      if (max < i) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
    }
    if (max - K < min + K) {
      return 0;
    }
    return max - K - min - K;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

