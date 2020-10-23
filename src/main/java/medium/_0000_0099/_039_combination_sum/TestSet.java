package medium._0000_0099._039_combination_sum;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] candidates, int target, int len) {
    List<List<Integer>> solution = new Solution()
        .combinationSum(candidates, target);
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
    int[] candidates = {2, 3, 6, 7};
    int target = 7;
    int len = 2;
    assertTrue(candidates, target, len);
  }

  @Test
  public void test1() {
    int[] candidates = {2, 3, 5};
    int target = 8;
    int len = 3;
    assertTrue(candidates, target, len);
  }

  @Test
  public void test2() {
    int[] candidates = {2};
    int target = 1;
    int len = 0;
    assertTrue(candidates, target, len);
  }

  @Test
  public void test3() {
    int[] candidates = {1};
    int target = 1;
    int len = 1;
    assertTrue(candidates, target, len);
  }

  @Test
  public void test4() {
    int[] candidates = {1};
    int target = 2;
    int len = 1;
    assertTrue(candidates, target, len);
  }

  @Test
  public void test5() {
    int[] candidates = {2, 7, 6, 3, 5, 1};
    int target = 9;
    int len = 21;
    assertTrue(candidates, target, len);
  }


}
