package easy._0600_0699._669_trim_a_bianry_search_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 0, 2});
    int L = 1;
    int R = 2;
    TreeNode result = TreeNode.buildTree(new Integer[]{1, null, 2});
    TreeNode solution = new easy._0600_0699._669_trim_a_bianry_search_tree.Solution()
        .trimBST(root, L, R);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 0, 4, null, 2, null, null, 1});
    int L = 1;
    int R = 3;
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 2, null, 1});
    TreeNode solution = new easy._0600_0699._669_trim_a_bianry_search_tree.Solution()
        .trimBST(root, L, R);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{4,2,5,1,3});
    int L = 3;
    int R = 5;
    TreeNode result = TreeNode.buildTree(new Integer[]{4,3,5});
    TreeNode solution = new easy._0600_0699._669_trim_a_bianry_search_tree.Solution()
        .trimBST(root, L, R);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
