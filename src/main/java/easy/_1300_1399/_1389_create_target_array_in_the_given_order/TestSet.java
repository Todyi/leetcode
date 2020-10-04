package easy._1300_1399._1389_create_target_array_in_the_given_order;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {0, 1, 2, 3, 4};
    int[] index = {0, 1, 2, 2, 1};
    int[] result = {0, 4, 1, 3, 2};
    int[] solution = new easy._1300_1399._1389_create_target_array_in_the_given_order.Solution()
        .createTargetArray(nums, index);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3, 4, 0};
    int[] index = {0, 1, 2, 3, 0};
    int[] result = {0, 1, 2, 3, 4};
    int[] solution = new easy._1300_1399._1389_create_target_array_in_the_given_order.Solution()
        .createTargetArray(nums, index);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {1};
    int[] index = {0};
    int[] result = {1};
    int[] solution = new easy._1300_1399._1389_create_target_array_in_the_given_order.Solution()
        .createTargetArray(nums, index);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] nums = {4, 2, 4, 3, 2};
    int[] index = {0, 0, 1, 3, 1};
    int[] result = {2, 2, 4, 4, 3};
    int[] solution = new easy._1300_1399._1389_create_target_array_in_the_given_order.Solution()
        .createTargetArray(nums, index);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
