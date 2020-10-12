package easy._0700_0799._746_min_cost_climbing_stairs;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] cost = {10, 15, 20};
    Integer result = 15;
    int solution = new easy._0700_0799._746_min_cost_climbing_stairs.Solution()
        .minCostClimbingStairs(cost);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    Integer result = 6;
    int solution = new easy._0700_0799._746_min_cost_climbing_stairs.Solution()
        .minCostClimbingStairs(cost);
    Assert.assertTrue(result.equals(solution));
  }


}
