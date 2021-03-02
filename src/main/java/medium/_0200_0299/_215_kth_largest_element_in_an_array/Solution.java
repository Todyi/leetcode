package medium._0200_0299._215_kth_largest_element_in_an_array;

//Find the kth largest element in an unsorted array. Note that it is the kth lar
//gest element in the sorted order, not the kth distinct element.
//
// Example 1:
//
//
//Input: [3,2,1,5,6,4] and k = 2
//Output: 5
//
//
// Example 2:
//
//
//Input: [3,2,3,1,2,4,5,5,6] and k = 4
//Output: 4
//
// Note:
//You may assume k is always valid, 1 ≤ k ≤ array's length.
// Related Topics Divide and Conquer Heap
// 👍 5206 👎 336


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 16 ms, faster than 14.88% of Java online submissions for Kth Largest Element in an Array.
  //  Memory Usage: 39.6 MB, less than 30.94% of Java online submissions for Kth Largest Element in an Array.
//  public int findKthLargest(int[] nums, int k) {
//    return quickSort(nums, 0, nums.length - 1, k);
//  }
//
//  public int quickSort(int[] nums, int l, int r, int k) {
//    if (r <= l) {
//      return nums[l];
//    }
//    int pivot = nums[r], idx = l;
//    for (int i = l; i < r; i++) {
//      if (pivot < nums[i]) {
//        swap(nums, i, idx++);
//      }
//    }
//    if (nums[idx] < pivot) {
//      swap(nums, r, idx);
//    }
//    if (k - 1 == idx) {
//      return nums[idx];
//    } else if (k - 1 < idx) {
//      return quickSort(nums, l, idx - 1, k);
//    } else {
//      return quickSort(nums, idx + 1, r, k);
//    }
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了78.37% 的Java用户
  public int findKthLargest(int[] nums, int k) {
    return quickSelect(nums, 0, nums.length - 1, k - 1);
  }

  public int quickSelect(int[] nums, int start, int end, int idx) {
    if (end <= start) {
      return nums[idx];
    }
    int pivot = nums[(start + end) / 2], l = start, r = end;
    while (l <= r) {
      while (l <= r && pivot < nums[l]) {
        l++;
      }
      while (l <= r && nums[r] < pivot) {
        r--;
      }
      if (l <= r) {
        swap(nums, l++, r--);
      }
    }
    if (idx <= r) {
      quickSelect(nums, start, r, idx);
    }
    if (l <= idx) {
      quickSelect(nums, l, end, idx);
    }
    return nums[idx];
  }

  public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

