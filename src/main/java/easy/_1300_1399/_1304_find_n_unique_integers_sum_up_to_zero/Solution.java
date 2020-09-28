package easy._1300_1399._1304_find_n_unique_integers_sum_up_to_zero;

//Given an integer n, return any array containing n unique integers such that they add up to 0.
//
//
// Example 1:
//
//
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
//
//
// Example 2:
//
//
//Input: n = 3
//Output: [-1,0,1]
//
//
// Example 3:
//
//
//Input: n = 1
//Output: [0]
//
//
//
// Constraints:
//
//
// 1 <= n <= 1000
//
// Related Topics Array
// 👍 369 👎 216


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了99.40% 的Java用户
  public int[] sumZero(int n) {
    int[] res = new int[n];
    int i = 0;
    if ((n & 1) == 1) {
      res[0] = 0;
      i = 1;
    }
    for (; i < n; i += 2) {
      res[i] = i + 1;
      res[i + 1] = -i - 1;
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

