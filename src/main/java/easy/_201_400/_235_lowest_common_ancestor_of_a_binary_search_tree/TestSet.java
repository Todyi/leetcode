package easy._201_400._235_lowest_common_ancestor_of_a_binary_search_tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
    TreeNode p = TreeNode.buildTree(new Integer[]{2});
    TreeNode q = TreeNode.buildTree(new Integer[]{8});
    TreeNode result = TreeNode.buildTree(new Integer[]{6});
    TreeNode resolution = new easy._201_400._235_lowest_common_ancestor_of_a_binary_search_tree.Solution().lowestCommonAncestor(root,p,q);
    Assert.assertTrue(result.val == resolution.val);
  }
  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
    TreeNode p = TreeNode.buildTree(new Integer[]{2});
    TreeNode q = TreeNode.buildTree(new Integer[]{4});
    TreeNode result = TreeNode.buildTree(new Integer[]{2});
    TreeNode resolution = new easy._201_400._235_lowest_common_ancestor_of_a_binary_search_tree.Solution().lowestCommonAncestor(root,p,q);
    Assert.assertTrue(result.val == resolution.val);
  }
  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{2,1});
    TreeNode p = TreeNode.buildTree(new Integer[]{2});
    TreeNode q = TreeNode.buildTree(new Integer[]{1});
    TreeNode result = TreeNode.buildTree(new Integer[]{2});
    TreeNode resolution = new easy._201_400._235_lowest_common_ancestor_of_a_binary_search_tree.Solution().lowestCommonAncestor(root,p,q);
    Assert.assertTrue(result.val == resolution.val);
  }
}
