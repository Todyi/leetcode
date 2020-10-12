package easy._0500_0599._594_longest_harmonious_subsequence;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
    Integer result = 5;
    int solution = new easy._0500_0599._594_longest_harmonious_subsequence.Solution()
        .findLHS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = new int[]{1, 3, 2, 2, 2, 2, 3, 7};
    Integer result = 6;
    int solution = new easy._0500_0599._594_longest_harmonious_subsequence.Solution()
        .findLHS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = new int[]{1, 2, 3, 4};
    Integer result = 2;
    int solution = new easy._0500_0599._594_longest_harmonious_subsequence.Solution()
        .findLHS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = new int[]{1, 2};
    Integer result = 2;
    int solution = new easy._0500_0599._594_longest_harmonious_subsequence.Solution()
        .findLHS(nums);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = new int[]{1, 1, 1, 1};
    Integer result = 0;
    int solution = new easy._0500_0599._594_longest_harmonious_subsequence.Solution()
        .findLHS(nums);
    Assert.assertTrue(result.equals(solution));
  }

}
