package easy._600_699._674_longest_continnuous_increasing_subsequence;

//
//Given an unsorted array of integers,
// find the length of longest continuous increasing subsequence (subarray).
//
//
// Example 1:
//
//Input: [1,3,5,4,7]
//Output: 3
//Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
//Even though [1,3,5,7] is also an increasing subsequence,
// it's not a continuous one where 5 and 7 are separated by 4.
//
//
//
// Example 2:
//
//Input: [2,2,2,2,2]
//Output: 1
//Explanation: The longest continuous increasing subsequence is [2], its length is 1.
//
//
//
// Note:
//Length of the array will not exceed 10,000.
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.60% 的Java用户
  //  内存消耗:40.2 MB,击败了91.89% 的Java用户
  public int findLengthOfLCIS(int[] nums) {
    if (nums.length < 1) {
      return 0;
    }
    int max = 1, cur = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1]) {
        cur++;
      } else {
        max = Math.max(max, cur);
        cur = 1;
      }
    }
    return Math.max(max, cur);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
