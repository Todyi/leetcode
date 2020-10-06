package easy._1400_1499._1464_maximum_product_of_two_elements_in_an_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 4, 5, 2};
    Integer result = 12;
    int solution = new easy._1400_1499._1464_maximum_product_of_two_elements_in_an_array.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 5, 4, 5};
    Integer result = 16;
    int solution = new easy._1400_1499._1464_maximum_product_of_two_elements_in_an_array.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {3, 7};
    Integer result = 12;
    int solution = new easy._1400_1499._1464_maximum_product_of_two_elements_in_an_array.Solution()
        .maxProduct(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
