package easy._0600_0699._674_longest_continnuous_increasing_subsequence;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 3, 5, 4, 7};
    Integer result = 3;
    int solution = new easy._0600_0699._674_longest_continnuous_increasing_subsequence.Solution()
        .findLengthOfLCIS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {2, 2, 2, 2, 2};
    Integer result = 1;
    int solution = new easy._0600_0699._674_longest_continnuous_increasing_subsequence.Solution()
        .findLengthOfLCIS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 3, 5, 7};
    Integer result = 4;
    int solution = new easy._0600_0699._674_longest_continnuous_increasing_subsequence.Solution()
        .findLengthOfLCIS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {};
    Integer result = 0;
    int solution = new easy._0600_0699._674_longest_continnuous_increasing_subsequence.Solution()
        .findLengthOfLCIS(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
