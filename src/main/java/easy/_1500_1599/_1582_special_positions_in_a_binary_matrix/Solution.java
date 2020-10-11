package easy._1500_1599._1582_special_positions_in_a_binary_matrix;

//Given a rows x cols matrix mat, where mat[i][j] is either 0 or 1, 
// return the number of special positions in mat. 
//
// A position (i,j) is called special if mat[i][j] == 1 
// and all other elements in row i and column j are 0 (rows and columns are 0-indexed). 
//
// 
// Example 1: 
//
// 
//Input: mat = [[1,0,0],
//             [0,0,1],
//             [1,0,0]]
//Output: 1
//Explanation: (1,2) is a special position because mat[1][2] == 1 and all other 
//elements in row 1 and column 2 are 0.
// 
//
// Example 2: 
//
// 
//Input: mat = [[1,0,0],
//             [0,1,0],
//             [0,0,1]]
//Output: 3
//Explanation: (0,0), (1,1) and (2,2) are special positions. 
// 
//
// Example 3: 
//
// 
//Input: mat = [[0,0,0,1],
//             [1,0,0,0],
//             [0,1,1,0],
//             [0,0,0,0]]
//Output: 2
// 
//
// Example 4: 
//
// 
//Input: mat = [[0,0,0,0,0],
//             [1,0,0,0,0],
//             [0,1,0,0,0],
//             [0,0,1,0,0],
//             [0,0,0,1,1]]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// rows == mat.length 
// cols == mat[i].length 
// 1 <= rows, cols <= 100 
// mat[i][j] is 0 or 1. 
// 
// Related Topics Array 
// 👍 136 👎 6


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了33.54% 的Java用户
  public int numSpecial(int[][] mat) {
    int len = mat.length, colLen = mat[0].length, res = 0;
    for (int col = 0; col < colLen; col++) {
      int specialIdx = getColSpecial(mat, col);
      if (specialIdx != -1 && isSpecial(mat[specialIdx])) {
        res++;
      }
    }
    return res;
  }

  public int getColSpecial(int[][] mat, int col) {
    int specialIdx = -1;
    for (int i = 0; i < mat.length; i++) {
      if (mat[i][col] == 1) {
        if (specialIdx == -1) {
          specialIdx = i;
        } else {
          return -1;
        }
      }
    }
    return specialIdx;
  }

  public boolean isSpecial(int[] row) {
    int sum = 0;
    for (int i : row) {
      sum += i;
    }
    return sum == 1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

