package easy._100_199._104_maximum_depth_of_binary_tree;/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //39/39 cases passed (0 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 92.47 % of java submissions (39.4 MB)
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

  }
}
// @lc code=end

