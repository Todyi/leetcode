package medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;
    int[] result = {3, 4};
    int[] solution = new medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array.Solution()
        .searchRange(nums, target);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 6;
    int[] result = {-1, -1};
    int[] solution = new medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array.Solution()
        .searchRange(nums, target);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {};
    int target = 0;
    int[] result = {-1, -1};
    int[] solution = new medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array.Solution()
        .searchRange(nums, target);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] nums = {1};
    int target = 0;
    int[] result = {-1, -1};
    int[] solution = new medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array.Solution()
        .searchRange(nums, target);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test4() {
    int[] nums = {2, 2};
    int target = 1;
    int[] result = {-1, -1};
    int[] solution = new medium._0000_0099._034_find_first_and_last_position_of_element_in_sorted_array.Solution()
        .searchRange(nums, target);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
