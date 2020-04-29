package easy._201_400._219_contains_duplicate_ii;

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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:10 ms,击败了25.08% 的Java用户
  //  内存消耗:49 MB,击败了5.26% 的Java用户
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, List<Integer>> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      List<Integer> numAddr = numMap.get(nums[i]);
      if (numAddr == null) {
        numAddr = new ArrayList<>();
        numMap.put(nums[i], numAddr);
      }
      numAddr.add(i);
    }
    Set<Integer> keys = numMap.keySet();
    if (keys != null && 0 < keys.size()) {
      for (Integer key : keys) {
        List<Integer> numAddr = numMap.get(key);
        if (numAddr.size() < 2) {
          continue;
        }
        for (int i = 0; i < numAddr.size() - 1; i++) {
          if (numAddr.get(i + 1) - numAddr.get(i) <= k) {
            return true;
          }
        }
      }
    }

    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

