package medium._0200_0299._236_lowest_common_ancestor_of_a_binary_Tree;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public TreeNode find(TreeNode node, int i) {
    if (node == null) {
      return null;
    }
    if (node.val == i) {
      return node;
    }
    TreeNode left = find(node.left, i);
    if (left != null) {
      return left;
    }
    return find(node.right, i);
  }

  @Test
  public void test0() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
    TreeNode p = find(root, 5);
    TreeNode q = find(root, 1);
    TreeNode result = find(root, 3);
    TreeNode solution = new medium._0200_0299._236_lowest_common_ancestor_of_a_binary_Tree.Solution()
        .lowestCommonAncestor(root, p, q);
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test1() {
    TreeNode root = TreeNode.buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
    TreeNode p = find(root, 5);
    TreeNode q = find(root, 4);
    TreeNode result = find(root, 5);
    TreeNode solution = new medium._0200_0299._236_lowest_common_ancestor_of_a_binary_Tree.Solution()
        .lowestCommonAncestor(root, p, q);
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test2() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1, 2});
    TreeNode p = find(root, 1);
    TreeNode q = find(root, 2);
    TreeNode result = find(root, 1);
    TreeNode solution = new medium._0200_0299._236_lowest_common_ancestor_of_a_binary_Tree.Solution()
        .lowestCommonAncestor(root, p, q);
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test3() {
    TreeNode root = TreeNode.buildTree(new Integer[]{1,2,3,null,4});
    TreeNode p = find(root, 4);
    TreeNode q = find(root, 3);
    TreeNode result = find(root, 1);
    TreeNode solution = new medium._0200_0299._236_lowest_common_ancestor_of_a_binary_Tree.Solution()
        .lowestCommonAncestor(root, p, q);
    Assert.assertTrue(result == solution);
  }

}
