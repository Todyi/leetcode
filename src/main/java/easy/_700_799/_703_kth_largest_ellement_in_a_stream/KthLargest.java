package easy._700_799._703_kth_largest_ellement_in_a_stream;

//Design a class to find the kth largest element in a stream.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
// Your KthLargest class will have a constructor which accepts an integer k and an integer array nums,
// which contains initial elements from the stream.
// For each call to the method KthLargest.add,
// return the element representing the kth largest element in the stream.
//
// Example:
//
//
//int k = 3;
//int[] arr = [4,5,8,2];
//KthLargest kthLargest = new KthLargest(3, arr);
//kthLargest.add(3);   // returns 4  85 432
//kthLargest.add(5);   // returns 5  85 5432
//kthLargest.add(10);  // returns 5 108 55432
//kthLargest.add(9);   // returns 8 109 855432
//kthLargest.add(4);   // returns 8 109 8554432
//
//
// Note:
//You may assume that nums' length ≥ k-1 and k ≥ 1.
// Related Topics Heap


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class KthLargest {

  int[] arr;

  //  解答成功:
  //  执行耗时:50 ms,击败了13.44% 的Java用户
  //  内存消耗:43.6 MB,击败了91.74% 的Java用户
  public KthLargest(int k, int[] nums) {
    this.arr = new int[k];
    Arrays.sort(nums);
    for (int i = 0; i < arr.length; i++) {
      if (nums != null && -1 < nums.length - 1 - i) {
        arr[k - 1 - i] = nums[nums.length - 1 - i];
      } else {
        arr[k - 1 - i] = Integer.MIN_VALUE;
      }
    }
  }

  public int add(int val) {
    if (arr[0] < val) {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < val) {
          if (arr[i + 1] < val) {
            arr[i] = arr[i + 1];
          } else {
            arr[i] = val;
            break;
          }
        } else {
          arr[i] = val;
          break;
        }
      }
      if (arr[arr.length - 1] <= val) {
        arr[arr.length - 1] = val;
      }
    }
    return arr[0];
  }
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest obj = new
 * KthLargest(k, nums); int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

