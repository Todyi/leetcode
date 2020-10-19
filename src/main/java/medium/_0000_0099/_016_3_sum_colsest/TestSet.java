package medium._0000_0099._016_3_sum_colsest;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    Integer result = 2;
    int solution = new medium._0000_0099._016_3_sum_colsest.Solution()
        .threeSumClosest(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] nums = {1, 1, 1, 1};
    int target = 0;
    Integer result = 3;
    int solution = new medium._0000_0099._016_3_sum_colsest.Solution()
        .threeSumClosest(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] nums = {0, 2, 1, -3};
    int target = 1;
    Integer result = 0;
    int solution = new medium._0000_0099._016_3_sum_colsest.Solution()
        .threeSumClosest(nums, target);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] nums = {-3, -2, -5, 3, -4};
    int target = -1;
    Integer result = -2;
    int solution = new medium._0000_0099._016_3_sum_colsest.Solution()
        .threeSumClosest(nums, target);
    Assert.assertTrue(result.equals(solution));
  }
}
