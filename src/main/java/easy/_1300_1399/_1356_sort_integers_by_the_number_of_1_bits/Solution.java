package easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits;

//Given an integer array arr. You have to sort the integers in the array in ascending order
// by the number of 1's in their binary representation
// and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
//
// Return the sorted array.
//
//
// Example 1:
//
//
//Input: arr = [0,1,2,3,4,5,6,7,8]
//Output: [0,1,2,4,8,3,5,6,7]
//Explantion: [0] is the only integer with 0 bits.
//[1,2,4,8] all have 1 bit.
//[3,5,6] have 2 bits.
//[7] has 3 bits.
//The sorted array by bits is [0,1,2,4,8,3,5,6,7]
//
//
// Example 2:
//
//
//Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
//Output: [1,2,4,8,16,32,64,128,256,512,1024]
//Explantion: All integers have 1 bit in the binary representation, you should j
//ust sort them in ascending order.
//
//
// Example 3:
//
//
//Input: arr = [10000,10000]
//Output: [10000,10000]
//
//
// Example 4:
//
//
//Input: arr = [2,3,5,7,11,13,17,19]
//Output: [2,3,5,17,7,11,13,19]
//
//
// Example 5:
//
//
//Input: arr = [10,100,1000,10000]
//Output: [10,100,10000,1000]
//
//
//
// Constraints:
//
//
// 1 <= arr.length <= 500
// 0 <= arr[i] <= 10^4
//
// Related Topics Sort Bit Manipulation
// 👍 299 👎 16


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 7 ms, faster than 86.93% of Java online submissions for Sort Integers by The Number of 1 Bits.
  //  Memory Usage: 39 MB, less than 100.00% of Java online submissions for Sort Integers by The Number of 1 Bits.
//  public int[] sortByBits(int[] arr) {
//    int len = arr.length;
//    int[] bits = new int[len];
//    for (int i = 0; i < len; i++) {
//      bits[i] = Integer.bitCount(arr[i]);
//    }
//    sort(bits, arr, len);
//
//    return arr;
//  }
//
//  public void sort(int[] bits, int[] arr, int len) {
//    int round = -1, idx, minNum, minBit;
//    while ((idx = ++round) < len) {
//      minNum = arr[round];
//      minBit = bits[round];
//      for (int i = round + 1; i < len; i++) {
//        if (bits[i] < minBit || (bits[i] == minBit && arr[i] < minNum)) {
//          idx = i;
//          minBit = bits[i];
//          minNum = arr[i];
//        }
//      }
//      if (minNum != arr[round]) {
//        arr[idx] = arr[round];
//        bits[idx] = bits[round];
//        arr[round] = minNum;
//        bits[round] = minBit;
//      }
//    }
//  }

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Integers by The Number of 1 Bits.
  //  Memory Usage: 39.2 MB, less than 98.11% of Java online submissions for Sort Integers by The Number of 1 Bits.
  public int[] sortByBits(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    return arr;
  }

  public void quickSort(int[] arr, int l, int r) {
    if (r <= l) {
      return;
    }
    int pivot = Integer.bitCount(arr[r]), idx = l;
    for (int i = l; i < r; i++) {
      int tmp = Integer.bitCount(arr[i]);
      if (tmp < pivot || (tmp == pivot && arr[i] < arr[r])) {
        swap(idx++, i, arr);
      }
    }
    swap(idx, r, arr);
    quickSort(arr, l, idx - 1);
    quickSort(arr, idx + 1, r);

  }

  public void swap(int i, int j, int[] arr) {
    int numTmp = arr[j];
    arr[j] = arr[i];
    arr[i] = numTmp;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

