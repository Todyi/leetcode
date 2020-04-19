package easy._88_merge_sorted_array;/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {


  //59/59 cases passed (0 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 5.94 % of java submissions (39.8 MB)
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) {
      return;
    }
    if (m == 0) {
      for (int i = 0; i < nums1.length; i++) {
        nums1[i] = nums2[i];
      }
      return;
    }

    int t = m + n - 1;
    m--;
    n--;
    while (0 <= t) {
      if (0 <= m && 0 <= n) {
        if (nums1[m] < nums2[n]) {
          nums1[t] = nums2[n--];
        } else {
          nums1[t] = nums1[m--];
        }
      } else if (m < 0) {
        nums1[t] = nums2[n--];
      } else {
        nums1[t] = nums1[m--];
      }
      t--;
    }
  }
}
// @lc code=end

