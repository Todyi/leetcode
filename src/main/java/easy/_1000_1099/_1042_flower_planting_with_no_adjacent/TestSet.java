package easy._1000_1099._1042_flower_planting_with_no_adjacent;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public boolean assertTrue(int[][] paths, int[] solution) {
    for (int[] path : paths) {
      if (solution[path[0] - 1] == solution[path[1] - 1]) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void test0() {
    int N = 3;
    int[][] paths = {{1, 2}, {2, 3}, {3, 1}};
    int[] solution = new easy._1000_1099._1042_flower_planting_with_no_adjacent.Solution()
        .gardenNoAdj(N, paths);
    Assert.assertTrue(assertTrue(paths, solution));
  }

  @Test
  public void test1() {
    int N = 4;
    int[][] paths = {{1, 2}, {3, 4}};
    int[] solution = new easy._1000_1099._1042_flower_planting_with_no_adjacent.Solution()
        .gardenNoAdj(N, paths);
    Assert.assertTrue(assertTrue(paths, solution));
  }

  @Test
  public void test2() {
    int N = 4;
    int[][] paths = {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}, {2, 4}};
    int[] solution = new easy._1000_1099._1042_flower_planting_with_no_adjacent.Solution()
        .gardenNoAdj(N, paths);
    Assert.assertTrue(assertTrue(paths, solution));
  }

  @Test
  public void test3() {
    int N = 4;
    int[][] paths = {{3, 4}, {4, 2}, {3, 2}, {1, 3}};
    int[] solution = new easy._1000_1099._1042_flower_planting_with_no_adjacent.Solution()
        .gardenNoAdj(N, paths);
    Assert.assertTrue(assertTrue(paths, solution));
  }

  @Test
  public void test4() {
    int N = 5;
    int[][] paths = {{3, 4}, {4, 5}, {3, 2}, {5, 1}, {1, 3}, {4, 2}};
    int[] solution = new easy._1000_1099._1042_flower_planting_with_no_adjacent.Solution()
        .gardenNoAdj(N, paths);
    Assert.assertTrue(assertTrue(paths, solution));
  }

  @Test
  public void test5() {
    int N = 10;
    int[][] paths = {{10, 8}, {2, 1}, {4, 5}, {10, 7}, {4, 2}, {7, 6}, {8, 1}, {8, 4}, {7, 5},
        {10, 2}, {3, 5}, {3, 6}};
    int[] solution = new easy._1000_1099._1042_flower_planting_with_no_adjacent.Solution()
        .gardenNoAdj(N, paths);
    Assert.assertTrue(assertTrue(paths, solution));
  }

}
