package easy._0500_0599._575_distribute_candies;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] candies = new int[]{1,1,2,2,3,3};
    Integer result = 3;
    int solution = new easy._0500_0599._575_distribute_candies.Solution()
        .distributeCandies(candies);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] candies = new int[]{1,1,2,3};
    Integer result = 2;
    int solution = new easy._0500_0599._575_distribute_candies.Solution()
        .distributeCandies(candies);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] candies = new int[]{1,1,1,1,2,2,2,3,3,3};
    Integer result = 3;
    int solution = new easy._0500_0599._575_distribute_candies.Solution()
        .distributeCandies(candies);
    Assert.assertTrue(result.equals(solution));
  }

}
