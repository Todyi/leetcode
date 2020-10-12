package easy._0700_0799._766_toeplitz_matrix;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
    Boolean result = true;
    boolean solution = new easy._0700_0799._766_toeplitz_matrix.Solution()
        .isToeplitzMatrix(matrix);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] matrix = {{1, 2}, {2, 2}};
    Boolean result = false;
    boolean solution = new easy._0700_0799._766_toeplitz_matrix.Solution()
        .isToeplitzMatrix(matrix);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] matrix = {{83}, {64}, {57}};
    Boolean result = true;
    boolean solution = new easy._0700_0799._766_toeplitz_matrix.Solution()
        .isToeplitzMatrix(matrix);
    Assert.assertTrue(result.equals(solution));
  }

}
