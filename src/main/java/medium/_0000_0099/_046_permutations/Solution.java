package medium._0000_0099._046_permutations;

//Given a collection of distinct integers, return all possible permutations.
//
// Example:
//
//
//Input: [1,2,3]
//Output:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
//
// Related Topics Backtracking
// 👍 4705 👎 114


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了91.66% 的Java用户
  //  内存消耗:39.1 MB,击败了12.06% 的Java用户
//  public List<List<Integer>> permute(int[] nums) {
//    List<List<Integer>> res = new ArrayList<>();
//    for (int i = 0; i < nums.length; i++) {
//      permute(res, new ArrayList<>(), nums, 0, i);
//    }
//    return res;
//  }
//
//
//  public void permute(List<List<Integer>> res, List<Integer> cur, int[] nums, int start, int idx) {
//    if (cur.size() == nums.length) {
//      res.add(new ArrayList<>(cur));
//    }
//
//    if (start < nums.length && idx < nums.length) {
//      for (int i = start; i < nums.length; i++) {
//        swap(nums, i, idx);
//        cur.add(nums[i]);
//        for (int j = i; j < nums.length; j++) {
//          permute(res, cur, nums, i + 1, j + 1);
//        }
//        cur.remove(cur.size() - 1);
//        swap(nums, idx, i);
//      }
//    }
//  }

  public void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Permutations.
  //  Memory Usage: 39.1 MB, less than 12.06% of Java online submissions for Permutations.
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int end = nums.length - 1;
    permute(res, nums, 0, end);
    return res;
  }

  public void permute(List<List<Integer>> res, int[] nums, int start, int end) {
    if (start == end) {
      List<Integer> cur = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        cur.add(nums[i]);
      }
      res.add(cur);
    } else {
      for (int i = start; i <= end; i++) {
        swap(nums, i, start);
        permute(res, nums, start + 1, end);
        swap(nums, start, i);
      }
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

