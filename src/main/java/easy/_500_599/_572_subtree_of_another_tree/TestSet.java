package easy._500_599._572_subtree_of_another_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode s = TreeNode.buildTree(new Integer[]{3, 4, 5, 1, 2});
    TreeNode t = TreeNode.buildTree(new Integer[]{4, 1, 2});
    Boolean result = true;
    boolean solution = new easy._500_599._572_subtree_of_another_tree.Solution()
        .isSubtree(s, t);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    TreeNode s = TreeNode.buildTree(new Integer[]{3, 4, 5, 1, 2, null, null, null, null, 0});
    TreeNode t = TreeNode.buildTree(new Integer[]{4, 1, 2});
    Boolean result = false;
    boolean solution = new easy._500_599._572_subtree_of_another_tree.Solution()
        .isSubtree(s, t);
    Assert.assertTrue(result.equals(solution));
  }

}
