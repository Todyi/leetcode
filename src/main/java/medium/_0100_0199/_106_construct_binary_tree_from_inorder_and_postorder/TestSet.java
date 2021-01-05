package medium._0100_0199._106_construct_binary_tree_from_inorder_and_postorder;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] inorder = {9, 3, 15, 20, 7};
    int[] postorder = {9, 15, 7, 20, 3};
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    TreeNode solution = new medium._0100_0199._106_construct_binary_tree_from_inorder_and_postorder.Solution()
        .buildTree(inorder, postorder);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] inorder = {20, 9, 3, 7, 15};
    int[] postorder = {20, 9, 7, 15, 3};
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 9, 15, 20, null, 7, null});
    TreeNode solution = new medium._0100_0199._106_construct_binary_tree_from_inorder_and_postorder.Solution()
        .buildTree(inorder, postorder);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
