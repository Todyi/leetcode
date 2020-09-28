package easy._1200_1299._1287_element_appearing_more_than_25_in_sorted_array;

//Given an integer array sorted in non-decreasing order,
// there is exactly one integer in the array that occurs more than 25% of the time.
//
// Return that integer.
//
//
// Example 1:
// Input: arr = [1,2,2,6,6,6,6,7,10]
//Output: 6
//
//
// Constraints:
//
//
// 1 <= arr.length <= 10^4
// 0 <= arr[i] <= 10^5
// Related Topics Array
// 👍 294 👎 24


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了99.80% 的Java用户
  public int findSpecialInteger(int[] arr) {
    int count = 0, twentyFive = arr.length / 4, cur = arr[0];
    for (int i : arr) {
      if (cur == i) {
        count++;
      } else {
        if (twentyFive < count) {
          return cur;
        }
        count = 1;
        cur = i;
      }
    }
    return cur;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

