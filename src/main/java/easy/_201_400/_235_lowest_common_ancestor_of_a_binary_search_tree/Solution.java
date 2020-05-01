package easy._201_400._235_lowest_common_ancestor_of_a_binary_search_tree;

//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two
// given nodes in the BST.
//
// According to the definition of LCA on Wikipedia: “The lowest common ancestor
//is defined between two nodes p and q as the lowest node in T that has both p and
// q as descendants (where we allow a node to be a descendant of itself).”
//
// Given binary search tree: root = [6,2,8,0,4,7,9,null,null,3,5]
//
//
//
// Example 1:
//
//
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//Output: 6
//Explanation: The LCA of nodes 2 and 8 is 6.
//
//
// Example 2:
//
//
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//Output: 2
//Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant o
//f itself according to the LCA definition.
//
//
//
//
// Note:
//
//
// All of the nodes' values will be unique.
// p and q are different and both values will exist in the BST.
//
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:11 ms,击败了6.26% 的Java用户
  //  内存消耗:40.1 MB,击败了5.10% 的Java用户
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || (root.left == null && root.right == null)) {
      return null;
    }
    boolean isPAncestor = isAncestor(root, p.val);
    boolean isQAncestor = isAncestor(root, q.val);
    if (root.val == p.val && isQAncestor) {
      return root;
    }
    if (root.val == q.val && isPAncestor) {
      return root;
    }
    TreeNode leftSubTree = lowestCommonAncestor(root.left, p, q);
    if (leftSubTree != null) {
      return leftSubTree;
    }

    TreeNode rightSubTree = lowestCommonAncestor(root.right, p, q);
    if (rightSubTree != null) {
      return rightSubTree;
    }

    if (isQAncestor && isPAncestor) {
      return root;
    }
    return null;
  }

  public boolean isAncestor(TreeNode node, int q) {
    if (node == null) {
      return false;
    }
    if (node.val == q) {
      return true;
    }
    return isAncestor(node.left, q) || isAncestor(node.right, q);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

