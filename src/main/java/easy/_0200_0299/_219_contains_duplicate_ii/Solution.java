package easy._0200_0299._219_contains_duplicate_ii;

//Given an array of integers and an integer k, find out
// whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
// and the absolute difference between i and j is at most k.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//
//
//
// Example 2:
//
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//
//
//
// Example 3:
//
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
//
//
//
//
// Related Topics Array Hash Table


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:6 ms,击败了61.29% 的Java用户
  //  内存消耗:44.9 MB,击败了10.53% 的Java用户
//  public boolean containsNearbyDuplicate(int[] nums, int k) {
//    Map<Integer, Integer> numMap = new HashMap<>();
//
//    for (int i = 0; i < nums.length; i++) {
//      Integer preAddr = numMap.get(nums[i]);
//      if (preAddr != null) {
//        if (i - preAddr <= k) {
//          return true;
//        }
//      }
//      numMap.put(nums[i], i);
//    }
//
//    return false;
//  }

  //  解答成功:
  //  执行耗时:2 ms,击败了98.95% 的Java用户
  //  内存消耗:42.2 MB,击败了92.11% 的Java用户
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (nums == null || nums.length < 2 || k == 0) {
      return false;
    }
    int i = 0;
    int j = 1;
    while (i < nums.length - 1 && j < nums.length) {
      int diff = j - i;
      if (diff <= k && nums[i] == nums[j]) {
        return true;
      }
      if (j < nums.length - 1 && diff < k) {
        j++;
      } else if (i < j - 1) {
        i++;
      } else {
        i++;
        j++;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

