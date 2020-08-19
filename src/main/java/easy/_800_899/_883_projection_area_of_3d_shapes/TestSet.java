package easy._800_899._883_projection_area_of_3d_shapes;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] grid = {{2}};
    Integer result = 5;
    int solution = new easy._800_899._883_projection_area_of_3d_shapes.Solution()
        .projectionArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] grid = {{1, 2}, {3, 4}};
    Integer result = 17;
    int solution = new easy._800_899._883_projection_area_of_3d_shapes.Solution()
        .projectionArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] grid = {{1, 0}, {0, 2}};
    Integer result = 8;
    int solution = new easy._800_899._883_projection_area_of_3d_shapes.Solution()
        .projectionArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    Integer result = 14;
    int solution = new easy._800_899._883_projection_area_of_3d_shapes.Solution()
        .projectionArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
    Integer result = 21;
    int solution = new easy._800_899._883_projection_area_of_3d_shapes.Solution()
        .projectionArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[][] grid = {{0, 3, 4, 3}, {4, 5, 0, 5}, {0, 4, 2, 4}, {4, 0, 0, 2}};
    Integer result = 46;
    int solution = new easy._800_899._883_projection_area_of_3d_shapes.Solution()
        .projectionArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

}
