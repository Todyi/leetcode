package easy._800_899._830_positions_of_large_groups;

//In a string S of lowercase letters, these letters form consecutive groups of the same character.
//
// For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx",
// "z" and "yy".
//
// Call a group large if it has 3 or more characters.
// We would like the starting and ending positions of every large group.
//
// The final answer should be in lexicographic order.
//
//
//
// Example 1:
//
//
//Input: "abbxxxxzzy"
//Output: [[3,6]]
//Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
//
//
// Example 2:
//
//
//Input: "abc"
//Output: []
//Explanation: We have "a","b" and "c" but no large group.
//
//
// Example 3:
//
//
//Input: "abcdddeeeeaabbbcd"
//Output: [[3,5],[6,9],[12,14]]
//
//
//
// Note: 1 <= S.length <= 1000
// Related Topics Array
// 👍 359 👎 91


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.8 MB,击败了54.23% 的Java用户
  public List<List<Integer>> largeGroupPositions(String S) {
    List<List<Integer>> res = new ArrayList<>();
    char[] arr = S.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      int lastPosition = getSameCharPosition(arr, i, arr[i]);
      if (1 < lastPosition - i) {
        List<Integer> seq = new ArrayList<>();
        seq.add(i);
        seq.add(lastPosition);
        res.add(seq);
      }
      i = lastPosition;
    }
    return res;
  }

  public int getSameCharPosition(char[] arr, int start, char c) {
    for (int i = start; i < arr.length; i++) {
      if (arr[i] != c) {
        return i - 1;
      }
    }
    return arr[arr.length - 1] == c ? arr.length - 1 : -1;

  }
}
//leetcode submit region end(Prohibit modification and deletion)

