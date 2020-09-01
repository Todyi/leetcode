package easy._900_999._949_largest_time_for_given_digits;

//Given an array of 4 digits, return the largest 24 hour time that can be made.
//
//
// The smallest 24 hour time is 00:00, and the largest is 23:59. Starting from 00:00,
// a time is larger if more time has elapsed since midnight.
//
// Return the answer as a string of length 5. If no valid time can be made, return an empty string.
//
//
//
//
// Example 1:
//
//
//Input: [1,2,3,4]
//Output: "23:41"
//
//
//
// Example 2:
//
//
//Input: [5,5,5,5]
//Output: ""
//
//
//
//
// Note:
//
//
// A.length == 4
// 0 <= A[i] <= 9
//
//
// Related Topics Math
// 👍 209 👎 425


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了98.36% 的Java用户
  //  内存消耗:37.3 MB,击败了96.18% 的Java用户
  public String largestTimeFromDigits(int[] A) {
    String max = "";
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        for (int k = 0; k < A.length; k++) {
          if (i != j && i != k && j != k) {
            int hour = A[i] * 10 + A[j];
            int min = A[k] * 10 + A[6 - i - j - k];
            if (hour < 24 && min < 60) {
              String value = new StringBuilder().append(A[i]).append(A[j]).append(":").append(A[k])
                  .append(A[6 - i - j - k]).toString();
              if (max.compareTo(value) < 0) {
                max = value;
              }
            }
          }
        }
      }
    }
    return max;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

