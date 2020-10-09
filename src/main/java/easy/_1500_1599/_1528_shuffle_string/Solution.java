package easy._1500_1599._1528_shuffle_string;

//Given a string s and an integer array indices of the same length.
//
// The string s will be shuffled such that
// the character at the ith position moves to indices[i] in the shuffled string.
//
// Return the shuffled string.
//
//
// Example 1:
//
//
//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//Output: "leetcode"
//Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
//
//
// Example 2:
//
//
//Input: s = "abc", indices = [0,1,2]
//Output: "abc"
//Explanation: After shuffling, each character remains in its position.
//
//
// Example 3:
//
//
//Input: s = "aiohn", indices = [3,1,4,2,0]
//Output: "nihao"
//
//
// Example 4:
//
//
//Input: s = "aaiougrt", indices = [4,0,2,6,7,3,1,5]
//Output: "arigatou"
//
//
// Example 5:
//
//
//Input: s = "art", indices = [1,0,2]
//Output: "rat"
//
//
//
// Constraints:
//
//
// s.length == indices.length == n
// 1 <= n <= 100
// s contains only lower-case English letters.
// 0 <= indices[i] < n
// All values of indices are unique (i.e. indices is a permutation of the intege
//rs from 0 to n - 1).
// Related Topics Sort
// 👍 263 👎 42


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.3 MB,击败了16.87% 的Java用户
  public String restoreString(String s, int[] indices) {
    int idx = -1, len = indices.length;
    char[] res = new char[len];
    while (++idx < len) {
      res[indices[idx]] = s.charAt(idx);
    }
    return String.valueOf(res);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

