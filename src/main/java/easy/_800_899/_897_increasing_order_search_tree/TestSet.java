package easy._800_899._897_increasing_order_search_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode
        .buildTree(new Integer[]{5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9});
    TreeNode result = TreeNode.buildTree(
        new Integer[]{1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9});
    TreeNode solution = new easy._800_899._897_increasing_order_search_tree.Solution()
        .increasingBST(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
