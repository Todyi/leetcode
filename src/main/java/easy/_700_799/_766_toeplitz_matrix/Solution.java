package easy._700_799._766_toeplitz_matrix;

//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element. 
//
// Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
// 
// 
//
// Example 1: 
//
// 
//Input:
//matrix = [
//      [1,2,3,4],
//    [5,1,2,3],
//  [9,5,1,2]
//   9 5 1 2 3 4
//]
//Output: True
//Explanation:
//In the above grid, the diagonals are:
//"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//In each diagonal all elements are the same, so the answer is True.
// 
//
// Example 2: 
//
// 
//Input:
//matrix = [
//  [1,2],
//  [2,2]
//]
//Output: False
//Explanation:
//The diagonal "[1, 2]" has different elements.
// 
//
// 
//Note: 
//
// 
// matrix will be a 2D array of integers. 
// matrix will have a number of rows and columns in range [1, 20]. 
// matrix[i][j] will be integers in range [0, 99]. 
// 
//
// 
//Follow up: 
//
// 
// What if the matrix is stored on disk, and the memory is limited such that you
// can only load at most one row of the matrix into the memory at once? 
// What if the matrix is so large that you can only load up a partial row into t
//he memory at once? 
// 
// Related Topics Array 
// 👍 1025 👎 82


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了89.01% 的Java用户
  //  内存消耗:39.7 MB,击败了26.37% 的Java用户
  public boolean isToeplitzMatrix(int[][] matrix) {
    int matrixLen = matrix.length, subLen = matrix[0].length;

    Integer[] map = new Integer[matrixLen + subLen - 1];
    for (int i = 0; i < matrixLen; i++) {
      for (int j = 0; j < subLen; j++) {
        int index = j + matrixLen - i - 1;
        if (map[index] == null) {
          map[index] = matrix[i][j];
        } else if (matrix[i][j] != map[index]) {
          return false;
        }
      }
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

