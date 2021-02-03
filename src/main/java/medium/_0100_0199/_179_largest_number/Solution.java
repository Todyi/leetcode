package medium._0100_0199._179_largest_number;

//Given a list of non-negative integers nums, arrange them such that they form the largest number.
//
// Note: The result may be very large, so you need to return a string instead of an integer.
//
//
// Example 1:
//
//
//Input: nums = [10,2]
//Output: "210"
//
//
// Example 2:
//
//
//Input: nums = [3,30,34,5,9]
//Output: "9534330"
//
//
// Example 3:
//
//
//Input: nums = [1]
//Output: "1"
//
//
// Example 4:
//
//
//Input: nums = [10]
//Output: "10"
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 109
//
// Related Topics Sort
// 👍 2753 👎 297


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了99.96% 的Java用户
  //  内存消耗:36.9 MB,击败了99.96% 的Java用户
//  public String largestNumber(int[] nums) {
//    quickSort(nums, 0, nums.length - 1);
//    if (nums[0] == 0) {
//      return "0";
//    }
//    StringBuilder sb = new StringBuilder();
//    for (int n : nums) {
//      sb.append(n);
//    }
//    return sb.toString();
//  }
//
//  public void quickSort(int[] nums, int l, int r) {
//    if (r <= l) {
//      return;
//    }
//    int pivot = r, idx = l;
//    for (int i = l; i < r; i++) {
//      if (bigger(nums[i], nums[pivot])) {
//        swap(nums, i, idx++);
//      }
//    }
//    if (bigger(nums[pivot], nums[idx])) {
//      swap(nums, pivot, idx);
//    }
//    quickSort(nums, l, idx - 1);
//    quickSort(nums, idx + 1, r);
//
//  }
//
//  public void swap(int[] nums, int i, int j) {
//    int tmp = nums[i];
//    nums[i] = nums[j];
//    nums[j] = tmp;
//  }
//
//  public static boolean bigger(int i, int j) {
//    long iLong = i * 10, jLong = j * 10, tmpI = i, tmpJ = j;
//    while (0 < (tmpJ /= 10)) {
//      iLong *= 10;
//    }
//    while (0 < (tmpI /= 10)) {
//      jLong *= 10;
//    }
//    return jLong + i < iLong + j;
//  }

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Largest Number.
  //  Memory Usage: 37.3 MB, less than 99.93% of Java online submissions for Largest Number.
  public String largestNumber(int[] nums) {
    mergeSort(nums, 0, nums.length);
    if (nums[0] == 0) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    for (int n : nums) {
      sb.append(n);
    }
    return sb.toString();
  }

  public void mergeSort(int[] nums, int l, int r) {
    if (r - 2 < l) {
      return;
    }
    int mid = (l + r) / 2;
    mergeSort(nums, l, mid);
    mergeSort(nums, mid, r);
    merge(nums, l, mid, r);
  }

  public void merge(int[] nums, int l, int m, int r) {
    int[] tmp = new int[r - l];
    for (int i = l, j = m, idx = 0; i < m || j < r; ) {
      if (i < m && (j == r || bigger(nums[i], nums[j]))) {
        tmp[idx++] = nums[i++];
      } else {
        tmp[idx++] = nums[j++];
      }
    }
    for (int i = 0; i < tmp.length; i++) {
      nums[l++] = tmp[i];
    }
  }

  public static boolean bigger(int i, int j) {
    long iLong = i * 10, jLong = j * 10;
    int tmpI = i, tmpJ = j;
    while (0 < (tmpJ /= 10)) {
      iLong *= 10;
    }
    while (0 < (tmpI /= 10)) {
      jLong *= 10;
    }
    return jLong + i < iLong + j;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
