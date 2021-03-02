package medium._0200_0299._220_contains_duplicate_iii;

//Given an array of integers, find out whether there are two distinct indices i and j
// in the array such that the absolute difference between nums[i] and nums[j] is at most t
// and the absolute difference between i and j is at most k.
//
//
// Example 1:
// Input: nums = [1,2,3,1], k = 3, t = 0
//Output: true
// Example 2:
// Input: nums = [1,0,1,1], k = 1, t = 2
//Output: true
// Example 3:
// Input: nums = [1,5,9,1,5,9], k = 2, t = 3
//Output: false
//
//
// Constraints:
//
//
// 0 <= nums.length <= 2 * 104
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 104
// 0 <= t <= 231 - 1
//
// Related Topics Sort Ordered Map
// 👍 1514 👎 1607


import java.util.TreeSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:29 ms,击败了56.07% 的Java用户
  //  内存消耗:39.6 MB,击败了95.22% 的Java用户
  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    int len = nums.length;
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < len; i++) {
      Integer c = set.ceiling(nums[i]);
      if (c != null && (long) c - (long) nums[i] <= t) {
        return true;
      }
      Integer f = set.floor(nums[i]);
      if (f != null && (long) nums[i] - (long) f <= t) {
        return true;
      }
      set.add(nums[i]);
      if (k < set.size()) {
        set.remove(nums[i - k]);
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

