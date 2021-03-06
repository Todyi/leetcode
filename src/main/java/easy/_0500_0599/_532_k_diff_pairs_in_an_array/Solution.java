package easy._0500_0599._532_k_diff_pairs_in_an_array;

//
//Given an array of integers and an integer k,
// you need to find the number of unique k-diff pairs in the array.
// Here a k-diff pair is defined as an integer pair(i, j),
// where i and j are both numbers in the array and their absolute difference is k.
//
//
//
// Example 1:
//
//Input: [3, 1, 4, 1, 5], k = 2
//Output: 2
//Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
// Although we have two 1s in the input, we should only return the number of unique pairs.
//
//
//
// Example 2:
//
//Input:[1, 2, 3, 4, 5], k = 1
//Output: 4
//Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4)
//and (4, 5).
//
//
//
// Example 3:
//
//Input: [1, 3, 1, 5, 4], k = 0
//Output: 1
//Explanation: There is one 0-diff pair in the array, (1, 1).
//
//
//
// Note:
//
// The pairs (i, j) and (j, i) count as the same pair.
// The length of the array won't exceed 10,000.
// All the integers in the given input belong to the range: [-1e7, 1e7].
//
// Related Topics Array Two Pointers


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:7 ms,击败了79.79% 的Java用户
  //  内存消耗:40 MB,击败了89.47% 的Java用户
//  public int findPairs(int[] nums, int k) {
//    if (k < 0) {
//      return 0;
//    }
//    Map<Integer, Integer> numMap = new HashMap<>();
//    int pairs = 0;
//    for (int i : nums) {
//      numMap.put(i, numMap.getOrDefault(i, 0) + 1);
//    }
//    if (k == 0) {
//      for (Integer value : numMap.values()) {
//        if (1 < value) {
//          pairs++;
//        }
//      }
//    } else {
//      for (Integer n : numMap.keySet()) {
//        if (numMap.containsKey(n + k)) {
//          pairs++;
//        }
//      }
//    }
//    return pairs;
//  }

  //  解答成功:
  //  执行耗时:3 ms,击败了100.00% 的Java用户
  //  内存消耗:39.9 MB,击败了89.47% 的Java用户
  public int findPairs(int[] nums, int k) {
    if (k < 0) {
      return 0;
    }
    Arrays.sort(nums);
    int pairs = 0, l = 0, h = 0;
    while (h < nums.length) {
      if (h <= l) {
        h = l + 1;
        continue;
      }
      if (nums[l] + k == nums[h]) {
        pairs++;
        l++;
        while (l < nums.length && nums[l - 1] == nums[l]) {
          l++;
        }
      } else if (nums[l] + k < nums[h]) {
        l++;
      } else {
        h++;
      }

    }
    return pairs;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

