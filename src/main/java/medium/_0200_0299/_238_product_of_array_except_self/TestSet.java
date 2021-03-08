package medium._0200_0299._238_product_of_array_except_self;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 4};
    int[] result = {24, 12, 8, 6};
    int[] solution = new medium._0200_0299._238_product_of_array_except_self.Solution()
        .productExceptSelf(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {0, 0};
    int[] result = {0, 0};
    int[] solution = new medium._0200_0299._238_product_of_array_except_self.Solution()
        .productExceptSelf(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 0};
    int[] result = {0, 1};
    int[] solution = new medium._0200_0299._238_product_of_array_except_self.Solution()
        .productExceptSelf(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
