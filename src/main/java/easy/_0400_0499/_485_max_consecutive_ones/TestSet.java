package easy._0400_0499._485_max_consecutive_ones;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1,1,0,1,1,1};
    Integer result = 3;
    int solution = new easy._0400_0499._485_max_consecutive_ones.Solution()
        .findMaxConsecutiveOnes(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {0,0};
    Integer result = 0;
    int solution = new easy._0400_0499._485_max_consecutive_ones.Solution()
        .findMaxConsecutiveOnes(nums);
    Assert.assertTrue(result.equals(solution));
  }
}
