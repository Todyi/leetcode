package easy._400_499._485_max_consecutive_ones;

//Given a binary array, find the maximum number of consecutive 1s in this array.
//
//
// Example 1:
//
//Input: [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s.
//
//    The maximum number of consecutive 1s is 3.
//
//
//
// Note:
//
// The input array will only contain 0 and 1.
// The length of input array is a positive integer and will not exceed 10,000
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了13.75% 的Java用户
  //  内存消耗:53.2 MB,击败了5.88% 的Java用户
  public int findMaxConsecutiveOnes(int[] nums) {
    int maxNum = 0, currentNum = 0;
    if (nums[0] == 1) {
      maxNum = 1;
      currentNum = 1;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == 0 && nums[i - 1] == 1) {
        maxNum = maxNum < currentNum ? currentNum : maxNum;
      } else if (nums[i] == 1 && nums[i - 1] == 1) {
        currentNum++;
      } else if (nums[i] == 1) {
        currentNum = 1;
      }
    }
    return maxNum < currentNum ? currentNum : maxNum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

