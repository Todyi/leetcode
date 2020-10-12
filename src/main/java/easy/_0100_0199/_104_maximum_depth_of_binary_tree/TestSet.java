package easy._0100_0199._104_maximum_depth_of_binary_tree;


import static common.TreeNode.buildTree;

import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {3, 9, 20, null, null, 15, 7};
    int result = 3;
    Assert.assertTrue(
        result == new Solution().maxDepth(buildTree(input)));
  }

  @Test
  public void test1() {
    Integer[] input = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5};
    int result = 5;
    Assert.assertTrue(
        result == new Solution().maxDepth(buildTree(input)));
  }

}
