package easy._0500_0599._581_shortest_unsorted_continuous_subarray;

//Given an integer array, you need to find one continuous subarray
// that if you only sort this subarray in ascending order,
// then the whole array will be sorted in ascending order, too.
//
// You need to find the shortest such subarray and output its length.
//
// Example 1:
//
//Input: [2, 6, 4, 8, 10, 9, 15]
//Output: 5
//Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the
//whole array sorted in ascending order.
//
//
//
// Note:
//
// Then length of the input array is in range [1, 10,000].
// The input array may contain duplicates, so ascending order here means <=.
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了58.97% 的Java用户
  //  内存消耗:41.1 MB,击败了69.23% 的Java用户
//  public int findUnsortedSubarray(int[] nums) {
//    int[] tmp = Arrays.copyOf(nums, nums.length);
//    Arrays.sort(tmp);
//    int l = -1, r = nums.length;
//    for (int i = 0; i < tmp.length; i++) {
//      if (tmp[i] != nums[i]) {
//        l = i;
//        break;
//      }
//    }
//    if (l == -1) {
//      return 0;
//    }
//    for (int i = tmp.length - 1; i >= 0; i--) {
//      if (tmp[i] != nums[i]) {
//        r = i;
//        break;
//      }
//    }
//
//    return r - l + 1;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.7 MB,击败了88.46% 的Java用户
  public int findUnsortedSubarray(int[] nums) {
    int l = -1, r = nums.length - 1;
    for (int i = 0; i < r; i++) {
      if (nums[i + 1] < nums[i]) {
        l = i;
        break;
      }
    }
    if (l == -1) {
      return 0;
    }
    for (; l < r; r--) {
      if (nums[r] < nums[r - 1]) {
        break;
      }
    }

    int min = nums[l], max = nums[l];
    for (int i = l + 1; i <= r; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    for (int i = 0; i < l; i++) {
      if (min < nums[i]) {
        l = i;
        break;
      }
    }
    for (int i = nums.length - 1; r < i; i--) {
      if (nums[i] < max) {
        r = i;
        break;
      }
    }

    return r - l + 1;

  }


}
//leetcode submit region end(Prohibit modification and deletion)

