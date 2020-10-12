package easy._0500_0599._543_diameter_of_binary_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5});
    Integer result = 3;
    int solution = new easy._0500_0599._543_diameter_of_binary_tree.Solution()
        .diameterOfBinaryTree(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3,1,null,null,2});
    Integer result = 2;
    int solution = new easy._0500_0599._543_diameter_of_binary_tree.Solution()
        .diameterOfBinaryTree(root);
    Assert.assertTrue(result.equals(solution));
  }

}
