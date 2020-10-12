package easy._0100_0199._122_best_time_to_buy_and_sell_stock_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {7, 1, 5, 3, 6, 4};
    Integer result = 7;
    Integer solution = new Solution().maxProfit(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] input = {7, 6, 4, 3, 1};
    Integer result = 0;
    Integer solution = new Solution().maxProfit(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] input = {1, 2, 3, 4, 5};
    Integer result = 4;
    Integer solution = new Solution().maxProfit(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] input = {1, 2};
    Integer result = 1;
    Integer solution = new Solution().maxProfit(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] input = {3,3,5,0,0,3,1,4};
    Integer result = 8;
    Integer solution = new Solution().maxProfit(input);
    Assert.assertTrue(result.equals(solution));
  }


}
