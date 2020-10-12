package easy._0700_0799._700_search_in_a_binary_search_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{4,2,7,1,3});
    int val = 2;
    TreeNode result = TreeNode.buildTree(new Integer[]{2,1,3});
    TreeNode solution = new easy._0700_0799._700_search_in_a_binary_search_tree.Solution()
        .searchBST(root, val);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{4,2,7,1,3});
    int val = 5;
    TreeNode result = TreeNode.buildTree(new Integer[]{});
    TreeNode solution = new easy._0700_0799._700_search_in_a_binary_search_tree.Solution()
        .searchBST(root, val);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
