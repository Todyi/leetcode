//Given a binary tree, find its minimum depth.
//
// The minimum depth is the number of nodes along the shortest path from the roo
//t node down to the nearest leaf node.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given binary tree [3,9,20,null,null,15,7],
//
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
// return its minimum depth = 2.
// Related Topics Tree Depth-first Search Breadth-first Search

//leetcode submit region begin(Prohibit modification and deletion)

package easy._111_minimum_depth_of_binary_tree;

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

//解答成功:
//执行耗时:0 ms,击败了100.00% 的Java用户
//内存消耗:39.5 MB,击败了93.75% 的Java用户
  public int minDepth(TreeNode root) {
    if (root != null) {
      if (root.left != null && root.right != null) {
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
      }
      if (root.left != null) {
        return 1 + minDepth(root.left);
      }
      if (root.right != null) {
        return 1 + minDepth(root.right);
      }
      return 1;
    }
    return 0;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
