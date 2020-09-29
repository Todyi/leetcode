package easy._1300_1399._1351_count_negative_numbers_in_a_sorted_matrix;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
    Integer result = 8;
    int solution = new easy._1300_1399._1351_count_negative_numbers_in_a_sorted_matrix.Solution()
        .countNegatives(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] grid = {{3, 2}, {1, 0}};
    Integer result = 0;
    int solution = new easy._1300_1399._1351_count_negative_numbers_in_a_sorted_matrix.Solution()
        .countNegatives(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] grid = {{1, -1}, {-1, -1}};
    Integer result = 3;
    int solution = new easy._1300_1399._1351_count_negative_numbers_in_a_sorted_matrix.Solution()
        .countNegatives(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] grid = {{-1}};
    Integer result = 1;
    int solution = new easy._1300_1399._1351_count_negative_numbers_in_a_sorted_matrix.Solution()
        .countNegatives(grid);
    Assert.assertTrue(result.equals(solution));
  }


}
