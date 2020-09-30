package easy._1300_1399._1365_how_many_numbers_are_smaller_than_the_current_number;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {8, 1, 2, 2, 3};
    int[] result = {4, 0, 1, 1, 3};
    int[] solution = new easy._1300_1399._1365_how_many_numbers_are_smaller_than_the_current_number.Solution()
        .smallerNumbersThanCurrent(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {6, 5, 4, 8};
    int[] result = {2, 1, 0, 3};
    int[] solution = new easy._1300_1399._1365_how_many_numbers_are_smaller_than_the_current_number.Solution()
        .smallerNumbersThanCurrent(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {7, 7, 7, 7};
    int[] result = {0, 0, 0, 0};
    int[] solution = new easy._1300_1399._1365_how_many_numbers_are_smaller_than_the_current_number.Solution()
        .smallerNumbersThanCurrent(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] nums = {5, 0, 10, 0, 10, 6};
    int[] result = {2, 0, 4, 0, 4, 3};
    int[] solution = new easy._1300_1399._1365_how_many_numbers_are_smaller_than_the_current_number.Solution()
        .smallerNumbersThanCurrent(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
