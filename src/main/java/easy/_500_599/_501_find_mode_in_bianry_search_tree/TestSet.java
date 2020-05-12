package easy._500_599._501_find_mode_in_bianry_search_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 2, 2});
    int[] result = {2};
    int[] solution = new easy._500_599._501_find_mode_in_bianry_search_tree.Solution()
        .findMode(root);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
