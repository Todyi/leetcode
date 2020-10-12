package easy._0700_0799._703_kth_largest_ellement_in_a_stream;

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


  //  解答成功:
  //  执行耗时:23 ms,击败了28.06% 的Java用户
  //  内存消耗:45.3 MB,击败了28.86% 的Java用户
//  List<Integer> arr;
//  int k;
//  public KthLargest(int k, int[] nums) {
//    this.k = k - 1;
//    this.arr = new ArrayList<>();
//    for (int i = 0; i < k; i++) {
//      arr.add(Integer.MIN_VALUE);
//    }
//    for (int i = 0; i < nums.length; i++) {
//      add(nums[i]);
//    }
//  }
//
//  public int add(int val) {
//    if (arr.get(k) < val) {
//      int l = 0, r = k, mid = (l + r) / 2;
//      while (l <= r) {
//        if (val < arr.get(mid)) {
//          l = mid;
//        } else if (arr.get(mid) < val) {
//          r = mid;
//        } else {
//          arr.add(mid, val);
//          arr.remove(k + 1);
//          break;
//        }
//        mid = (l + r) / 2;
//        if (r - l == 1 || l == r) {
//          mid = arr.get(l) <= val ? l : r;
//          arr.add(mid, val);
//          arr.remove(k + 1);
//          break;
//        }
//      }
//    }
//    return arr.get(k);
//  }

  //  解答成功:
  //  执行耗时:10 ms,击败了99.95% 的Java用户
  //  内存消耗:43.4 MB,击败了96.06% 的Java用户
  int k;
  int[] heap;
  public KthLargest(int k, int[] nums) {
    this.k = k;
    heap = new int[k];
    Arrays.fill(heap, Integer.MIN_VALUE);
    for (int i : nums) {
      add(i);
    }
  }

  public int add(int val) {
    if (heap[0] < val) {
      heap[0] = val;
      heapSort(0);
    }
    return heap[0];
  }

  public void heapSort(int index) {
    if (k <= index) {
      return;
    }
    int lChild = left(index), rChild = right(index);
    if (lChild < k && rChild < k) {
      if (heap[index] <= heap[lChild] && heap[index] <= heap[rChild]) {
        return;
      }
      if (heap[lChild] <= heap[rChild]) {
        swap(index, lChild);
        heapSort(lChild);
      } else {
        swap(index, rChild);
        heapSort(rChild);
      }
    } else if (lChild < k && heap[lChild] < heap[index]) {
      swap(index, lChild);
      heapSort(lChild);
    } else if (rChild < k && heap[rChild] < heap[index]) {
      swap(index, rChild);
      heapSort(rChild);
    }
  }

  public int left(int index) {
    return 2 * index + 1;
  }

  public int right(int index) {
    return 2 * index + 2;
  }

  public void swap(int i, int j) {
    heap[i] = heap[i] ^ heap[j];
    heap[j] = heap[i] ^ heap[j];
    heap[i] = heap[i] ^ heap[j];
  }

}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest obj = new
 * KthLargest(k, nums); int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

