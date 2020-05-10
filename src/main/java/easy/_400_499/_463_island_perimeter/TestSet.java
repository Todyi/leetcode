package easy._400_499._463_island_perimeter;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
    Integer result = 16;
    int solution = new easy._400_499._463_island_perimeter.Solution()
        .islandPerimeter(grid);
    Assert.assertTrue(result.equals(solution));
  }

}
