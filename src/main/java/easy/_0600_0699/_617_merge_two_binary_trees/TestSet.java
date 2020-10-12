package easy._0600_0699._617_merge_two_binary_trees;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode t1 = TreeNode.buildTree(new Integer[]{1, 3, 2, 5});
    TreeNode t2 = TreeNode.buildTree(new Integer[]{2, 1, 3, null, 4, null, 7});
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 4, 5, 5, 4, null, 7});
    TreeNode solution = new easy._0600_0699._617_merge_two_binary_trees.Solution()
        .mergeTrees(t1, t2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    TreeNode t1 = TreeNode.buildTree(new Integer[]{});
    TreeNode t2 = TreeNode.buildTree(new Integer[]{1});
    TreeNode result = TreeNode.buildTree(new Integer[]{1});
    TreeNode solution = new easy._0600_0699._617_merge_two_binary_trees.Solution()
        .mergeTrees(t1, t2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
