package medium._0000_0099._040_combination_sum_ii;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] candidates, int target, int len) {
    List<List<Integer>> solution = new medium._0000_0099._040_combination_sum_ii.Solution()
        .combinationSum2(candidates, target);
    Assert.assertEquals(solution.size(), len);
    for (List<Integer> nums : solution) {
      int sum = 0;
      for (Integer num : nums) {
        sum += num;
      }
      Assert.assertEquals(sum, target);
    }
  }

  @Test
  public void test0() {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;
    int len = 4;
    assertTrue(candidates, target, len);
  }

  @Test
  public void test1() {
    int[] candidates = {2, 5, 2, 1, 2};
    int target = 5;
    int len = 2;
    assertTrue(candidates, target, len);
  }


}
