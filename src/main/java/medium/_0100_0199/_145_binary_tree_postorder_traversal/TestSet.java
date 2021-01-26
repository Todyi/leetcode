package medium._0100_0199._145_binary_tree_postorder_traversal;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 2, 3});
    Integer[] result = {3, 2, 1};
    List<Integer> solution = new medium._0100_0199._145_binary_tree_postorder_traversal.Solution()
        .postorderTraversal(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{});
    Integer[] result = {};
    List<Integer> solution = new medium._0100_0199._145_binary_tree_postorder_traversal.Solution()
        .postorderTraversal(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1});
    Integer[] result = {1};
    List<Integer> solution = new medium._0100_0199._145_binary_tree_postorder_traversal.Solution()
        .postorderTraversal(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }

  @Test
  public void test3() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2});
    Integer[] result = {2, 1};
    List<Integer> solution = new medium._0100_0199._145_binary_tree_postorder_traversal.Solution()
        .postorderTraversal(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }

  @Test
  public void test4() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 2});
    Integer[] result = {2, 1};
    List<Integer> solution = new medium._0100_0199._145_binary_tree_postorder_traversal.Solution()
        .postorderTraversal(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }

  @Test
  public void test5() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 3});
    Integer[] result = {2, 3, 1};
    List<Integer> solution = new medium._0100_0199._145_binary_tree_postorder_traversal.Solution()
        .postorderTraversal(root);
    Integer[] solArr = new Integer[solution.size()];
    solution.toArray(solArr);
    Assert.assertTrue(Comparators.isSame(result, solArr));
  }
}
