package easy._0100_0199._189_rotate_array;

//Given an array, rotate the array to the right by k steps, where k is non-negat
//ive.
//
// Example 1:
//
//
//Input: [1,2,3,4,5,6,7] and k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//
//
// Example 2:
//
//
//Input: [-1,-100,3,99] and k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
//
//
// Note:
//
//
// Try to come up as many solutions as you can, there are at least 3 different w
//ays to solve this problem.
// Could you do it in-place with O(1) extra space?
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了5.77% 的Java用户
  public void rotate(int[] nums, int k) {
    if (nums == null || nums.length == 1 || nums.length == k) {
      return;
    }
    if (nums.length < k) {
      k = k % nums.length;
    }

    int[] tmp = new int[k];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = nums[nums.length - k + i];
    }
    for (int i = nums.length - 1; i >= k; i--) {
      nums[i] = nums[i - k];
    }
    for (int i = 0; i < tmp.length; i++) {
      nums[i] = tmp[i];
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

