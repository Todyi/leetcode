package easy._0500_0599._563_binary_tree_tilt;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3});
    Integer result = 1;
    int solution = new easy._0500_0599._563_binary_tree_tilt.Solution()
        .findTilt(root);
    Assert.assertTrue(result.equals(solution));
  }

}
