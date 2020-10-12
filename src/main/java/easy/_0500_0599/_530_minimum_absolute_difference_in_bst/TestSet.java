package easy._0500_0599._530_minimum_absolute_difference_in_bst;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 3, 2});
    Integer result = 1;
    int solution = new easy._0500_0599._530_minimum_absolute_difference_in_bst.Solution()
        .getMinimumDifference(root);
    Assert.assertTrue(result.equals(solution));
  }

}
