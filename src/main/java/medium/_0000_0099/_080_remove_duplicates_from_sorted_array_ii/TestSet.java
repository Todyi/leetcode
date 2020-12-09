package medium._0000_0099._080_remove_duplicates_from_sorted_array_ii;


import common.Comparators;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 1, 1, 2, 2, 3};
    int[] result = {1, 1, 2, 2, 3};
    int solution = new medium._0000_0099._080_remove_duplicates_from_sorted_array_ii.Solution()
        .removeDuplicates(nums);
    Assert.assertTrue(result.length == solution);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOfRange(nums, 0, solution)));
  }

  @Test
  public void test1() {
    int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    int[] result = {0, 0, 1, 1, 2, 3, 3};
    int solution = new medium._0000_0099._080_remove_duplicates_from_sorted_array_ii.Solution()
        .removeDuplicates(nums);
    Assert.assertTrue(result.length == solution);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOfRange(nums, 0, solution)));
  }

  @Test
  public void test2() {
    int[] nums = {1, 1, 1};
    int[] result = {1, 1};
    int solution = new medium._0000_0099._080_remove_duplicates_from_sorted_array_ii.Solution()
        .removeDuplicates(nums);
    Assert.assertTrue(result.length == solution);
    Assert.assertTrue(Comparators.isSame(result, Arrays.copyOfRange(nums, 0, solution)));
  }


}
