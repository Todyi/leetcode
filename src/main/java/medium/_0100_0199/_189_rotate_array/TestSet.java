package medium._0100_0199._189_rotate_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    int[] result = {5, 6, 7, 1, 2, 3, 4};
    new medium._0100_0199._189_rotate_array.Solution()
        .rotate(nums, k);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test1() {
    int[] nums = {-1, -100, 3, 99};
    int k = 2;
    int[] result = {3, 99, -1, -100};
    new medium._0100_0199._189_rotate_array.Solution()
        .rotate(nums, k);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }


}
