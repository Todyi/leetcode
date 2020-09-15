package easy._1000_1099._1051_height_checker;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] heights = {1, 1, 4, 2, 1, 3};
    Integer result = 3;
    int solution = new easy._1000_1099._1051_height_checker.Solution()
        .heightChecker(heights);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] heights = {5, 1, 2, 3, 4};
    Integer result = 5;
    int solution = new easy._1000_1099._1051_height_checker.Solution()
        .heightChecker(heights);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] heights = {1, 2, 3, 4, 5};
    Integer result = 0;
    int solution = new easy._1000_1099._1051_height_checker.Solution()
        .heightChecker(heights);
    Assert.assertTrue(result.equals(solution));
  }

}
