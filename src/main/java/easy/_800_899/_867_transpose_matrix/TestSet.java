package easy._800_899._867_transpose_matrix;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] result = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
    int[][] solution = new easy._800_899._867_transpose_matrix.Solution()
        .transpose(A);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test1() {
    int[][] A = {{1, 2, 3}, {4, 5, 6}};
    int[][] result = {{1, 4}, {2, 5}, {3, 6}};
    int[][] solution = new easy._800_899._867_transpose_matrix.Solution()
        .transpose(A);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

}
