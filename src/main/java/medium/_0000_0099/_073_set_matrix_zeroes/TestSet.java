package medium._0000_0099._073_set_matrix_zeroes;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    int[][] result = {
        {1, 0, 1},
        {0, 0, 0},
        {1, 0, 1}
    };
    new medium._0000_0099._073_set_matrix_zeroes.Solution()
        .setZeroes(matrix);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], matrix[i]));
    }
  }

  @Test
  public void test1() {
    int[][] matrix = {
        {0, 1, 2, 0},
        {3, 4, 5, 2},
        {1, 3, 1, 5}
    };
    int[][] result = {
        {0, 0, 0, 0},
        {0, 4, 5, 0},
        {0, 3, 1, 0}
    };
    new medium._0000_0099._073_set_matrix_zeroes.Solution()
        .setZeroes(matrix);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], matrix[i]));
    }
  }

}
