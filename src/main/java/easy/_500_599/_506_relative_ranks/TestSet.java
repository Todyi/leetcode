package easy._500_599._506_relative_ranks;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {5, 4, 3, 2, 1};
    String[] result = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
    String[] solution = new easy._500_599._506_relative_ranks.Solution()
        .findRelativeRanks(nums);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
