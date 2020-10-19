package medium._0000_0099._015_3_sum;

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.
//
// Notice that the solution set must not contain duplicate triplets.
//
//
// Example 1:
// Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
// Example 2:
// Input: nums = []
//Output: []
// Example 3:
// Input: nums = [0]
//Output: []
//
//
// Constraints:
//
//
// 0 <= nums.length <= 3000
// -10^5 <= nums[i] <= 10^5
//
// Related Topics Array Two Pointers
// 👍 8252 👎 893


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 16 ms, faster than 98.03% of Java online submissions for 3Sum.
  //  Memory Usage: 42.9 MB, less than 5.17% of Java online submissions for 3Sum.
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums.length < 3) {
      return res;
    }
    int len = nums.length, sum, l, r;
    Arrays.sort(nums);
    for (int i = 0; i < len - 2 && nums[i] < 1; i++) {
      if (i == 0 || (0 < i && nums[i] != nums[i - 1])) {
        sum = 0 - nums[i];
        l = i + 1;
        r = len - 1;
        while (l < r) {
          if (sum == nums[l] + nums[r]) {
            res.add(Arrays.asList(nums[i], nums[l], nums[r]));
            while (l < r && nums[l] == nums[l + 1]) {
              l++;
            }
            while (l < r && nums[r] == nums[r - 1]) {
              r--;
            }
            l++;
            r--;
          } else if (nums[l] + nums[r] < sum) {
            l++;
          } else {
            r--;
          }
        }
      }
    }
    return res;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

