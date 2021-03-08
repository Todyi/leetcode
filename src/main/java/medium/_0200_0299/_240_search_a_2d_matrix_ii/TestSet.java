package medium._0200_0299._240_search_a_2d_matrix_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] matrix = {
        {1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };
    int target = 5;
    Boolean result = true;
    boolean solution = new medium._0200_0299._240_search_a_2d_matrix_ii.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] matrix = {
        {1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };
    int target = 20;
    Boolean result = false;
    boolean solution = new medium._0200_0299._240_search_a_2d_matrix_ii.Solution()
        .searchMatrix(matrix, target);
    Assert.assertTrue(result.equals(solution));
  }


}
