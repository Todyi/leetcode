package easy._0500_0599._532_k_diff_pairs_in_an_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {3, 1, 4, 1, 5};
    int k = 2;
    Integer result = 2;
    int solution = new easy._0500_0599._532_k_diff_pairs_in_an_array.Solution()
        .findPairs(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 1;
    Integer result = 4;
    int solution = new easy._0500_0599._532_k_diff_pairs_in_an_array.Solution()
        .findPairs(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {1, 3, 1, 5, 4};
    int k = 0;
    Integer result = 1;
    int solution = new easy._0500_0599._532_k_diff_pairs_in_an_array.Solution()
        .findPairs(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {1, 2, 3, 4, 5};
    int k = -1;
    Integer result = 0;
    int solution = new easy._0500_0599._532_k_diff_pairs_in_an_array.Solution()
        .findPairs(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] nums = {1,1,1,2,2};
    int k = 1;
    Integer result = 1;
    int solution = new easy._0500_0599._532_k_diff_pairs_in_an_array.Solution()
        .findPairs(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] nums = {1,1,1,2,2};
    int k = 2;
    Integer result = 0;
    int solution = new easy._0500_0599._532_k_diff_pairs_in_an_array.Solution()
        .findPairs(nums, k);
    Assert.assertTrue(result.equals(solution));
  }

}
