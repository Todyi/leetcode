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

  //  Runtime: 9 ms, faster than 97.65% of Java online submissions for Flower Planting With No Adjacent.
  //  Memory Usage: 47.6 MB, less than 94.08% of Java online submissions for Flower Planting With No Adjacent.
  public int[] gardenNoAdj(int N, int[][] paths) {
    int[] res = new int[N];
    res[0] = 1;

    int[][] map = new int[N + 1][5];
    int[][] typeMap = new int[N + 1][5];

    for (int[] path : paths) {
      if (path[0] < path[1]) {
        map[path[0]][++map[path[0]][0]] = path[1];
      } else {
        map[path[1]][++map[path[1]][0]] = path[0];
      }
    }

    for (int gardenFrom = 1; gardenFrom < map.length; gardenFrom++) {
      int idx = 1;
      fillType(res, gardenFrom, typeMap[gardenFrom]);
      while (idx < 4) {
        int gardenTo = map[gardenFrom][idx++];
        if (gardenTo != 0) {
          fillType(res, gardenTo, typeMap[gardenTo]);
          typeMap[gardenTo][res[gardenFrom - 1]] = gardenFrom;
        }
      }
    }
    
    return res;
  }

  private void fillType(int[] res, int garden, int[] type) {
    if (res[garden - 1] != 0) {
      if (type[res[garden - 1]] == 0) {
        type[res[garden - 1]] = garden;
        return;
      } else if (type[res[garden - 1]] == garden) {
        return;
      }
    }
    for (int j = 1; j < type.length; j++) {
      if (type[j] == 0) {
        type[j] = garden;
        res[garden - 1] = j;
        break;
      }
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

