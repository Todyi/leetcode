package medium._0000_0099._047_permutations_ii;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[] nums, int len) {
    List<List<Integer>> solution = new medium._0000_0099._047_permutations_ii.Solution()
        .permuteUnique(nums);
    Assert.assertEquals(solution.size(), len);
  }

  @Test
  public void test0() {
    int[] nums = {1, 1, 2};
    int len = 3;
    assertTrue(nums, len);
  }

  @Test
  public void test1() {
    int[] nums = {1, 2, 3};
    int len = 6;
    assertTrue(nums, len);
  }

  @Test
  public void test2() {
    int[] nums = {2,2,1,1};
    int len = 6;
    assertTrue(nums, len);
  }

}
