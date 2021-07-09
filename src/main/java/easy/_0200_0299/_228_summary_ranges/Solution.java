package easy._0200_0299._228_summary_ranges;

//You are given a sorted unique integer array nums.
//
// Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
// That is, each element of nums is covered by exactly one of the ranges,
// and there is no integer x such that x is in one of the ranges but not in nums.
//
// Each range [a,b] in the list should be output as:
//
//
// "a->b" if a != b
// "a" if a == b
//
//
//
// Example 1:
//
//
//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
//Explanation: The ranges are:
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
//
//
// Example 2:
//
//
//Input: nums = [0,2,3,4,6,8,9]
//Output: ["0","2->4","6","8->9"]
//Explanation: The ranges are:
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
//
//
// Example 3:
//
//
//Input: nums = []
//Output: []
//
//
// Example 4:
//
//
//Input: nums = [-1]
//Output: ["-1"]
//
//
// Example 5:
//
//
//Input: nums = [0]
//Output: ["0"]
//
//
//
// Constraints:
//
//
// 0 <= nums.length <= 20
// -231 <= nums[i] <= 231 - 1
// All the values of nums are unique.
// nums is sorted in ascending order.
//
// Related Topics Array
// 👍 1097 👎 749


import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了86.02% 的Java用户
  public List<String> summaryRanges(int[] nums) {
    List<String> result = new LinkedList<>();
    if (nums == null || nums.length == 0) {
      return result;
    }
    int start = nums[0], end = start;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - nums[i - 1] == 1) {
        end = nums[i];
      } else {
        addRange(start, end, result);
        start = nums[i];
        end = nums[i];
      }
    }
    addRange(start, end, result);
    return result;
  }

  public void addRange(int start, int end, List<String> result) {
    StringBuilder sb = new StringBuilder();
    if (start == end) {
      sb.append(start);
    } else {
      sb.append(start).append("->").append(end);
    }
    result.add(sb.toString());
  }
}
//leetcode submit region end(Prohibit modification and deletion)

