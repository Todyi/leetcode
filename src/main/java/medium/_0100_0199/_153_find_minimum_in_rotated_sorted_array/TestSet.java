package medium._0100_0199._153_find_minimum_in_rotated_sorted_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 4, 5, 1, 2};
    Integer result = 1;
    int solution = new medium._0100_0199._153_find_minimum_in_rotated_sorted_array.Solution()
        .findMin(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    Integer result = 0;
    int solution = new medium._0100_0199._153_find_minimum_in_rotated_sorted_array.Solution()
        .findMin(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {11, 13, 15, 17};
    Integer result = 11;
    int solution = new medium._0100_0199._153_find_minimum_in_rotated_sorted_array.Solution()
        .findMin(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
