package easy._1000_1099._1030_matrix_cells_in_distance_order;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int r, int c, int r0, int c0, int[][] result) {
    int[][] solution = new Solution()
        .allCellsDistOrder(r, c, r0, c0);
    for (int i = 0; i < result.length; i++) {
      Integer disRes = Math.abs(result[i][0] - r0) + Math.abs(result[i][1] - c0);
      Integer disSol = Math.abs(solution[i][0] - r0) + Math.abs(solution[i][1] - c0);
      Assert.assertTrue(disRes.equals(disSol));
    }
  }

  @Test
  public void test0() {
    int R = 1;
    int C = 2;
    int r0 = 0;
    int c0 = 0;
    int[][] result = {{0, 0}, {0, 1}};
    assertTrue(R, C, r0, c0, result);
  }

  @Test
  public void test1() {
    int R = 2;
    int C = 2;
    int r0 = 0;
    int c0 = 1;
    int[][] result = {{0, 1}, {0, 0}, {1, 1}, {1, 0}};
    assertTrue(R, C, r0, c0, result);
  }

  @Test
  public void test2() {
    int R = 2;
    int C = 3;
    int r0 = 1;
    int c0 = 2;
    int[][] result = {{1, 2}, {0, 2}, {1, 1}, {0, 1}, {1, 0}, {0, 0}};
    assertTrue(R, C, r0, c0, result);
  }

}
