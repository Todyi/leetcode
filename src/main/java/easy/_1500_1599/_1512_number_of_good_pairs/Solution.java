package easy._1500_1599._1512_number_of_good_pairs;

//Given an array of integers nums.
//
// A pair (i,j) is called good if nums[i] == nums[j] and i < j.
//
// Return the number of good pairs.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//
//
// Example 2:
//
//
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
//
//
// Example 3:
//
//
//Input: nums = [1,2,3]
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100
// Related Topics Array Hash Table Math
// 👍 553 👎 45


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.4 MB,击败了16.47% 的Java用户
  public int numIdenticalPairs(int[] nums) {
    int[] map = new int[101];
    int res = 0;
    for (int n : nums) {
      map[n]++;
    }
    for (int i : map) {
      if (1 < i) {
        res += i * (i - 1) / 2;
      }
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

