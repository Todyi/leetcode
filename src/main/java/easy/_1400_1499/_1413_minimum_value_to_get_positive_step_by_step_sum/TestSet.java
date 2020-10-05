package easy._1400_1499._1413_minimum_value_to_get_positive_step_by_step_sum;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {-3, 2, -3, 4, 2};
    Integer result = 5;
    int solution = new easy._1400_1499._1413_minimum_value_to_get_positive_step_by_step_sum.Solution()
        .minStartValue(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2};
    Integer result = 1;
    int solution = new easy._1400_1499._1413_minimum_value_to_get_positive_step_by_step_sum.Solution()
        .minStartValue(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, -2, -3};
    Integer result = 5;
    int solution = new easy._1400_1499._1413_minimum_value_to_get_positive_step_by_step_sum.Solution()
        .minStartValue(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
