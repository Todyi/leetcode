package easy._0300_0399._349_intersection_of_two_arrays;

//Given two arrays, write a function to compute their intersection.
//
// Example 1:
//
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//
//
//
// Example 2:
//
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//
//
// Note:
//
//
// Each element in the result must be unique.
// The result can be in any order.
//
//
//
// Related Topics Hash Table Two Pointers Binary Search Sort


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:9 ms,击败了5.71% 的Java用户
  //  内存消耗:39.6 MB,击败了6.75% 的Java用户
//  public int[] intersection(int[] nums1, int[] nums2) {
//    if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
//      return new int[]{};
//    }
//
//    List<Integer> list = new ArrayList<>();
//
//    for (int i = 0; i < nums1.length; i++) {
//      for (int j = 0; j < nums2.length; j++) {
//        if (nums2[j] == nums1[i]) {
//          boolean addFlag = true;
//          for (int k = 0; k < list.size(); k++) {
//            if (nums2[j] == list.get(k)) {
//              addFlag = false;
//              break;
//            }
//          }
//          if (addFlag) {
//            list.add(nums2[j]);
//          }
//          break;
//        }
//      }
//    }
//
//    int[] result = new int[list.size()];
//    for (int i = 0; i < list.size(); i++) {
//      result[i] = list.get(i);
//    }
//    return result;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.8 MB,击败了6.75% 的Java用户
  public int[] intersection(int[] nums1, int[] nums2) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i : nums1) {
      if (i < min) {
        min = i;
      }
      if (max < i) {
        max = i;
      }
    }
    for (int i : nums2) {
      if (i < min) {
        min = i;
      }
      if (max < i) {
        max = i;
      }
    }
    boolean[] map = new boolean[max - min + 1];
    int[] result = new int[max - min + 1];
    int size = 0;
    for (int i : nums1) {
      map[i - min] = true;
    }
    for (int i : nums2) {
      if (map[i - min]) {
        result[size++] = i;
        map[i - min] = false;
      }
    }
    return Arrays.copyOf(result, size);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

