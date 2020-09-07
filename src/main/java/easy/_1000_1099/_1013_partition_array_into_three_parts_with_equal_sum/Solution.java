package easy._1000_1099._1013_partition_array_into_three_parts_with_equal_sum;

//Given an array A of integers, return true if and only if we can partition the array
// into three non-empty parts with equal sums.
//
// Formally, we can partition the array if we can find indexes i+1 < j with
// (A[0] + A[1] + ... + A[i]
// == A[i+1] + A[i+2] + ... + A[j-1]
// == A[j] + A[j-1] + ... + A[A.length - 1])
//
//
// Example 1:
//
//
//Input: A = [0,2,1,-6,6,-7,9,1,2,0,1]
//Output: true
//Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
//
//
// Example 2:
//
//
//Input: A = [0,2,1,-6,6,7,9,-1,2,0,1]
//Output: false
//
//
// Example 3:
//
//
//Input: A = [3,3,6,5,-2,2,5,1,-9,4]
//Output: true
//Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
//
//
//
// Constraints:
//
//
// 3 <= A.length <= 50000
// -10^4 <= A[i] <= 10^4
//
// Related Topics Array
// 👍 469 👎 68


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:47.1 MB,击败了77.58% 的Java用户
  public boolean canThreePartsEqualSum(int[] A) {
    int sum = 0;
    for (int i : A) {
      sum += i;
    }
    if (sum % 3 != 0) {
      return false;
    }
    int part = sum / 3, partSum = 0, partCount = 0;
    for (int i : A) {
      partSum += i;
      if (partSum == part) {
        partSum = 0;
        partCount++;
      }
    }
    return 2 < partCount;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

