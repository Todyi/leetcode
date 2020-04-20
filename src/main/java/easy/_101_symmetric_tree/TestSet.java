package easy._101_symmetric_tree;


import static common.TreeNode.buildTree;

import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {1, 2, 2, 3, 4, 4, 3};
    Boolean result = true;
    Assert.assertTrue(
        result.equals(new easy._101_symmetric_tree.Solution().isSymmetric(buildTree(input))));
  }

  @Test
  public void test1() {
    Integer[] input = {1, 2, 2, null, 3, null, 3};
    Boolean result = false;
    Assert.assertTrue(
        result.equals(new easy._101_symmetric_tree.Solution().isSymmetric(buildTree(input))));
  }

  @Test
  public void test2() {
    Integer[] input = {1, 2, 2, 3, null, null, 3};
    Boolean result = true;
    Assert.assertTrue(
        result.equals(new easy._101_symmetric_tree.Solution().isSymmetric(buildTree(input))));
  }

  @Test
  public void test3() {
    Integer[] input = {2, 3, 3, 4, 5, 4, 5};
    Boolean result = false;
    Assert.assertTrue(
        result.equals(new easy._101_symmetric_tree.Solution().isSymmetric(buildTree(input))));
  }

}
