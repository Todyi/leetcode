package easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence;

//Given an array of numbers arr. A sequence of numbers is called an arithmetic progression
// if the difference between any two consecutive elements is the same.
//
// Return true if the array can be rearranged to form an arithmetic progression,
// otherwise, return false.
//
//
// Example 1:
//
//
//Input: arr = [3,5,1]
//Output: true
//Explanation: We can reorder the elements as [1,3,5] or [5,3,1]
// with differences 2 and -2 respectively, between each consecutive elements.
//
//
// Example 2:
//
//
//Input: arr = [1,2,4]
//Output: false
//Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
//
//
//
// Constraints:
//
//
// 2 <= arr.length <= 1000
// -10^6 <= arr[i] <= 10^6
//
// Related Topics Array Sort
// 👍 194 👎 13


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了93.63% 的Java用户
  //  内存消耗:38.2 MB,击败了93.80% 的Java用户
  public boolean canMakeArithmeticProgression(int[] arr) {
    if (arr.length < 3) {
      return true;
    }
    Arrays.sort(arr);
    int diff = arr[1] - arr[0];
    for (int i = 2; i < arr.length; i++) {
      if (diff != arr[i] - arr[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

