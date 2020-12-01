package medium._0000_0099._063_unique_paths_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    Integer result = 2;
    int solution = new medium._0000_0099._063_unique_paths_ii.Solution()
        .uniquePathsWithObstacles(obstacleGrid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] obstacleGrid = {{0, 1}, {0, 0}};
    Integer result = 1;
    int solution = new medium._0000_0099._063_unique_paths_ii.Solution()
        .uniquePathsWithObstacles(obstacleGrid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] obstacleGrid = {{0, 0}, {1, 1}, {0, 0}};
    Integer result = 0;
    int solution = new medium._0000_0099._063_unique_paths_ii.Solution()
        .uniquePathsWithObstacles(obstacleGrid);
    Assert.assertTrue(result.equals(solution));
  }
}
