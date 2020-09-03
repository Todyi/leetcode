package easy._1000_1099._1005_maximize_sum_of_array_after_k_negations;

//Given an array A of integers, we must modify the array in the following way:
// we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.
// (We may choose the same index i multiple times.)
//
// Return the largest possible sum of the array after modifying it in this way.
//
//
//
//
// Example 1:
//
//
//Input: A = [4,2,3], K = 1
//Output: 5
//Explanation: Choose indices (1,) and A becomes [4,-2,3].
//
//
//
// Example 2:
//
//
//Input: A = [3,-1,0,2], K = 3
//Output: 6
//Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
//
//
//
// Example 3:
//
//
//Input: A = [2,-3,-1,5,-4], K = 2
//Output: 13
//Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
//
//
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 10000
// 1 <= K <= 10000
// -100 <= A[i] <= 100
//
// Related Topics Greedy
// 👍 391 👎 38


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.88% 的Java用户
  //  内存消耗:38.8 MB,击败了93.12% 的Java用户
//  public int largestSumAfterKNegations(int[] A, int K) {
//    Arrays.sort(A);
//    int idx = 0;
//    while (0 < K && A[idx] < 0) {
//      A[idx] = -A[idx];
//      idx++;
//      K--;
//    }
//    if ((K & 1) == 1) {
//      if (0 < idx && A[idx - 1] < A[idx]) {
//        A[idx - 1] = -A[idx - 1];
//      } else {
//        A[idx] = -A[idx];
//      }
//    }
//
//    int sum = 0;
//    for (int i : A) {
//      sum += i;
//    }
//    return sum;
//  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximize Sum Of Array After K Negations.
  //  Memory Usage: 39.1 MB, less than 65.01% of Java online submissions for Maximize Sum Of Array After K Negations.
  public int largestSumAfterKNegations(int[] A, int K) {
    int[] tmp = new int[201];
    int sum = 0;
    for (int i : A) {
      sum += i;
      tmp[i + 100]++;
    }
    int i = 0;
    for (; i < 101 && 0 < K; i++) {
      while (0 < tmp[i] && 0 < K) {
        sum -= 2 * (i - 100);
        tmp[i]--;
        tmp[200 - i]++;
        K--;
      }
    }
    if ((K & 1) == 0) {
      return sum;
    }
    while (tmp[i] == 0) {
      i++;
    }
    return sum - 2 * (i - 100);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

