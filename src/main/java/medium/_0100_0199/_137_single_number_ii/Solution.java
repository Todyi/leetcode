package medium._0100_0199._137_single_number_ii;

//Given an integer array nums where every element appears three times except for
// one, which appears exactly once. Find the single element and return it.
//
//
// Example 1:
// Input: nums = [2,2,3,2]
//Output: 3
// Example 2:
// Input: nums = [0,1,0,1,0,1,99]
//Output: 99
//
//
// Constraints:
//
//
// 1 <= nums.length <= 3 * 10^4
// -2^31 <= nums[i] <= 2^31 - 1
// Each element in nums appears exactly three times except for one element which
// appears once.
//
//
//
// Follow up: Your algorithm should have a linear runtime complexity. Could you
//implement it without using extra memory?
// Related Topics Bit Manipulation
// 👍 2268 👎 391


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了17.17% 的Java用户
  public int singleNumber(int[] nums) {
    //        2     010
    //        2     010
    //        3     011
    //        2     010
    //1 occur times:041--mod3-->011->3
    //one/two/three record bits that 1 occur 1/2/3 times,
    int one = nums[0], two = 0, three = 0;
    for (int i = 1; i < nums.length; i++) {
      three = two & nums[i];//find bits occur 3 times
      two |= one & nums[i];//2
      one ^= nums[i];//1
      two &= ~three;//remove bits that occur 3 times
      one &= ~three;//same
    }
    return one;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

