package easy._1000_1099._1042_flower_planting_with_no_adjacent;

//You have N gardens, labelled 1 to N. In each garden, you want to plant one of 4 types of flowers.
//
// paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.
//
// Also, there is no garden that has more than 3 paths coming into or leaving it.
//
// Your task is to choose a flower type for each garden such that,
// for any two gardens connected by a path, they have different types of flowers.
//
// Return any such a choice as an array answer,
// where answer[i] is the type of flower planted in the (i+1)-th garden.
// The flower types are denoted 1, 2, 3, or 4. It is guaranteed an answer exists.
//
//
//
//
// Example 1:
//
//
//Input: N = 3, paths = [[1,2],[2,3],[3,1]]
//Output: [1,2,3]
//
//
//
// Example 2:
//
//
//Input: N = 4, paths = [[1,2],[3,4]]
//Output: [1,2,1,2]
//
//
//
// Example 3:
//
//
//Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
//Output: [1,2,3,4]
//
//
//
//
// Note:
//
//
// 1 <= N <= 10000
// 0 <= paths.size <= 20000
// No garden has 4 or more paths coming into or leaving it.
// It is guaranteed an answer exists.
//
//
//
//
// Related Topics Graph
// 👍 381 👎 445


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:8 ms,击败了98.05% 的Java用户
  //  内存消耗:47.3 MB,击败了96.51% 的Java用户
//  int[] res = null;
//  int[][] map = null;
//
//  public int[] gardenNoAdj(int N, int[][] paths) {
//    res = new int[N];
//    if (N < 5) {
//      int i = 0;
//      while (i < N) {
//        res[i] = ++i;
//      }
//      return res;
//    }
//
//    int len = N + 1;
//    map = new int[len][5];
//
//    for (int[] path : paths) {
//      map[path[0]][++map[path[0]][0]] = path[1];
//      map[path[1]][++map[path[1]][0]] = path[0];
//    }
//
//    for (int garden = 1; garden < len; garden++) {
//      for (int color = 1; color < 5; color++) {
//        if (check(garden, color)) {
//          res[garden - 1] = color;
//          break;
//        }
//      }
//    }
//
//    return res;
//  }
//
//  public boolean check(int gardenFrom, int color) {
//    int gardenTo = 1;
//    while (gardenTo <= map[gardenFrom][0]) {
//      if (res[map[gardenFrom][gardenTo++] - 1] == color) {
//        return false;
//      }
//    }
//    return true;
//  }


  //  Runtime: 4 ms, faster than 100.00% of Java online submissions for Flower Planting With No Adjacent.
  //  Memory Usage: 48.9 MB, less than 67.32% of Java online submissions for Flower Planting With No Adjacent.
  int n = 0;
  int[][] nums = new int[][]{};

  public int[] gardenNoAdj(int N, int[][] paths) {
    n = N;
    if (N <= 4) {
      int[] res = new int[N];
      for (int i = 1; i <= N; i++) {
        res[i - 1] = i;
      }
      return res;
    }
    nums = new int[3][n + 1];
    for (int i = 0; i < paths.length; i++) {
      int a = paths[i][0];
      int b = paths[i][1];
      int j = 0;
      while (nums[j][a] != 0) {
        j++;
      }
      nums[j][a] = b;
      j = 0;
      while (nums[j][b] != 0) {
        j++;
      }
      nums[j][b] = a;
    }
    int[] res = new int[n];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 4; j++) {
        if (check(i, j, res)) {
          res[i - 1] = j;
          break;
        }
      }
    }
    return res;
  }

  public boolean check(int pos, int color, int[] res) {
    int i = 0;
    while (i < 3 && nums[i][pos] != 0) {
      if (res[nums[i][pos] - 1] == color) {
        return false;
      }
      i++;
    }
    return true;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

