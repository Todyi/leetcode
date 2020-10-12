package easy._1600_1699._1608_special_array_with_x_elements_greater_than_or_equal_x;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 5};
    Integer result = 2;
    int solution = new easy._1600_1699._1608_special_array_with_x_elements_greater_than_or_equal_x.Solution()
        .specialArray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {0, 0};
    Integer result = -1;
    int solution = new easy._1600_1699._1608_special_array_with_x_elements_greater_than_or_equal_x.Solution()
        .specialArray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {0, 4, 3, 0, 4};
    Integer result = 3;
    int solution = new easy._1600_1699._1608_special_array_with_x_elements_greater_than_or_equal_x.Solution()
        .specialArray(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {3, 6, 7, 7, 0};
    Integer result = -1;
    int solution = new easy._1600_1699._1608_special_array_with_x_elements_greater_than_or_equal_x.Solution()
        .specialArray(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
