package medium._0100_0199._128_longest_consecutive_sequence;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {100, 4, 200, 1, 3, 2};
    Integer result = 4;
    int solution = new medium._0100_0199._128_longest_consecutive_sequence.Solution()
        .longestConsecutive(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    Integer result = 9;
    int solution = new medium._0100_0199._128_longest_consecutive_sequence.Solution()
        .longestConsecutive(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {};
    Integer result = 0;
    int solution = new medium._0100_0199._128_longest_consecutive_sequence.Solution()
        .longestConsecutive(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {0,1,2,4,8,5,6,7,9,3,55,88,77,99,999999999};
    Integer result = 10;
    int solution = new medium._0100_0199._128_longest_consecutive_sequence.Solution()
        .longestConsecutive(nums);
    Assert.assertTrue(result.equals(solution));
  }


}
