package easy._0500_0599._594_longest_harmonious_subsequence;

//We define a harmonious array as an array
// where the difference between its maximum value and its minimum value is exactly 1.
//
// Now, given an integer array,
// you need to find the length of its longest harmonious subsequence
// among all its possible subsequences.
//
// Example 1:
//
//
//Input: [1,3,2,2,5,2,3,7]
//Output: 5
//Explanation: The longest harmonious subsequence is [3,2,2,2,3].
//
//
//
//
// Note: The length of the input array will not exceed 20,000.
// Related Topics Hash Table


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:19 ms,击败了45.15% 的Java用户
  //  内存消耗:41 MB,击败了84.21% 的Java用户
//  public int findLHS(int[] nums) {
//    Map<Integer, Integer> map = new HashMap<>();
//    int len = 0;
//    for (int num : nums) {
//      map.put(num, map.getOrDefault(num, 0) + 1);
//    }
//    for (Integer key : map.keySet()) {
//      int cur = map.get(key);
//      int max = Math.max(map.getOrDefault(key - 1, -cur), map.getOrDefault(key + 1, -cur));
//      len = Math.max(len, cur + max);
//    }
//    return len;
//  }

  //  解答成功:
  //  执行耗时:10 ms,击败了100.00% 的Java用户
  //  内存消耗:40.1 MB,击败了94.74% 的Java用户
  public int findLHS(int[] nums) {
    Arrays.sort(nums);
    int len = 0, subOne = 0;
    for (int i = 1; i < nums.length; ) {
      if (nums[i] == nums[subOne]) {
        i++;
      } else if (1 == nums[i] - nums[subOne]) {
        //1,1,2,2,3,3,3,4
        len = Math.max(len, i - subOne + 1);
        i++;
      } else {
        subOne++;
      }

    }
    return len;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

