package easy._800_899._892_surface_area_of_3d_shapes;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] grid = {{2}};
    Integer result = 10;
    int solution = new easy._800_899._892_surface_area_of_3d_shapes.Solution()
        .surfaceArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] grid = {{1, 2}, {3, 4}};
    Integer result = 34;
    int solution = new easy._800_899._892_surface_area_of_3d_shapes.Solution()
        .surfaceArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] grid = {{1, 0}, {0, 2}};
    Integer result = 16;
    int solution = new easy._800_899._892_surface_area_of_3d_shapes.Solution()
        .surfaceArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    Integer result = 32;
    int solution = new easy._800_899._892_surface_area_of_3d_shapes.Solution()
        .surfaceArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
    Integer result = 46;
    int solution = new easy._800_899._892_surface_area_of_3d_shapes.Solution()
        .surfaceArea(grid);
    Assert.assertTrue(result.equals(solution));
  }

}
