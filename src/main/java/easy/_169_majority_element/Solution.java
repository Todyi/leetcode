package easy._169_majority_element;

//Given an array of size n, find the majority element. The majority element is t
//he element that appears more than ⌊ n/2 ⌋ times.
//
// You may assume that the array is non-empty and the majority element always ex
//ist in the array.
//
// Example 1:
//
//
//Input: [3,2,3]
//Output: 3
//
// Example 2:
//
//
//Input: [2,2,1,1,1,2,2]
//Output: 2
//
// Related Topics Array Divide and Conquer Bit Manipulation


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了43.26% 的Java用户
  //  内存消耗:45.1 MB,击败了5.15% 的Java用户
  public int majorityElement(int[] nums) {
    Map<Integer,Integer> element = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      Integer times = element.get(nums[i]);
      if (times == null){
        times = 0;
      }
      times++;
      if (times > nums.length>>1){
        return nums[i];
      }
      element.put(nums[i],times);
    }
    return 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

