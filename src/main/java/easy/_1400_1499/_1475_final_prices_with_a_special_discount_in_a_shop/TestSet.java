package easy._1400_1499._1475_final_prices_with_a_special_discount_in_a_shop;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] prices = {8, 4, 6, 2, 3};
    int[] result = {4, 2, 4, 2, 3};
    int[] solution = new easy._1400_1499._1475_final_prices_with_a_special_discount_in_a_shop.Solution()
        .finalPrices(prices);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] prices = {1, 2, 3, 4, 5};
    int[] result = {1, 2, 3, 4, 5};
    int[] solution = new easy._1400_1499._1475_final_prices_with_a_special_discount_in_a_shop.Solution()
        .finalPrices(prices);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] prices = {10, 1, 1, 6};
    int[] result = {9, 0, 1, 6};
    int[] solution = new easy._1400_1499._1475_final_prices_with_a_special_discount_in_a_shop.Solution()
        .finalPrices(prices);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
