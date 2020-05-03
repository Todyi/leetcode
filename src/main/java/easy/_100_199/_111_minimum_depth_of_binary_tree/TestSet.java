package easy._100_199._111_minimum_depth_of_binary_tree;


import static common.TreeNode.buildTree;

import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {3, 9, 20, null, null, 15, 7};
    int result = 2;
    int solution = new Solution().minDepth(buildTree(input));
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test1() {
    Integer[] input = {1,2};
    int result = 2;
    Assert.assertTrue(
        result == new Solution().minDepth(buildTree(input)));
  }


}
