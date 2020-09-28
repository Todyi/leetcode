package easy._1300_1399._1313_decompress_run_length_encoded_list;

//We are given a list nums of integers representing a list compressed with run-length encoding.
//
// Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
// For each such pair, there are freq elements with value val concatenated in a sublist.
// Concatenate all the subLists from left to right to generate the decompressed list.
//
// Return the decompressed list.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,4]
//Output: [2,4,4,4]
//Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
//
//
// Example 2:
//
//
//Input: nums = [1,1,2,3]
//Output: [1,3,3]
//
//
//
// Constraints:
//
//
// 2 <= nums.length <= 100
// nums.length % 2 == 0
// 1 <= nums[i] <= 100
//
// Related Topics Array
// 👍 283 👎 613


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了96.90% 的Java用户
  public int[] decompressRLElist(int[] nums) {
    int len = 0, idx = 0;
    for (int i = 0; i < nums.length; i += 2) {
      len += nums[i];
    }
    int[] res = new int[len];
    for (int i = 0; i < nums.length; i += 2) {
      Arrays.fill(res, idx, idx + nums[i], nums[i + 1]);
      idx += nums[i];
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

