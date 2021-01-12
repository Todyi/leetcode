package medium._0100_0199._137_single_number_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {2, 2, 3, 2};
    Integer result = 3;
    int solution = new medium._0100_0199._137_single_number_ii.Solution()
        .singleNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {0, 1, 0, 1, 0, 1, 99};
    Integer result = 99;
    int solution = new medium._0100_0199._137_single_number_ii.Solution()
        .singleNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {0, 0, 0, 1, 1, 1, 3, 3, 3, 99};
    Integer result = 99;
    int solution = new medium._0100_0199._137_single_number_ii.Solution()
        .singleNumber(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
