package easy._300_399._303_range_sum_query_immutable;

//Given an integer array nums, find the sum of the elements between indices i an
//d j (i ≤ j), inclusive.
//
// Example:
//
//Given nums = [-2, 0, 3, -5, 2, -1]
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3
//
//
//
// Note:
//
// You may assume that the array does not change.
// There are many calls to sumRange function.
//
// Related Topics Dynamic Programming


//leetcode submit region begin(Prohibit modification and deletion)
class NumArray {

  //  解答成功:
  //  执行耗时:6 ms,击败了100.00% 的Java用户
  //  内存消耗:42.4 MB,击败了53.66% 的Java用户
  int[] nums;

  public NumArray(int[] nums) {
    this.nums = nums;
    for (int i = 1; i < nums.length; i++) {
      nums[i] += nums[i - 1];
    }
  }

  public int sumRange(int i, int j) {
    if (i == 0) {
      return nums[j];
    }

    return nums[j] - nums[i - 1];
  }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
//leetcode submit region end(Prohibit modification and deletion)

