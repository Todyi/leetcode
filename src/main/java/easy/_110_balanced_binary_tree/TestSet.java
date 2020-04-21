package easy._110_balanced_binary_tree;


import static common.TreeNode.buildTree;

import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {3, 9, 20, null, null, 15, 7};
    Boolean result = true;
    Assert.assertTrue(
        result.equals(new easy._110_balanced_binary_tree.Solution().isBalanced(buildTree(input))));
  }

  @Test
  public void test1() {
    Integer[] input = {1,2,2,3,3,null,null,4,4};
    Boolean result = false;
    Assert.assertTrue(
        result.equals(new easy._110_balanced_binary_tree.Solution().isBalanced(buildTree(input))));
  }

  @Test
  public void test2() {
    Integer[] input = {1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5};
    Boolean result = true;
    Assert.assertTrue(
        result.equals(new easy._110_balanced_binary_tree.Solution().isBalanced(buildTree(input))));
  }

  @Test
  public void test3() {
    Integer[] input = {1,2,2,3,null,null,3,4,null,null,4};
    Boolean result = false;
    Assert.assertTrue(
        result.equals(new easy._110_balanced_binary_tree.Solution().isBalanced(buildTree(input))));
  }


}
