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
//  public List<List<Integer>> threeSum(int[] nums) {
//    List<List<Integer>> res = new ArrayList<>();
//    if (nums.length < 3) {
//      return res;
//    }
//    int len = nums.length, sum, l, r;
//    Arrays.sort(nums);
//    for (int i = 0; i < len - 2 && nums[i] < 1; i++) {
//      if (i == 0 || (0 < i && nums[i] != nums[i - 1])) {
//        sum = 0 - nums[i];
//        l = i + 1;
//        r = len - 1;
//        while (l < r) {
//          if (sum == nums[l] + nums[r]) {
//            res.add(Arrays.asList(nums[i], nums[l], nums[r]));
//            while (l < r && nums[l] == nums[l + 1]) {
//              l++;
//            }
//            while (l < r && nums[r] == nums[r - 1]) {
//              r--;
//            }
//            l++;
//            r--;
//          } else if (nums[l] + nums[r] < sum) {
//            l++;
//          } else {
//            r--;
//          }
//        }
//      }
//    }
//    return res;
//  }

  //  解答成功:
  //  执行耗时:5 ms,击败了100.00% 的Java用户
  //  内存消耗:43 MB,击败了5.17% 的Java用户
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    int zero = 0, negativeNum = 0, positiveNum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    for (int n : nums) {
      if (0 == n) {
        zero++;
      } else if (n < 0) {
        negativeNum++;
      } else {
        positiveNum++;
      }
      if (n < min) {
        min = n;
      }
      if (max < n) {
        max = n;
      }
    }
    if (2 < zero) {
      res.add(Arrays.asList(0, 0, 0));
    }
    if (max < 1 || -1 < min) {
      return res;
    }
    int[] negativeNums = new int[negativeNum];
    int[] positiveNums = new int[positiveNum];
    if (0 < max + 2 * min) {
      max = -2 * min;
    }
    if (min + 2 * max < 0) {
      min = -2 * max;
    }
    byte[] map = new byte[max - min + 1];
    negativeNum = 0;
    positiveNum = 0;
    for (int n : nums) {
      if (min <= n && n <= max) {
        if (map[n - min]++ != 0) {
          map[n - min] = 2;
        } else {
          if (n < 0) {
            negativeNums[negativeNum++] = n;
          } else if (0 < n) {
            positiveNums[positiveNum++] = n;
          }
        }
      }
    }
    Arrays.sort(negativeNums, 0, negativeNum);
    Arrays.sort(positiveNums, 0, positiveNum);
    for (int i = 0; i < negativeNum; i++) {
      int n1 = negativeNums[i], minPositive = (-n1) / 2, positiveStart = 0;
      while (positiveStart < positiveNum && positiveNums[positiveStart] < minPositive) {
        positiveStart++;
      }
      for (int j = positiveStart; j < positiveNum; j++) {
        int n2 = positiveNums[j];
        int n3 = 0 - n1 - n2;
        if (n1 <= n3 && n3 <= n2) {
          if (0 < map[n3 - min]) {
            if (n3 == n1 || n3 == n2) {
              if (1 < map[n3 - min]) {
                res.add(Arrays.asList(n1, n2, n3));
              }
            } else if (0 < map[n3 - min]) {
              res.add(Arrays.asList(n1, n2, n3));
            }
          }
        } else if (n3 < n1) {
          break;
        }
      }
    }

    return res;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

