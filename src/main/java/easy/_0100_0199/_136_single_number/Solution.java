package easy._0100_0199._136_single_number;

//Given a non-empty array of integers, every element appears twice except for on
//e. Find that single one.
//
// Note:
//
// Your algorithm should have a linear runtime complexity. Could you implement i
//t without using extra memory?
//
// Example 1:
//
//
//Input: [2,2,1]
//Output: 1
//
//
// Example 2:
//
//
//Input: [4,1,2,1,2]
//Output: 4
//
// Related Topics Hash Table Bit Manipulation


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.3 MB,击败了91.85% 的Java用户
  public int singleNumber(int[] nums) {
    int result = nums[0];
    for (int i = 1; i < nums.length; i++) {
      result = result ^ nums[i];
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

