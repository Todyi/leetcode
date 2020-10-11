package easy._1500_1599._1566_detect_pattern_of_length_m_repeated_k_or_move_times;

//Given an array of positive integers arr,
// find a pattern of length m that is repeated k or more times.
//
// A pattern is a subarray (consecutive sub-sequence) that consists of one or more values,
// repeated multiple times consecutively without overlapping.
// A pattern is defined by its length and the number of repetitions.
//
// Return true if there exists a pattern of length m that is repeated k or more times,
// otherwise return false.
//
//
// Example 1:
//
//
//Input: arr = [1,2,4,4,4,4], m = 1, k = 3
//Output: true
//Explanation: The pattern (4) of length 1 is repeated 4 consecutive times.
// Notice that pattern can be repeated k or more times but not less.
//
//
// Example 2:
//
//
//Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
//Output: true
//Explanation: The pattern (1,2) of length 2 is repeated 2 consecutive times. An
//other valid pattern (2,1) is also repeated 2 times.
//
//
// Example 3:
//
//
//Input: arr = [1,2,1,2,1,3], m = 2, k = 3
//Output: false
//Explanation: The pattern (1,2) is of length 2 but is repeated only 2 times. Th
//ere is no pattern of length 2 that is repeated 3 or more times.
//
//
// Example 4:
//
//
//Input: arr = [1,2,3,1,2], m = 2, k = 2
//Output: false
//Explanation: Notice that the pattern (1,2) exists twice but not consecutively,
// so it doesn't count.
//
//
// Example 5:
//
//
//Input: arr = [2,2,2,2], m = 2, k = 3
//Output: false
//Explanation: The only pattern of length 2 is (2,2) however it's repeated only
//twice. Notice that we do not count overlapping repetitions.
//
//
//
// Constraints:
//
//
// 2 <= arr.length <= 100
// 1 <= arr[i] <= 100
// 1 <= m <= 100
// 2 <= k <= 100
//
// Related Topics Array
// 👍 189 👎 32


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.5 MB,击败了5.69% 的Java用户
  public boolean containsPattern(int[] arr, int m, int k) {
    if (arr.length < m * k) {
      return false;
    }
    int len = arr.length, idx = 0, subLen = m * k;
    while (subLen <= len - idx) {
      if (containsPattern(arr, idx, m, k - 1)) {
        return true;
      }
      idx++;
    }
    return false;
  }

  public boolean containsPattern(int[] arr, int idx, int m, int k) {
    int count = 0, subIdx = idx;
    for (int i = idx + m; i < arr.length; i++) {
      if (arr[subIdx] == arr[i]) {
        subIdx++;
        if (idx == subIdx - m) {
          subIdx = idx;
          count++;
          if (count == k) {
            return true;
          }
        }
      } else {
        return false;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
