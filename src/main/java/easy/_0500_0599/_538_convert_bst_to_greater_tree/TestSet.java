package easy._0500_0599._538_convert_bst_to_greater_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5, 2, 13});
    TreeNode result = TreeNode.buildTree(new Integer[]{18, 20, 13});
    TreeNode solution = new easy._0500_0599._538_convert_bst_to_greater_tree.Solution()
        .convertBST(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2, 2, 13});
    TreeNode result = TreeNode.buildTree(new Integer[]{15, 15, 13});
    TreeNode solution = new easy._0500_0599._538_convert_bst_to_greater_tree.Solution()
        .convertBST(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
