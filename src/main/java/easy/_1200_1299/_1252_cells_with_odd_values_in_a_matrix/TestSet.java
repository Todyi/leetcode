package easy._1200_1299._1252_cells_with_odd_values_in_a_matrix;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 2;
    int m = 3;
    int[][] indices = {{0, 1}, {1, 1}};
    Integer result = 6;
    int solution = new easy._1200_1299._1252_cells_with_odd_values_in_a_matrix.Solution()
        .oddCells(n, m, indices);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 2;
    int m = 2;
    int[][] indices = {{1, 1}, {0, 0}};
    Integer result = 0;
    int solution = new easy._1200_1299._1252_cells_with_odd_values_in_a_matrix.Solution()
        .oddCells(n, m, indices);
    Assert.assertTrue(result.equals(solution));
  }

}
