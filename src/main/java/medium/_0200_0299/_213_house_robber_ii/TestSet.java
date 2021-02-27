package medium._0200_0299._213_house_robber_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 3, 2};
    Integer result = 3;
    int solution = new medium._0200_0299._213_house_robber_ii.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3, 1};
    Integer result = 4;
    int solution = new medium._0200_0299._213_house_robber_ii.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {0};
    Integer result = 0;
    int solution = new medium._0200_0299._213_house_robber_ii.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {200, 3, 140, 20, 10};
    Integer result = 340;
    int solution = new medium._0200_0299._213_house_robber_ii.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {1, 3, 1, 3, 100};
    Integer result = 103;
    int solution = new medium._0200_0299._213_house_robber_ii.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {2, 2, 4, 3, 2, 5};
    Integer result = 10;
    int solution = new medium._0200_0299._213_house_robber_ii.Solution()
        .rob(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
