package medium._0100_0199._152_maximum_product_subarray;

//Given an integer array nums, 
// find the contiguous subarray
// within an array (containing at least one number) which has the largest product.
//
// Example 1:
//
//
//Input: [2,3,-2,4]
//Output: 6
//Explanation:[2,3] has the largest product 6.
//
//
// Example 2:
//
//
//Input: [-2,0,-1]
//Output: 0
//Explanation:The result cannot be 2, because [-2,-1] is not a subarray.
// Related Topics Array Dynamic Programming
// 👍 6055 👎 206


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了93.58% 的Java用户
  //  内存消耗:40.4 MB,击败了5.58% 的Java用户
//  int max;
//
//  public int maxProduct(int[] nums) {
//    max = nums[0];
//    //map[i][0] curMin,map[i][1] curMax
//    int[][] map = new int[nums.length][2];
//    map[0][0] = nums[0];
//    map[0][1] = nums[0];
//    helper(map, nums, nums.length - 1);
//    return max;
//  }
//
//  public int[] helper(int[][] map, int[] nums, int idx) {
//    if (idx == 0) {
//      return map[0];
//    }
//    int[] pre = helper(map, nums, idx - 1);
//    int[] cur = map[idx];
//    int a = nums[idx] * pre[0], b = nums[idx] * pre[1];
//    cur[0] = Math.min(Math.min(a, b), nums[idx]);
//    cur[1] = Math.max(Math.max(a, b), nums[idx]);
//    max = Math.max(max, cur[1]);
//    return cur;
//  }


  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.8 MB,击败了66.49% 的Java用户
  public int maxProduct(int[] nums) {
    int max = nums[0], cur = 1;
    for (int i = 0; i < nums.length; i++) {
      cur = cur * nums[i];
      max = Math.max(max, cur);
      if (cur == 0) {
        cur = 1;
      }
    }
    cur = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      cur = cur * nums[i];
      max = Math.max(max, cur);
      if (cur == 0) {
        cur = 1;
      }
    }
    return max;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

