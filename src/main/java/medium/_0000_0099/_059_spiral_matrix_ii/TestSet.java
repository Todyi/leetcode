package medium._0000_0099._059_spiral_matrix_ii;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 3;
    int[][] result = {
        {1, 2, 3},
        {8, 9, 4},
        {7, 6, 5}
    };
    int[][] solution = new medium._0000_0099._059_spiral_matrix_ii.Solution()
        .generateMatrix(n);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test1() {
    int n = 4;
    int[][] result = {
        {1, 2, 3, 4},
        {12, 13, 14, 5},
        {11, 16, 15, 6},
        {10, 9, 8, 7}
    };
    int[][] solution = new medium._0000_0099._059_spiral_matrix_ii.Solution()
        .generateMatrix(n);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

}
