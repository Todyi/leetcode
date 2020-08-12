package easy._800_899._821_shortest_distance_to_a_character;

//Given a string S and a character C,
// return an array of integers
// representing the shortest distance from the character C in the string.
//
// Example 1:
//
//
//Input: S = "loveleetcode", C = 'e'
//Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
//
//
//
//
// Note:
//
//
// S string length is in [1, 10000].
// C is a single character, and guaranteed to be in string S.
// All letters in S and C are lowercase.
//
// 👍 1092 👎 78


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了82.07% 的Java用户
  public int[] shortestToChar(String S, char C) {
    int[] res = new int[S.length()];
    char[] arr = S.toCharArray();
    int lastC = nextC(arr, C, 0), nextC = nextC(arr, C, lastC + 1);
    for (int i = 0; i < arr.length; i++) {
      if (i < lastC) {
        res[i] = lastC - i;
      } else if (nextC < i) {
        res[i] = i - nextC;
      } else {
        res[i] = Math.min(i - lastC, nextC - i);
      }
      if (arr[i] == C) {
        lastC = i;
        nextC = nextC(arr, C, lastC + 1);
      }
    }
    return res;
  }

  public int nextC(char[] arr, char C, int startIdx) {
    for (int i = startIdx; i < arr.length; i++) {
      if (arr[i] == C) {
        return i;
      }
    }
    return Integer.MAX_VALUE;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

