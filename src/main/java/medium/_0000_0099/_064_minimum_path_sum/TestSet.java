package medium._0000_0099._064_minimum_path_sum;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
    Integer result = 7;
    int solution = new medium._0000_0099._064_minimum_path_sum.Solution()
        .minPathSum(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] grid = {{1, 2, 3}, {4, 5, 6}};
    Integer result = 12;
    int solution = new medium._0000_0099._064_minimum_path_sum.Solution()
        .minPathSum(grid);
    Assert.assertTrue(result.equals(solution));
  }

}
