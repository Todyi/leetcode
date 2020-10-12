package easy._0600_0699._645_set_mismatch;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 2, 4};
    int[] result = {2, 3};
    int[] solution = new easy._0600_0699._645_set_mismatch.Solution()
        .findErrorNums(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {2, 2};
    int[] result = {2, 1};
    int[] solution = new easy._0600_0699._645_set_mismatch.Solution()
        .findErrorNums(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 5, 3, 2, 2, 7, 6, 4, 8, 9};
    int[] result = {2, 10};
    int[] solution = new easy._0600_0699._645_set_mismatch.Solution()
        .findErrorNums(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
