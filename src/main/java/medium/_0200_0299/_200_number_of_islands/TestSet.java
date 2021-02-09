package medium._0200_0299._200_number_of_islands;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    char[][] grid = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    Integer result = 1;
    int solution = new medium._0200_0299._200_number_of_islands.Solution()
        .numIslands(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    char[][] grid = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    Integer result = 3;
    int solution = new medium._0200_0299._200_number_of_islands.Solution()
        .numIslands(grid);
    Assert.assertTrue(result.equals(solution));
  }

}
