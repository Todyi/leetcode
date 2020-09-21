package easy._1100_1199._1128_number_of_domino_pairs;

//Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d]
// if and only if either (a==c and b==d), or (a==d and b==c) - that is,
// one domino can be rotated to be equal to another domino.
//
// Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length,
// and dominoes[i] is equivalent to dominoes[j].
//
//
// Example 1:
// Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
//Output: 1
//
//
// Constraints:
//
//
// 1 <= dominoes.length <= 40000
// 1 <= dominoes[i][j] <= 9
// Related Topics Array
// 👍 226 👎 125


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了99.43% 的Java用户
  //  内存消耗:48.8 MB,击败了67.36% 的Java用户
  public int numEquivDominoPairs(int[][] dominoes) {
    int[][] map = new int[10][10];
    for (int[] domino : dominoes) {
      if (domino[0] < domino[1]) {
        map[domino[0]][domino[1]]++;
      } else {
        map[domino[1]][domino[0]]++;
      }
    }
    int count = 0;
    for (int i = 1; i < map.length; i++) {
      for (int j = 1; j < map[i].length; j++) {
        if (1 < map[i][j]) {
          count += map[i][j] * (map[i][j] - 1) / 2;
        }
      }
    }

    return count;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

