package easy._1_200._121_best_time_to_buy_and_sell_stock;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {7, 1, 5, 3, 6, 4};
    Integer result = 5;
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
    int[] input = {7, 6, 4, 3, 1, 7};
    Integer result = 6;
    Integer solution = new Solution().maxProfit(input);
    Assert.assertTrue(result.equals(solution));
  }


}
