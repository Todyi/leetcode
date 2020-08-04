package easy._800_899._812_largest_triangle_area;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
    Double result = 2D;
    double solution = new easy._800_899._812_largest_triangle_area.Solution()
        .largestTriangleArea(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] points = {{1, 0}, {0, 0}, {0, 1}};
    Double result = 0.5D;
    double solution = new easy._800_899._812_largest_triangle_area.Solution()
        .largestTriangleArea(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] points = {{4, 6}, {6, 5}, {3, 1}};
    Double result = 5.5D;
    double solution = new easy._800_899._812_largest_triangle_area.Solution()
        .largestTriangleArea(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] points = {{8, 10}, {2, 7}, {9, 2}, {4, 10}};
    Double result = 25.5D;
    double solution = new easy._800_899._812_largest_triangle_area.Solution()
        .largestTriangleArea(points);
    Assert.assertTrue(result.equals(solution));
  }

}
