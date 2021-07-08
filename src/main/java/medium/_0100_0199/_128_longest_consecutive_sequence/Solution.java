package medium._0100_0199._128_longest_consecutive_sequence;

//Given an unsorted array of integers nums,
// return the length of the longest consecutive elements sequence.
//
// You must write an algorithm that runs in O(n) time.
//
//
// Example 1:
//
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//
//
// Example 2:
//
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
//
//
//
// Constraints:
//
//
// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
//
// Related Topics Array Hash Table Union Find
// 👍 6030 👎 278


import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:10 ms,击败了85.60% 的Java用户
  //  内存消耗:54.3 MB,击败了51.28% 的Java用户
  public int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    for (int i : nums) {
      if (i < min) {
        min = i;
      }
      if (max < i) {
        max = i;
      }
      set.add(i);
    }

    int longest = 0, curr = 0;
    for (int i = min; i <= max; i++) {
      if (set.contains(i)) {
        curr++;
        if (longest < curr) {
          longest = curr;
        }
      } else {
        curr = 0;
        if (nums.length / 2 < longest) {
          break;
        }
      }
    }
    return longest;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

