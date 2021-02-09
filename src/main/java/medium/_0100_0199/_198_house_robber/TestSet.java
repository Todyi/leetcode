package medium._0100_0199._198_house_robber;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 1};
    Integer result = 4;
    int solution = new medium._0100_0199._198_house_robber.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));

  }

  @Test
  public void test1() {
    int[] nums = {2, 7, 9, 3, 1};
    Integer result = 12;
    int solution = new medium._0100_0199._198_house_robber.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));

  }

  @Test
  public void test2() {
    int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Integer result = 0;
    int solution = new medium._0100_0199._198_house_robber.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));

  }


}
