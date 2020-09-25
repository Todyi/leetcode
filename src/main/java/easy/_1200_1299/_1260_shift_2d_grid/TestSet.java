package easy._1200_1299._1260_shift_2d_grid;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[][] grid, int k, int[][] result) {
    List<List<Integer>> solution = new easy._1200_1299._1260_shift_2d_grid.Solution()
        .shiftGrid(grid, k);
    for (int i = 0; i < solution.size(); i++) {
      for (int j = 0; j < solution.get(i).size(); j++) {
        if (result[i][j] != solution.get(i).get(j)) {
          Assert.assertTrue(false);
        }
      }
    }
    Assert.assertTrue(true);
  }

  @Test
  public void test0() {
    int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int k = 1;
    int[][] result = {{9, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    assertTrue(grid, k, result);
  }

  @Test
  public void test1() {
    int[][] grid = {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
    int k = 4;
    int[][] result = {{12, 0, 21, 13}, {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}};
    assertTrue(grid, k, result);
  }

  @Test
  public void test2() {
    int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int k = 9;
    int[][] result = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    assertTrue(grid, k, result);
  }
}
