package medium._0000_0099._015_3_sum;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] nums, Integer result) {
    List<List<Integer>> solution = new Solution()
        .threeSum(nums);
    if (!result.equals(solution.size())) {
      Assert.fail();
    }
    for (List<Integer> n : solution) {
      int sum = n.get(0) + n.get(1) + n.get(2);
      if (sum != 0) {
        Assert.fail();
      }
    }
  }

  @Test
  public void test0() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    Integer result = 2;
    assertTrue(nums, result);
  }

  @Test
  public void test1() {
    int[] nums = {};
    Integer result = 0;
    assertTrue(nums, result);
  }

  @Test
  public void test2() {
    int[] nums = {0};
    Integer result = 0;
    assertTrue(nums, result);
  }

  @Test
  public void test3() {
    int[] nums = {1};
    Integer result = 0;
    assertTrue(nums, result);
  }

  @Test
  public void test4() {
    int[] nums = {1, 1, -2};
    Integer result = 1;
    assertTrue(nums, result);
  }

  @Test
  public void test5() {
    int[] nums = {3, 0, -2, -1, 1, 2};
    Integer result = 3;
    assertTrue(nums, result);
  }


}
