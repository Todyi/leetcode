package medium._0000_0099._018_4_sum;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] nums, int target, Integer result) {
    List<List<Integer>> solution = new medium._0000_0099._018_4_sum.Solution()
        .fourSum(nums, target);
    if (!result.equals(solution.size())) {
      Assert.fail();
    }
    for (List<Integer> n : solution) {
      int sum = n.get(0) + n.get(1) + n.get(2) + n.get(3);
      if (sum != target) {
        Assert.fail();
      }
    }
  }

  @Test
  public void test0() {
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    Integer result = 3;
    assertTrue(nums, target, result);
  }

  @Test
  public void test1() {
    int[] nums = {};
    int target = 0;
    Integer result = 0;
    assertTrue(nums, target, result);
  }

  @Test
  public void test2() {
    int[] nums = {-2, -1, -1, 1, 1, 2, 2};
    int target = 0;
    Integer result = 2;
    assertTrue(nums, target, result);
  }

  @Test
  public void test3() {
    int[] nums = {3, 1, 4, 2, 5, -4, 2, 4, -5};
    int target = -12;
    Integer result = 0;
    assertTrue(nums, target, result);
  }


}
