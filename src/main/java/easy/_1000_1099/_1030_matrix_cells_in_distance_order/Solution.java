package easy._1000_1099._1030_matrix_cells_in_distance_order;

//We are given a matrix with R rows and C columns has cells with integer coordinates (r, c),
// where 0 <= r < R and 0 <= c < C.
//
// Additionally, we are given a cell in that matrix with coordinates (r0, c0).
//
// Return the coordinates of all cells in the matrix,
// sorted by their distance from (r0, c0) from smallest distance to largest distance.
// Here, the distance between two cells (r1, c1) and (r2, c2) is the Manhattan distance,
// |r1 - r2| + |c1 - c2|. (You may return the answer in any order that satisfies this condition.)
//
//
//
//
// Example 1:
//
//
//Input: R = 1, C = 2, r0 = 0, c0 = 0
//Output: [[0,0],[0,1]]
//Explanation: The distances from (r0, c0) to other cells are: [0,1]
//
//
//
// Example 2:
//
//
//Input: R = 2, C = 2, r0 = 0, c0 = 1
//Output: [[0,1],[0,0],[1,1],[1,0]]
//Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2]
//The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
//
//
//
// Example 3:
//
//
//Input: R = 2, C = 3, r0 = 1, c0 = 2
//Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
//Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2,2,3]
//There are other answers that would also be accepted as correct, such as [[1,2]
//,[1,1],[0,2],[1,0],[0,1],[0,0]].
//
//
//
//
// Note:
//
//
// 1 <= R <= 100
// 1 <= C <= 100
// 0 <= r0 < R
// 0 <= c0 < C
//
//
//
//
// Related Topics Sort
// 👍 234 👎 107


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了90.20% 的Java用户
  //  内存消耗:41 MB,击败了97.40% 的Java用户
  class Cell {

    int r;
    int c;
    Cell next;

    public Cell(int r, int c) {
      this.r = r;
      this.c = c;
    }
  }

  Cell tail;
  boolean[][] map;

  public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    int[][] res = new int[R * C][2];
    map = new boolean[R][C];
    int idx = 0;
    Cell header = new Cell(r0, c0);
    tail = header;
    while (header != null) {
      res[idx++] = new int[]{header.r, header.c};
      upAndDown(header, R, r0);
      leftAndRight(header, C, c0);
      header = header.next;
    }
    return res;
  }

  public void upAndDown(Cell cell, int R, int r0) {
    int cellDisY = Math.abs(cell.r - r0);
    if (0 < cell.r && !map[cell.r - 1][cell.c] && cellDisY < Math.abs(cell.r - 1 - r0)) {
      map[cell.r - 1][cell.c] = true;
      tail.next = new Cell(cell.r - 1, cell.c);
      tail = tail.next;
    }
    if (cell.r < R - 1 && !map[cell.r + 1][cell.c] && cellDisY < Math.abs(cell.r + 1 - r0)) {
      map[cell.r + 1][cell.c] = true;
      tail.next = new Cell(cell.r + 1, cell.c);
      tail = tail.next;
    }
  }

  public void leftAndRight(Cell cell, int C, int c0) {
    int cellDisX = Math.abs(cell.c - c0);
    if (0 < cell.c && !map[cell.r][cell.c - 1] && cellDisX < Math.abs(cell.c - 1 - c0)) {
      map[cell.r][cell.c - 1] = true;
      tail.next = new Cell(cell.r, cell.c - 1);
      tail = tail.next;
    }
    if (cell.c < C - 1 && !map[cell.r][cell.c + 1] && cellDisX < Math.abs(cell.c + 1 - c0)) {
      map[cell.r][cell.c + 1] = true;
      tail.next = new Cell(cell.r, cell.c + 1);
      tail = tail.next;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

