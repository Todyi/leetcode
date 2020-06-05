package easy._600_699._687_longest_univalue_path;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{5, 4, 5, 1, 1, null, 5});
    Integer result = 2;
    int solution = new easy._600_699._687_longest_univalue_path.Solution()
        .longestUnivaluePath(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 4, 5, 4, 4, null, 5});
    Integer result = 2;
    int solution = new easy._600_699._687_longest_univalue_path.Solution()
        .longestUnivaluePath(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2, 2, 2, 2, 2});
    Integer result = 2;
    int solution = new easy._600_699._687_longest_univalue_path.Solution()
        .longestUnivaluePath(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, null, 1, 1, 1, 1, 1, 1});
    Integer result = 4;
    int solution = new easy._600_699._687_longest_univalue_path.Solution()
        .longestUnivaluePath(root);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    TreeNode root = TreeNode.buildTree(
        new Integer[]{5, 4, 5, 4, 4, 5, 3, 4, 4, null, null, null, 4, null, null, 4, null, null, 4,
            null, 4, 4, null, null, 4, 4});
    Integer result = 6;
    int solution = new easy._600_699._687_longest_univalue_path.Solution()
        .longestUnivaluePath(root);
    Assert.assertTrue(result.equals(solution));
  }

}
