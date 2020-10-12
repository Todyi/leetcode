package easy._0600_0699._671_second_minimum_node_in_a_binary_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2, 2, 5, null, null, 5, 7});
    Integer result = 5;
    int solution = new easy._0600_0699._671_second_minimum_node_in_a_binary_tree.Solution()
        .findSecondMinimumValue(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2, 2, 2});
    Integer result = -1;
    int solution = new easy._0600_0699._671_second_minimum_node_in_a_binary_tree.Solution()
        .findSecondMinimumValue(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2, 2, 5, 2, 3, 5, 7});
    Integer result = 3;
    int solution = new easy._0600_0699._671_second_minimum_node_in_a_binary_tree.Solution()
        .findSecondMinimumValue(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    TreeNode root = TreeNode
        .buildTree(new Integer[]{1, 1, 3, 1, 1, 3, 4, 3, 1, 1, 1, 3, 8, 4, 8, 3, 3, 1, 6, 2, 1});
    Integer result = 2;
    int solution = new easy._0600_0699._671_second_minimum_node_in_a_binary_tree.Solution()
        .findSecondMinimumValue(root);
    Assert.assertTrue(result.equals(solution));
  }

}
