package medium._0100_0199._0105_construct_binary_tree_from_preorder_and_inorder_traversal;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] preorder = {3, 9, 20, 15, 7};
    int[] inorder = {9, 3, 15, 20, 7};
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    TreeNode solution = new medium._0100_0199._0105_construct_binary_tree_from_preorder_and_inorder_traversal.Solution()
        .buildTree(preorder, inorder);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] preorder = {3, 9, 20, 15, 7};
    int[] inorder = {20, 9, 3, 7, 15};
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 9, 15, 20, null, 7, null});
    TreeNode solution = new medium._0100_0199._0105_construct_binary_tree_from_preorder_and_inorder_traversal.Solution()
        .buildTree(preorder, inorder);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
