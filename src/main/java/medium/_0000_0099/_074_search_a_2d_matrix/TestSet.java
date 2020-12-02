package medium._0000_0099._074_search_a_2d_matrix;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    int target = 3;
    Boolean result = true;
    boolean solution = new medium._0000_0099._074_search_a_2d_matrix.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    int target = 15;
    Boolean result = false;
    boolean solution = new medium._0000_0099._074_search_a_2d_matrix.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] matrix = {};
    int target = 0;
    Boolean result = false;
    boolean solution = new medium._0000_0099._074_search_a_2d_matrix.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] matrix = {{1}, {3}};
    int target = 3;
    Boolean result = true;
    boolean solution = new medium._0000_0099._074_search_a_2d_matrix.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[][] matrix = {{-8, -7, -5, -3, -3, -1, 1}, {2, 2, 2, 3, 3, 5, 7},
        {8, 9, 11, 11, 13, 15, 17}, {18, 18, 18, 20, 20, 20, 21}, {23, 24, 26, 26, 26, 27, 27},
        {28, 29, 29, 30, 32, 32, 34}};
    int target = -5;
    Boolean result = true;
    boolean solution = new medium._0000_0099._074_search_a_2d_matrix.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }
}
