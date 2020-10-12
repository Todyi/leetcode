package easy._0900_0999._993_cousins_in_binary_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3, 4});
    int x = 4;
    int y = 3;
    Boolean result = false;
    boolean solution = new easy._0900_0999._993_cousins_in_binary_tree.Solution()
        .isCousins(root, x, y);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3, null, 4, null, 5});
    int x = 5;
    int y = 4;
    Boolean result = true;
    boolean solution = new easy._0900_0999._993_cousins_in_binary_tree.Solution()
        .isCousins(root, x, y);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3, null, 4});
    int x = 2;
    int y = 3;
    Boolean result = false;
    boolean solution = new easy._0900_0999._993_cousins_in_binary_tree.Solution()
        .isCousins(root, x, y);
    Assert.assertTrue(result.equals(solution));
  }

}
