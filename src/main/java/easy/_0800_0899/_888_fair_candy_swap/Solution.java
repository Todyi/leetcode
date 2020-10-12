package easy._0800_0899._888_fair_candy_swap;

//Alice and Bob have candy bars of different sizes:
// A[i] is the size of the i-th bar of candy that Alice has,
// and B[j] is the size of the j-th bar of candy that Bob has.
//
// Since they are friends, they would like to exchange one candy bar each
// so that after the exchange, they both have the same total amount of candy.
// (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
//
// Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange,
// and ans[1] is the size of the candy bar that Bob must exchange.
//
// If there are multiple answers, you may return any one of them. It is guaranteed an answer exists.
//
//
//
//
// Example 1:
//
//
//Input: A = [1,1], B = [2,2]
//Output: [1,2]
//
//
//
// Example 2:
//
//
//Input: A = [1,2], B = [2,3]
//Output: [1,2]
//
//
//
// Example 3:
//
//
//Input: A = [2], B = [1,3]
//Output: [2,3]
//
//
//
// Example 4:
//
//
//Input: A = [1,2,5], B = [2,4]
//Output: [5,4]
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 10000
// 1 <= B.length <= 10000
// 1 <= A[i] <= 100000
// 1 <= B[i] <= 100000
// It is guaranteed that Alice and Bob have different total amounts of candy.
// It is guaranteed there exists an answer.
//
//
//
//
//
// Related Topics Array
// 👍 585 👎 139


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 100.00% of Java online submissions for Fair Candy Swap.
  //  Memory Usage: 40.7 MB, less than 93.75% of Java online submissions for Fair Candy Swap.
  public int[] fairCandySwap(int[] A, int[] B) {
    int[] map = new int[100001];
    int diff = 0;
    for (int i : A) {
      diff += i;
    }
    for (int i : B) {
      map[i]++;
      diff -= i;
    }
    diff /= 2;
    for (int i : A) {
      /*
      diff = aSum - bSum
      aSum - A[i] + target = bSum + A[i] - target
      2target = bSum + A[i] - (aSum - A[i])
      target = A[i] - diff/2
      */
      int target = i - diff;
      if (0 < target && target < 100001 && 0 < map[target]) {
        return new int[]{i, target};
      }
    }
    return null;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
