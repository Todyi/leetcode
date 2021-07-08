package medium._0000_0099._099_recover_binary_search_tree;


import common.Comparators;
import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 3, null, null, 2});
    TreeNode result = TreeNode.buildTree(new Integer[]{3, 1, null, null, 2});
    new medium._0000_0099._099_recover_binary_search_tree.Solution().recoverTree(root);
    Assert.assertTrue(Comparators.isSame(root, result));
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3,1,4,null,null,2});
    TreeNode result = TreeNode.buildTree(new Integer[]{2,1,4,null,null,3});
    new medium._0000_0099._099_recover_binary_search_tree.Solution().recoverTree(root);
    Assert.assertTrue(Comparators.isSame(root, result));
  }


}
