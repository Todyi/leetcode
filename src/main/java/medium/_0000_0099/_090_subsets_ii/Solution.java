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
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.74% 的Java用户
  //  内存消耗:39.6 MB,击败了22.90% 的Java用户
//  public List<List<Integer>> subsetsWithDup(int[] nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//    for (int n : nums) {
//      if (n < min) {
//        min = n;
//      }
//      if (max < n) {
//        max = n;
//      }
//    }
//    int[] map = new int[max - min + 1];
//    for (int n : nums) {
//      map[n - min]++;
//    }
//    for (int i = 0; i <= nums.length; i++) {
//      subsets(map, i, min, result, new ArrayList<>(), 0);
//    }
//    return result;
//  }

  //  public void subsets(int[] map, int len, int min,
//      List<List<Integer>> result, List<Integer> cur,
//      int idx) {
//    if (map.length < idx || len == cur.size()) {
//      result.add(new ArrayList<>(cur));
//      return;
//    }
//    for (int i = idx; i < map.length; i++) {
//      if (map[i] == 0) {
//        continue;
//      }
//      cur.add(i + min);
//      map[i]--;
//      subsets(map, len, min, result, cur, i);
//      map[i]++;
//      cur.remove(cur.size() - 1);
//    }
//  }

  //  Runtime: 1 ms, faster than 99.74% of Java online submissions for Subsets II.
  //  Memory Usage: 38.9 MB, less than 94.90% of Java online submissions for Subsets II.
//  public List<List<Integer>> subsetsWithDup(int[] nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    Arrays.sort(nums);
//    for (int len = 0; len <= nums.length; len++) {
//      subsets(nums, result, new ArrayList<>(), len, 0);
//    }
//    return result;
//  }
//
//  public void subsets(int[] nums, List<List<Integer>> result, List<Integer> cur, int len, int idx) {
//    if (len == cur.size()) {
//      result.add(new ArrayList<>(cur));
//      return;
//    }
//    if (nums.length <= idx) {
//      return;
//    }
//    for (int i = idx; i < nums.length; i++) {
//      cur.add(nums[i]);
//      subsets(nums, result, cur, len, i + 1);
//      cur.remove(cur.size() - 1);
//      while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
//        i++;
//        continue;
//      }
//    }
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.4 MB,击败了34.00% 的Java用户
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    subsets(nums, result, new ArrayList<>(), 0);
    return result;
  }

  public void subsets(int[] nums, List<List<Integer>> result, List<Integer> cur, int idx) {
    if (nums.length <= idx) {
      result.add(new ArrayList<>(cur));
      return;
    }
    subsets(nums, result, new ArrayList<>(cur), idx + 1);
    int duplicateCount = 0;
    for (int i = idx; i < nums.length; i++) {
      if (nums[idx] == nums[i]) {
        duplicateCount++;
      } else {
        break;
      }
    }
    if (duplicateCount == 1) {
      cur.add(nums[idx]);
      subsets(nums, result, cur, idx + 1);
    } else {
      for (int i = 0; i < duplicateCount; i++) {
        cur.add(nums[idx]);
      }
      subsets(nums, result, cur, idx + duplicateCount);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

