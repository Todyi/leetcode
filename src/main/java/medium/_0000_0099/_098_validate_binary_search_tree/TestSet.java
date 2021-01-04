package medium._0000_0099._098_validate_binary_search_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2, 1, 3});
    Boolean result = true;
    boolean solution = new medium._0000_0099._098_validate_binary_search_tree.Solution()
        .isValidBST(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5, 1, 4, null, null, 3, 6});
    Boolean result = false;
    boolean solution = new medium._0000_0099._098_validate_binary_search_tree.Solution()
        .isValidBST(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 1});
    Boolean result = false;
    boolean solution = new medium._0000_0099._098_validate_binary_search_tree.Solution()
        .isValidBST(root);
    Assert.assertTrue(result.equals(solution));
  }


}
