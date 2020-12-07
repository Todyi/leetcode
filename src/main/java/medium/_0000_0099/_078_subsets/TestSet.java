package medium._0000_0099._078_subsets;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] nums = {1, 2, 3};
    Integer result = 8;
    List<List<Integer>> solution = new medium._0000_0099._078_subsets.Solution()
        .subsets(nums);
    Assert.assertTrue(result.equals(solution.size()));
  }

  @Test
  public void test1() {
    int[] nums = {0};
    Integer result = 2;
    List<List<Integer>> solution = new medium._0000_0099._078_subsets.Solution()
        .subsets(nums);
    Assert.assertTrue(result.equals(solution.size()));
  }

}
