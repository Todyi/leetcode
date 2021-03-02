package medium._0200_0299._216_combination_sum_iii;

//Find all valid combinations of k numbers that sum up to n 
// such that the following conditions are true: 
//
// 
// Only numbers 1 through 9 are used. 
// Each number is used at most once. 
// 
//
// Return a list of all possible valid combinations. 
// The list must not contain the same combination twice, 
// and the combinations may be returned in any order. 
//
// 
// Example 1: 
//
// 
//Input: k = 3, n = 7
//Output: [[1,2,4]]
//Explanation:
//1 + 2 + 4 = 7
//There are no other valid combinations. 
//
// Example 2: 
//
// 
//Input: k = 3, n = 9
//Output: [[1,2,6],[1,3,5],[2,3,4]]
//Explanation:
//1 + 2 + 6 = 9
//1 + 3 + 5 = 9
//2 + 3 + 4 = 9
//There are no other valid combinations.
// 
//
// Example 3: 
//
// 
//Input: k = 4, n = 1
//Output: []
//Explanation: There are no valid combinations. [1,2,1] is not valid because 1 i
//s used twice.
// 
//
// Example 4: 
//
// 
//Input: k = 3, n = 2
//Output: []
//Explanation: There are no valid combinations.
// 
//
// Example 5: 
//
// 
//Input: k = 9, n = 45
//Output: [[1,2,3,4,5,6,7,8,9]]
//Explanation:
//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
//There are no other valid combinations.
// 
//
// 
// Constraints: 
//
// 
// 2 <= k <= 9 
// 1 <= n <= 60 
// 
// Related Topics Array Backtracking 
// 👍 1668 👎 63


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.5 MB,击败了79.49% 的Java用户
  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> result = new ArrayList<>();
    if (45 < n || n < k) {
      return result;
    }
    combination(result, k, n, new ArrayList<>(), 0, 1);
    return result;
  }

  public void combination(List<List<Integer>> result, int k, int n, List<Integer> cur, int curSum,
      int idx) {
    if (cur.size() == k) {
      if (curSum == n) {
        result.add(new ArrayList<>(cur));
      }
      return;
    }

    if (n < curSum) {
      return;
    }
    for (int i = idx; i < 10; i++) {
      cur.add(i);
      combination(result, k, n, cur, curSum + i, i + 1);
      cur.remove(cur.size() - 1);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

