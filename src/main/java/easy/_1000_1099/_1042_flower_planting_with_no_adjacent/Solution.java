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
  int[] res = null;
  int[][] map = null;

  public int[] gardenNoAdj(int N, int[][] paths) {
    res = new int[N];
    if (N < 5) {
      int i = 0;
      while (i < N) {
        res[i] = ++i;
      }
      return res;
    }

    int len = N + 1;
    map = new int[len][5];

    for (int[] path : paths) {
      map[path[0]][++map[path[0]][0]] = path[1];
      map[path[1]][++map[path[1]][0]] = path[0];
    }

    for (int garden = 1; garden < len; garden++) {
      for (int color = 1; color < 5; color++) {
        if (check(garden, color)) {
          res[garden - 1] = color;
          break;
        }
      }
    }

    return res;
  }

  public boolean check(int gardenFrom, int color) {
    int gardenTo = 1;
    while (gardenTo <= map[gardenFrom][0]) {
      if (res[map[gardenFrom][gardenTo++] - 1] == color) {
        return false;
      }
    }
    return true;
  }



}
//leetcode submit region end(Prohibit modification and deletion)

