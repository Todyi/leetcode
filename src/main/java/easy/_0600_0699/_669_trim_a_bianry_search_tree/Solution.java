package easy._0600_0699._669_trim_a_bianry_search_tree;

//
//Given a binary search tree and the lowest and highest boundaries as L and R,
// trim the tree so that all its elements lies in [L, R] (R >= L). You might need to
// change the root of the tree, so the result should return the new root of the trimmed binary search tree.
//
//
// Example 1:
//
//Input:
//    1
//   / \
//  0   2
//
//  L = 1
//  R = 2
//
//Output:
//    1
//      \
//       2
//
//
//
// Example 2:
//
//Input:
//    3
//   / \
//  0   4
//   \
//    2
//   /
//  1
//
//  L = 1
//  R = 3
//
//Output:
//      3
//     /
//   2
//  /
// 1
//
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.3 MB,击败了5.55% 的Java用户
  public TreeNode trimBST(TreeNode root, int L, int R) {
    if (root == null) {
      return null;
    }
    while (true) {
      if (root.val < L) {
        root = root.right;
      } else if (R < root.val) {
        root = root.left;
      } else {
        break;
      }
    }
    trim(root, root.left, L, true);
    trim(root, root.right, R, false);
    return root;
  }

  public void trim(TreeNode node, TreeNode tree, int limit, boolean less) {
    if (tree == null) {
      return;
    }
    if (less) {
      if (tree.val < limit) {
        node.left = tree.right;
        trim(node, node.left, limit, true);
      } else {
        trim(tree, tree.left, limit, true);
      }
    } else {
      if (limit < tree.val) {
        node.right = tree.left;
        trim(node, node.right, limit, false);
      } else {
        trim(tree, tree.right, limit, false);
      }
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

