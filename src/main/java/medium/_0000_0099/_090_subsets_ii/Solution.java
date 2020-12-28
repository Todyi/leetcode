package medium._0000_0099._090_subsets_ii;

//Given a collection of integers that might contain duplicates, nums, return all
// possible subsets (the power set).
//
// Note: The solution set must not contain duplicate subsets.
//
// Example:
//
//
//Input: [1,2,2]
//Output:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//]
//
// Related Topics Array Backtracking
// 👍 2107 👎 92


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.74% 的Java用户
  //  内存消耗:39.6 MB,击败了22.90% 的Java用户
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int n : nums) {
      if (n < min) {
        min = n;
      }
      if (max < n) {
        max = n;
      }
    }
    int[] map = new int[max - min + 1];
    for (int n : nums) {
      map[n - min]++;
    }
    for (int i = 0; i <= nums.length; i++) {
      subsets(map, i, min, result, new ArrayList<>(), 0);
    }
    return result;
  }

  public void subsets(int[] map, int len, int min,
      List<List<Integer>> result, List<Integer> cur,
      int idx) {
    if (map.length < idx || len == cur.size()) {
      result.add(new ArrayList<>(cur));
      return;
    }
    for (int i = idx; i < map.length; i++) {
      if (map[i] == 0) {
        continue;
      }
      cur.add(i + min);
      map[i]--;
      subsets(map, len, min, result, cur, i);
      map[i]++;
      cur.remove(cur.size() - 1);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

