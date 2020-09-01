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


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了98.36% 的Java用户
  //  内存消耗:37.3 MB,击败了96.18% 的Java用户
//  public String largestTimeFromDigits(int[] A) {
//    String max = "";
//    for (int i = 0; i < A.length; i++) {
//      for (int j = 0; j < A.length; j++) {
//        for (int k = 0; k < A.length; k++) {
//          if (i != j && i != k && j != k) {
//            int hour = A[i] * 10 + A[j];
//            int min = A[k] * 10 + A[6 - i - j - k];
//            if (hour < 24 && min < 60) {
//              String value = new StringBuilder().append(A[i]).append(A[j]).append(":").append(A[k])
//                  .append(A[6 - i - j - k]).toString();
//              if (max.compareTo(value) < 0) {
//                max = value;
//              }
//            }
//          }
//        }
//      }
//    }
//    return max;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了98.77% 的Java用户
  int[] res;

  public String largestTimeFromDigits(int[] A) {
    permute(A, 0);
    return res == null ? ""
        : new StringBuilder().append(res[0]).append(res[1]).append(":").append(res[2])
            .append(res[3]).toString();
  }

  public boolean isValid(int[] tmp) {
    return tmp[0] < 3 && (tmp[0] == 2 ? tmp[1] < 4 : true) && tmp[2] < 6;
  }

  public boolean isBetter(int[] tmp) {
    if (res == null) {
      res = new int[4];
      return true;
    }
    for (int i = 0; i < 4; i++) {
      if (tmp[i] == res[i]) {
        continue;
      }
      if (tmp[i] < res[i]) {
        return false;
      } else {
        return true;
      }
    }
    return true;
  }

  public void permute(int[] tmp, int offset) {
    if (offset == 3) {
      if (isValid(tmp) && isBetter(tmp)) {
        for (int n = 0; n < 4; n++) {
          res[n] = tmp[n];
        }
      }
      return;
    }

    for (int i = offset; i < 4; i++) {
      int tmpValue = tmp[offset];
      tmp[offset] = tmp[i];
      tmp[i] = tmpValue;
      permute(tmp, offset + 1);
      tmp[i] = tmp[offset];
      tmp[offset] = tmpValue;
    }

  }


}
//leetcode submit region end(Prohibit modification and deletion)

