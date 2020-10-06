package easy._1400_1499._1480_running_sum_of_1d_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 4};
    int[] result = {1, 3, 6, 10};
    int[] solution = new easy._1400_1499._1480_running_sum_of_1d_array.Solution()
        .runningSum(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 1, 1, 1, 1};
    int[] result = {1, 2, 3, 4, 5};
    int[] solution = new easy._1400_1499._1480_running_sum_of_1d_array.Solution()
        .runningSum(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {3, 1, 2, 10, 1};
    int[] result = {3, 4, 6, 16, 17};
    int[] solution = new easy._1400_1499._1480_running_sum_of_1d_array.Solution()
        .runningSum(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
