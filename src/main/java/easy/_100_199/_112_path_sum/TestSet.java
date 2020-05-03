package easy._100_199._112_path_sum;


import static common.TreeNode.buildTree;

import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1};
    int sum = 22;
    Boolean result = true;
    boolean solution = new Solution().hasPathSum(buildTree(input), sum);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    Integer[] input = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4};
    int sum = 14;
    Boolean result = true;
    boolean solution = new Solution().hasPathSum(buildTree(input), sum);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    Integer[] input = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, null, null, 5, 5};
    int sum = 6;
    Boolean result = true;
    boolean solution = new Solution().hasPathSum(buildTree(input), sum);
    Assert.assertTrue(result.equals(solution));
  }


}
