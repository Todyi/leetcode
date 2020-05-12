package easy._500_599._501_find_mode_in_binary_search_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 2, 2});
    int[] result = {2};
    int[] solution = new easy._500_599._501_find_mode_in_binary_search_tree.Solution()
        .findMode(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 2, 3, 1, 2, 3, 3});
    int[] result = {3};
    int[] solution = new easy._500_599._501_find_mode_in_binary_search_tree.Solution()
        .findMode(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 1, 2, 1, null, 2, 2, 1, 1});
    int[] result = {1};
    int[] solution = new easy._500_599._501_find_mode_in_binary_search_tree.Solution()
        .findMode(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 1, 2, 1, null, 2, 2});
    int[] result = {1, 2};
    int[] solution = new easy._500_599._501_find_mode_in_binary_search_tree.Solution()
        .findMode(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
