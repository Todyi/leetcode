package easy._600_699._697_degree_of_an_array;

//Given a non-empty array of non-negative integers nums,
// the degree of this array is defined as the maximum frequency of any one of its elements.
// Your task is to find the smallest possible length of a (contiguous) subarray of nums,
// that has the same degree as nums.
//
// Example 1:
//
//Input: [1, 2, 2, 3, 1]
//Output: 2
//Explanation:
//The input array has a degree of 2 because both elements 1 and 2 appear twice.
//Of the subarrays that have the same degree:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//The shortest length is 2. So return 2.
//
//
//
//
// Example 2:
//
//Input: [1,2,2,3,1,4,2]
//Output: 6
//
//
//
// Note:
// nums.length will be between 1 and 50,000.
// nums[i] will be an integer between 0 and 49,999.
// Related Topics Array


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:22 ms,击败了39.40% 的Java用户
  //  内存消耗:52.2 MB,击败了10.44% 的Java用户
  public int findShortestSubArray(int[] nums) {
    Map<Integer, Integer[]> map = new HashMap<>();
    int degree = Integer.MIN_VALUE, len = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      Integer[] num;
      if (map.containsKey(nums[i])) {
        num = map.get(nums[i]);
      } else {
        num = new Integer[3];
        num[0] = 0;
        num[1] = -1;
        num[2] = -1;
        map.put(nums[i], num);
      }
      num[0]++;
      if (num[1] == -1) {
        num[1] = i;
        num[2] = i;
      } else {
        num[2] = i;
      }
      if (degree < num[0]) {
        degree = num[0];
        len = num[2] - num[1] + 1;
      } else if (num[0] == degree && num[2] != -1 && num[2] - num[1] + 1 < len) {
        len = num[2] - num[1] + 1;
      }
    }
    return len;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

