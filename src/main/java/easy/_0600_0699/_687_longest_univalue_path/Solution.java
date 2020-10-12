package easy._0600_0699._687_longest_univalue_path;

//Given a binary tree, find the length of the longest path
// where each node in the path has the same value.
// This path may or may not pass through the root.
//
// The length of path between two nodes is represented by the number of edges between them.
//
//
//
// Example 1:
//
// Input:
//
//
//              5
//             / \
//            4   5
//           / \   \
//          1   1   5
//
//
// Output: 2
//
//
//
// Example 2:
//
// Input:
//
//
//              1
//             / \
//            4   5
//           / \   \
//          4   4   5
//
//
// Output: 2
//
//
//
// Note: The given binary tree has not more than 10000 nodes. The height of the
//tree is not more than 1000.
// Related Topics Tree Recursion

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了96.88% 的Java用户
  //  内存消耗:42 MB,击败了89.77% 的Java用户
//  int max = 0;
//
//  public int longestUnivaluePath(TreeNode root) {
//    if (root == null) {
//      return 0;
//    }
//    dfs(root, -1);
//    return max;
//  }
//
//  public int dfs(TreeNode root, int pathValue) {
//    if (root == null) {
//      return 0;
//    }
//    int left = dfs(root.left, root.val), right = dfs(root.right, root.val);
//    max = Math.max(max, left + right);
//    if (root.val == pathValue) {
//      return 1 + Math.max(left, right);
//    }
//    return 0;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:42 MB,击败了85.19% 的Java用户
  int max = 0;

  public int longestUnivaluePath(TreeNode root) {
    if (root == null) {
      return 0;
    }
    dfs(root);
    return max;
  }

  public int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }

    int l = dfs(root.left), r = dfs(root.right);

    if (root.left != null && root.left.val != root.val) {
      l = 0;
    }
    if (root.right != null && root.right.val != root.val) {
      r = 0;
    }

    max = Math.max(max, l + r);
    return Math.max(l, r) + 1;

  }

}
//leetcode submit region end(Prohibit modification and deletion)

