package easy._300_399._350_intersection_of_two_array_ii;

//Given two arrays, write a function to compute their intersection.
//
// Example 1:
//
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//
//
//
// Example 2:
//
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//
//
// Note:
//
//
// Each element in the result should appear as many times as it shows in both arrays.
// The result can be in any order.
//
//
// Follow up:
//
//
// What if the given array is already sorted? How would you optimize your algori
//thm?
// What if nums1's size is small compared to nums2's size? Which algorithm is be
//tter?
// What if elements of nums2 are stored on disk, and the memory is limited such
//that you cannot load all elements into the memory at once?
//
// Related Topics Hash Table Two Pointers Binary Search Sort


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了97.81% 的Java用户
  //  内存消耗:39.2 MB,击败了6.45% 的Java用户
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();

    int[] result = new int[nums1.length + nums2.length];
    int size = 0;
    for (int i : nums1) {
      Integer count = map.get(i);
      if (count == null) {
        count = 0;
      }
      count++;
      map.put(i, count);
    }
    for (int i : nums2) {
      Integer count = map.get(i);
      if (count == null) {
        continue;
      }
      if (0 < count) {
        result[size++] = i;
      }
      count--;
      map.put(i, count);
    }
    return Arrays.copyOf(result, size);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

