package medium._0100_0199._152_maximum_product_subarray;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 3, -2, 4};
    Integer result = 6;
    int solution = new medium._0100_0199._152_maximum_product_subarray.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {-2, 0, -1};
    Integer result = 0;
    int solution = new medium._0100_0199._152_maximum_product_subarray.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {-2};
    Integer result = -2;
    int solution = new medium._0100_0199._152_maximum_product_subarray.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {0,2};
    Integer result = 2;
    int solution = new medium._0100_0199._152_maximum_product_subarray.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
