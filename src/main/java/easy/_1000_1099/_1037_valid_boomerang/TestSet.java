package easy._1000_1099._1037_valid_boomerang;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] points = {{1, 1}, {2, 3}, {3, 2}};
    Boolean result = true;
    boolean solution = new easy._1000_1099._1037_valid_boomerang.Solution()
        .isBoomerang(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[][] points = {{1, 1}, {2, 2}, {3, 3}};
    Boolean result = false;
    boolean solution = new easy._1000_1099._1037_valid_boomerang.Solution()
        .isBoomerang(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[][] points = {{0, 0}, {1, 1}, {1, 1}};
    Boolean result = false;
    boolean solution = new easy._1000_1099._1037_valid_boomerang.Solution()
        .isBoomerang(points);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[][] points = {{0, 1}, {0, 1}, {2, 1}};
    Boolean result = false;
    boolean solution = new easy._1000_1099._1037_valid_boomerang.Solution()
        .isBoomerang(points);
    Assert.assertTrue(result.equals(solution));
  }

}
