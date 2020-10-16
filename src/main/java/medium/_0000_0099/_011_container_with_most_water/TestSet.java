package medium._0000_0099._011_container_with_most_water;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    Integer result = 49;
    int solution = new medium._0000_0099._011_container_with_most_water.Solution()
        .maxArea(height);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] height = {1, 1};
    Integer result = 1;
    int solution = new medium._0000_0099._011_container_with_most_water.Solution()
        .maxArea(height);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] height = {4, 3, 2, 1, 4};
    Integer result = 16;
    int solution = new medium._0000_0099._011_container_with_most_water.Solution()
        .maxArea(height);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] height = {1, 2, 1};
    Integer result = 2;
    int solution = new medium._0000_0099._011_container_with_most_water.Solution()
        .maxArea(height);
    Assert.assertTrue(result.equals(solution));
  }
}
