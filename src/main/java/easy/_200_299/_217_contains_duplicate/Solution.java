package easy._200_299._217_contains_duplicate;

//Given an array of integers, find if the array contains any duplicates.
//
// Your function should return true if any value appears at least twice in the a
//rray, and it should return false if every element is distinct.
//
// Example 1:
//
//
//Input: [1,2,3,1]
//Output: true
//
// Example 2:
//
//
//Input: [1,2,3,4]
//Output: false
//
// Example 3:
//
//
//Input: [1,1,1,3,3,4,3,2,4,2]
//Output: true
// Related Topics Array Hash Table


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  //  解答成功:
  //  执行耗时:3 ms,击败了99.76% 的Java用户
  //  内存消耗:43.6 MB,击败了75.00% 的Java用户
  public boolean containsDuplicate(int[] nums) {
    if (nums == null || nums.length < 2){
      return false;
    }
    Arrays.sort(nums);
    int pre = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (pre != nums[i]){
        pre = nums[i];
      }else {
        return true;
      }
    }

    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

