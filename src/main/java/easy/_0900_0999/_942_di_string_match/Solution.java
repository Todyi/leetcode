package easy._0900_0999._942_di_string_match;

//Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
//
// Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
//
//
//
// If S[i] == "I", then A[i] < A[i+1]
// If S[i] == "D", then A[i] > A[i+1]
//
//
//
//
// Example 1:
//
//
//Input: "IDID"
//Output: [0,4,1,3,2]
//
//
//
// Example 2:
//
//
//Input: "III"
//Output: [0,1,2,3]
//
//
//
// Example 3:
//
//
//Input: "DDI"
//Output: [3,2,0,1]
//
//
//
//
//
// Note:
//
//
// 1 <= S.length <= 10000
// S only contains characters "I" or "D".
// Related Topics Math
// 👍 893 👎 347


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:40.9 MB,击败了67.74% 的Java用户
  public int[] diStringMatch(String S) {
    int len = S.length(), i = -1, d = len + 1;
    char[] arr = S.toCharArray();
    int[] res = new int[len + 1];
    for (int k = 0; k < arr.length; k++) {
      if (arr[k] == 'I') {
        res[k] = ++i;
      } else {
        res[k] = --d;
      }
    }
    res[len] = arr[arr.length - 1] == 'I' ? --d : ++i;
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

