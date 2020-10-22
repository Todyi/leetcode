package medium._0000_0099._031_next_permutation;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3};
    int[] result = {1, 3, 2};
    new medium._0000_0099._031_next_permutation.Solution()
        .nextPermutation(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test1() {
    int[] nums = {3, 2, 1};
    int[] result = {1, 2, 3};
    new medium._0000_0099._031_next_permutation.Solution()
        .nextPermutation(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test2() {
    int[] nums = {1, 1, 5};
    int[] result = {1, 5, 1};
    new medium._0000_0099._031_next_permutation.Solution()
        .nextPermutation(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test3() {
    int[] nums = {1};
    int[] result = {1};
    new medium._0000_0099._031_next_permutation.Solution()
        .nextPermutation(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test4() {
    int[] nums = {1, 3, 2};
    int[] result = {2, 1, 3};
    new medium._0000_0099._031_next_permutation.Solution()
        .nextPermutation(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }

  @Test
  public void test5() {
    int[] nums = {0, 5, 20, 14, 1, 7, 29, 13, 16, 12, 11, 2, 25, 23, 29, 21, 18, 8, 27, 0, 5, 2, 7,
        9, 21, 19, 26, 13, 26, 8, 24, 26, 6, 7, 2, 7, 14, 1, 20, 0, 6, 24, 24, 23, 17, 23, 14, 27,
        2, 11, 27, 29, 5, 26, 8, 19, 15, 5, 2};
    int[] result = {0, 5, 20, 14, 1, 7, 29, 13, 16, 12, 11, 2, 25, 23, 29, 21, 18, 8, 27, 0, 5, 2,
        7, 9, 21, 19, 26, 13, 26, 8, 24, 26, 6, 7, 2, 7, 14, 1, 20, 0, 6, 24, 24, 23, 17, 23, 14,
        27, 2, 11, 27, 29, 5, 26, 15, 2, 5, 8, 19};
    new medium._0000_0099._031_next_permutation.Solution()
        .nextPermutation(nums);
    Assert.assertTrue(Comparators.isSame(result, nums));
  }
}
