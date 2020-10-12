package easy._0500_0599._506_relative_ranks;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {5, 4, 3, 2, 1};
    String[] result = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
    String[] solution = new easy._0500_0599._506_relative_ranks.Solution()
        .findRelativeRanks(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] nums = {10, 3, 8, 9, 4};
    String[] result = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
    String[] solution = new easy._0500_0599._506_relative_ranks.Solution()
        .findRelativeRanks(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] nums = {123123,11921,1,0,123};
    String[] result = {"Gold Medal","Silver Medal","4","5","Bronze Medal"};
    String[] solution = new easy._0500_0599._506_relative_ranks.Solution()
        .findRelativeRanks(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
