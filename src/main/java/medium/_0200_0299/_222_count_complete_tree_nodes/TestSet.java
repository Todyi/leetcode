package medium._0200_0299._222_count_complete_tree_nodes;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, 6});
    Integer result = 6;
    int solution = new medium._0200_0299._222_count_complete_tree_nodes.Solution()
        .countNodes(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{});
    Integer result = 0;
    int solution = new medium._0200_0299._222_count_complete_tree_nodes.Solution()
        .countNodes(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1});
    Integer result = 1;
    int solution = new medium._0200_0299._222_count_complete_tree_nodes.Solution()
        .countNodes(root);
    Assert.assertTrue(result.equals(solution));
  }


}
