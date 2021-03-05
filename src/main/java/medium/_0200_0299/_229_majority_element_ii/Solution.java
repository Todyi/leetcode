package medium._0200_0299._229_majority_element_ii;

//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
// Follow-up: Could you solve the problem in linear time and in O(1) space?
//
//
// Example 1:
//
//
//Input: nums = [3,2,3]
//Output: [3]
//
//
// Example 2:
//
//
//Input: nums = [1]
//Output: [1]
//
//
// Example 3:
//
//
//Input: nums = [1,2]
//Output: [1,2]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109
//
// Related Topics Array
// 👍 2511 👎 219


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了75.20% 的Java用户
  //  内存消耗:42.9 MB,击败了58.37% 的Java用户
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new LinkedList<>();
    int len = nums.length, n = len / 3;
    Arrays.sort(nums);
    int pre = nums[0], start = 0;
    for (int i = 1; i < len; i++) {
      if (pre != nums[i]) {
        if (n < i - start) {
          result.add(pre);
        }
        start = i;
        pre = nums[i];
      }
    }
    if (n < len - start) {
      result.add(pre);
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

