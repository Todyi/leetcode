package medium._0000_0099._094_binary_tree_inorder_traversal;


import common.Comparators;
import common.TreeNode;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 2, 3});
    Integer[] result = {1, 3, 2};
    List<Integer> solution = new medium._0000_0099._094_binary_tree_inorder_traversal.Solution()
        .inorderTraversal(root);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{});
    Integer[] result = {};
    List<Integer> solution = new medium._0000_0099._094_binary_tree_inorder_traversal.Solution()
        .inorderTraversal(root);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1});
    Integer[] result = {1};
    List<Integer> solution = new medium._0000_0099._094_binary_tree_inorder_traversal.Solution()
        .inorderTraversal(root);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test3() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2});
    Integer[] result = {2, 1};
    List<Integer> solution = new medium._0000_0099._094_binary_tree_inorder_traversal.Solution()
        .inorderTraversal(root);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test4() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 2});
    Integer[] result = {1, 2};
    List<Integer> solution = new medium._0000_0099._094_binary_tree_inorder_traversal.Solution()
        .inorderTraversal(root);
    Integer[] solutionArr = new Integer[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
