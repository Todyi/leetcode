package medium._0100_0199._0102_binary_tree_level_order_traversal;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
    Integer[][] result = new Integer[][]{
        {3},
        {9, 20},
        {15, 7}
    };
    List<List<Integer>> solution = new medium._0100_0199._0102_binary_tree_level_order_traversal.Solution()
        .levelOrder(root);

    Assert.assertTrue(result.length == solution.size());
    for (int i = 0; i < result.length; i++) {
      List<Integer> list = solution.get(i);
      Integer[] arr = new Integer[list.size()];
      list.toArray(arr);
      Assert.assertTrue(Comparators.isSame(result[i], arr));
    }
  }


}
