package medium._0100_0199._189_rotate_array;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
// Follow up:
//
//
// Try to come up as many solutions as you can, there are at least 3 different w
//ays to solve this problem.
// Could you do it in-place with O(1) extra space?
//
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
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
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 2 * 104
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 105
//
// Related Topics Array
// 👍 4095 👎 903


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了59.79% 的Java用户
  public void rotate(int[] nums, int k) {
    int len = nums.length;
    k %= len;
    if (k == 0) {
      return;
    }
    int head = len - k;
    int[] tmp = new int[head];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = nums[i];
    }
    int idx = 0;
    while (head < len) {
      nums[idx++] = nums[head++];
    }
    for (int i = 0; i < tmp.length; i++) {
      nums[idx + i] = tmp[i];
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

