package medium._0200_0299._209_minimum_size_subarray_sum;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int target = 7;
    int[] nums = {2, 3, 1, 2, 4, 3};
    Integer result = 2;
    int solution = new medium._0200_0299._209_minimum_size_subarray_sum.Solution()
        .minSubArrayLen(target, nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int target = 4;
    int[] nums = {1, 4, 4};
    Integer result = 1;
    int solution = new medium._0200_0299._209_minimum_size_subarray_sum.Solution()
        .minSubArrayLen(target, nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int target = 11;
    int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
    Integer result = 0;
    int solution = new medium._0200_0299._209_minimum_size_subarray_sum.Solution()
        .minSubArrayLen(target, nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int target = 11;
    int[] nums = {1, 2, 3, 4, 5};
    Integer result = 3;
    int solution = new medium._0200_0299._209_minimum_size_subarray_sum.Solution()
        .minSubArrayLen(target, nums);
    Assert.assertTrue(result.equals(solution));
  }


}
