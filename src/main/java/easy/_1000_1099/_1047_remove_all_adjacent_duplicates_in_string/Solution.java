package easy._1000_1099._1047_remove_all_adjacent_duplicates_in_string;

//Given a string S of lowercase letters,
// a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
//
// We repeatedly make duplicate removals on S until we no longer can.
//
// Return the final string after all such duplicate removals have been made.
// It is guaranteed the answer is unique.
//
//
//
// Example 1:
//
//
//Input: "abbaca"
//Output: "ca"
//Explanation:
//For example, in "abbaca" we could remove "bb" since the letters are adjacent a
//nd equal, and this is the only possible move.  The result of this move is that t
//he string is "aaca", of which only "aa" is possible, so the final string is "ca"
//.
//
//
//
//
// Note:
//
//
// 1 <= S.length <= 20000
// S consists only of English lowercase letters.
// Related Topics Stack
// 👍 930 👎 74


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 3 ms, faster than 99.71% of Java online submissions for Remove All Adjacent Duplicates In String.
  //  Memory Usage: 39.7 MB, less than 94.05% of Java online submissions for Remove All Adjacent Duplicates In String.
  public String removeDuplicates(String S) {
    char[] arr = S.toCharArray();
    int idx = -1;
    for (int i = 0; i < arr.length; i++) {
      if (idx == -1 || arr[idx] != arr[i]) {
        arr[++idx] = arr[i];
      } else {
        idx--;
      }
    }
    return new String(arr, 0, idx + 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

