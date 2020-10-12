package easy._0700_0799._704_binary_search;

//Given a sorted (in ascending order) integer array nums of n elements and a target value,
// write a function to search target in nums.
// If target exists, then return its index, otherwise return -1.
//
//
//Example 1:
//
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//
//
//
// Example 2:
//
//
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
//
//
//
//
// Note:
//
//
// You may assume that all elements in nums are unique.
// n will be in the range [1, 10000].
// The value of each element in nums will be in the range [-9999, 9999].
//
// Related Topics Binary Search


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.5 MB,击败了53.40% 的Java用户
  public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1, mid = (l + r) / 2;
    while (1 < r - l) {
      if (target == nums[mid]) {
        return mid;
      } else if (target < nums[mid]) {
        r = mid;
      } else {
        l = mid;
      }
      mid = (l + r) / 2;
    }
    if (target == nums[l]) {
      return l;
    } else if (target == nums[r]) {
      return r;
    }
    return -1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

