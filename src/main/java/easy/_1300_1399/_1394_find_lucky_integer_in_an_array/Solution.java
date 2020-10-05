package easy._1300_1399._1394_find_lucky_integer_in_an_array;

//Given an array of integers arr, a lucky integer is an integer
// which has a frequency in the array equal to its value.
//
// Return a lucky integer in the array. If there are multiple lucky integers
// return the largest of them. If there is no lucky integer return -1.
//
//
// Example 1:
//
//
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//
//
// Example 2:
//
//
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//
//
// Example 3:
//
//
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.
//
//
// Example 4:
//
//
//Input: arr = [5]
//Output: -1
//
//
// Example 5:
//
//
//Input: arr = [7,7,7,7,7,7,7]
//Output: 7
//
//
//
// Constraints:
//
//
// 1 <= arr.length <= 500
// 1 <= arr[i] <= 500
// Related Topics Array
// 👍 259 👎 8


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.4 MB,击败了98.58% 的Java用户
  public int findLucky(int[] arr) {
    int[] map = new int[501];
    int res = -1, max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      map[arr[i]]++;
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    for (int i = max; i > 0; i--) {
      if (map[i] == i) {
        return i;
      }

    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

