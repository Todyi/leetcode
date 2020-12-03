package medium._0000_0099._075_sort_colors;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 0, 2, 1, 1, 0};
    int[] result = {0, 0, 1, 1, 2, 2};
    new medium._0000_0099._075_sort_colors.Solution()
        .sortColors(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test1() {
    int[] nums = {2, 0, 1};
    int[] result = {0, 1, 2};
    new medium._0000_0099._075_sort_colors.Solution()
        .sortColors(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test2() {
    int[] nums = {0};
    int[] result = {0};
    new medium._0000_0099._075_sort_colors.Solution()
        .sortColors(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test3() {
    int[] nums = {1};
    int[] result = {1};
    new medium._0000_0099._075_sort_colors.Solution()
        .sortColors(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }


}
