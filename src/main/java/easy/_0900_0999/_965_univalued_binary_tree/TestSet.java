package easy._0900_0999._965_univalued_binary_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 1, 1, 1, 1, null, 1});
    Boolean result = true;
    boolean solution = new easy._0900_0999._965_univalued_binary_tree.Solution()
        .isUnivalTree(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2, 2, 2, 5, 2});
    Boolean result = false;
    boolean solution = new easy._0900_0999._965_univalued_binary_tree.Solution()
        .isUnivalTree(root);
    Assert.assertTrue(result.equals(solution));
  }

}
