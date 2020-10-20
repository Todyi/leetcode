package medium._0000_0099._018_4_sum;

//Given an array nums of n integers and an integer target, are there elements a,
// b, c, and d in nums such that a + b + c + d = target?
// Find all unique quadruplets in the array which gives the sum of target.
//
// Notice that the solution set must not contain duplicate quadruplets.
//
//
// Example 1:
// Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:
// Input: nums = [], target = 0
//Output: []
//
//
// Constraints:
//
//
// 0 <= nums.length <= 200
// -10^9 <= nums[i] <= 10^9
// -10^9 <= target <= 10^9
//
// Related Topics Array Hash Table Two Pointers
// 👍 2458 👎 358


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39.3 MB,击败了5.49% 的Java用户
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums.length < 4) {
      return res;
    }
    int len = nums.length;
    Arrays.sort(nums);
    for (int a = 0; a < len - 3; a++) {
      if (a != 0 && nums[a] == nums[a - 1]) {
        continue;
      }
      for (int d = len - 1; a + 2 < d; d--) {
        if (d < len - 1 && nums[d] == nums[d + 1]) {
          continue;
        }
        int b = a + 1, c = d - 1,
            min = nums[a] + nums[b] + nums[b + 1] + nums[d];
        if (target < min) {
          continue;
        }
        int max = nums[a] + nums[c - 1] + nums[c] + nums[d];
        if (max < target) {
          break;
        }
        while (b < c) {
          int sum = nums[a] + nums[b] + nums[c] + nums[d];
          if (sum < target) {
            b++;
          } else if (target < sum) {
            c--;
          } else {
            res.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
            while (b < c && nums[b] == nums[b + 1]) {
              b++;
            }
            while (b < c && nums[c] == nums[c - 1]) {
              c--;
            }
            b++;
            c--;
          }
        }
      }
    }
    return res;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

