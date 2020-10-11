package easy._1500_1599._1550_three_consecutive_odds;

//Given an integer array arr, return true if there are three consecutive odd numbers in the array.
// Otherwise, return false.
//
// Example 1:
//
//
//Input: arr = [2,6,4,1]
//Output: false
//Explanation: There are no three consecutive odds.
//
//
// Example 2:
//
//
//Input: arr = [1,2,34,3,4,5,7,23,12]
//Output: true
//Explanation: [5,7,23] are three consecutive odds.
//
//
//
// Constraints:
//
//
// 1 <= arr.length <= 1000
// 1 <= arr[i] <= 1000
//
// Related Topics Array
// 👍 122 👎 20


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.6 MB,击败了8.22% 的Java用户
  public boolean threeConsecutiveOdds(int[] arr) {
    int count = 0;
    for (int i : arr) {
      if ((i & 1) == 1) {
        count++;
        if (count == 3) {
          return true;
        }
      } else {
        count = 0;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

