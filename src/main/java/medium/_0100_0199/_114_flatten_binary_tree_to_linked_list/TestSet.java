package medium._0100_0199._114_flatten_binary_tree_to_linked_list;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{
        1,
        2, 5,
        3, 4, null, 6});
    TreeNode result = TreeNode.buildTree(new Integer[]{
        1,
        null, 2,
        null, 3,
        null, 4,
        null, 5,
        null, 6
    });
    new medium._0100_0199._114_flatten_binary_tree_to_linked_list.Solution()
        .flatten(root);
    Assert.assertTrue(Comparators.isSame(result, root));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, null, 3});
    TreeNode result = TreeNode.buildTree(new Integer[]{1, null, 2, null, 3});
    new medium._0100_0199._114_flatten_binary_tree_to_linked_list.Solution()
        .flatten(root);
    Assert.assertTrue(Comparators.isSame(result, root));
  }


}
