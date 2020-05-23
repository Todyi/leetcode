package easy._600_699._628_maximum_product_of_three_numbers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3};
    Integer result = 6;
    int solution = new easy._600_699._628_maximum_product_of_three_numbers.Solution()
        .maximumProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3, 4};
    Integer result = 24;
    int solution = new easy._600_699._628_maximum_product_of_three_numbers.Solution()
        .maximumProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
