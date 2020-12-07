package medium._0000_0099._079_word_search;

//Given an m x n board and a word, find if the word exists in the grid.
//
// The word can be constructed from letters of sequentially adjacent cells,
// where "adjacent" cells are horizontally or vertically neighboring.
// The same letter cell may not be used more than once.
//
//
// Example 1:
//
//
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCCED"
//Output: true
//
//
// Example 2:
//
//
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "SEE"
//Output: true
//
//
// Example 3:
//
//
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCB"
//Output: false
//
//
//
// Constraints:
//
//
// m == board.length
// n = board[i].length
// 1 <= m, n <= 200
// 1 <= word.length <= 10^3
// board and word consists only of lowercase and uppercase English letters.
//
// Related Topics Array Backtracking
// 👍 4799 👎 211


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 100.00% of Java online submissions for Word Search.
  //  Memory Usage: 40.6 MB, less than 75.06% of Java online submissions for Word Search.
  int m, n;
  int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

  public boolean exist(char[][] board, String word) {
    m = board.length;
    n = board[0].length;
    char[] wordArr = new char[128];
    char[] boardArr = new char[128];
    char[] arr = word.toCharArray();
    for (char c : arr) {
      wordArr[c]++;
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        boardArr[board[i][j]]++;
      }
    }
    for (int i = 0; i < wordArr.length; i++) {
      if (boardArr[i] < wordArr[i]) {
        return false;
      }
    }
    boolean[][] visited = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[0] == board[i][j] && exist(board, visited, arr, 1, i, j)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean exist(char[][] board, boolean[][] path, char[] arr, int idx, int i, int j) {
    if (idx == arr.length) {
      return true;
    }
    path[i][j] = true;
    for (int l = 0; l < directions.length; l++) {
      int x = i + directions[l][0], y = j + directions[l][1];
      if (x < 0 || m <= x || y < 0 || n <= y) {
        continue;
      }
      if (path[x][y] || arr[idx] != board[x][y]) {
        continue;
      }
      if (exist(board, path, arr, idx + 1, x, y)) {
        path[i][j] = false;
        return true;
      }
    }
    path[i][j] = false;
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

