package easy._1300_1399._1337_the_k_weakest_rows_in_a_matrix;

//Given a m * n matrix mat of ones (representing soldiers) and zeros (representing civilians), 
// return the indexes of the k weakest rows in the matrix ordered from the weakest to the strongest. 
//
// A row i is weaker than row j, 
// if the number of soldiers in row i is less than the number of soldiers in row j, 
// or they have the same number of soldiers but i is less than j. 
// Soldiers are always stand in the frontier of a row, that is, 
// always ones may appear first and then zeros. 
//
// 
// Example 1: 
//
// 
//Input: mat = 
//[[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]], 
//k = 3
//Output: [2,0,3]
//Explanation: 
//The number of soldiers for each row is: 
//row 0 -> 2 
//row 1 -> 4 
//row 2 -> 1 
//row 3 -> 2 
//row 4 -> 5 
//Rows ordered from the weakest to the strongest are [2,0,3,1,4]
// 
//
// Example 2: 
//
// 
//Input: mat = 
//[[1,0,0,0],
//[1,1,1,1],
//[1,0,0,0],
//[1,0,0,0]], 
//k = 2
//Output: [0,2]
//Explanation: 
//The number of soldiers for each row is: 
//row 0 -> 1 
//row 1 -> 4 
//row 2 -> 1 
//row 3 -> 1 
//Rows ordered from the weakest to the strongest are [0,2,3,1]
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 2 <= n, m <= 100 
// 1 <= k <= m 
// matrix[i][j] is either 0 or 1. 
// 
// Related Topics Array Binary Search 
// 👍 407 👎 27

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:40.4 MB,击败了75.57% 的Java用户
  public int[] kWeakestRows(int[][] mat, int k) {
    int[] res = new int[k], map = new int[mat.length];
    for (int i = 0; i < mat.length; i++) {
      map[i] = init(mat[i]);
    }
    for (int i = 0; i < k; i++) {
      res[i] = findWeakest(map);
    }
    return res;
  }

  public int init(int[] row) {
    int soldiers = 0;
    for (int i = 0; i < row.length; i++) {
      if (row[i] == 1) {
        soldiers++;
      }
    }
    return soldiers;
  }

  public int findWeakest(int[] map) {
    int idx = -1, min = Integer.MAX_VALUE;
    for (int i = 0; i < map.length; i++) {
      if (map[i] < min) {
        idx = i;
        min = map[i];
      }
    }
    map[idx] = Integer.MAX_VALUE;
    return idx;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

