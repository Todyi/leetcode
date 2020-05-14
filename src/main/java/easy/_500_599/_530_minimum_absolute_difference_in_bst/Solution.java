package easy._500_599._530_minimum_absolute_difference_in_bst;

//Given a binary search tree with non-negative values,
// find the minimum absolute difference between values of any two nodes.
//
// Example:
//
//
//Input:
//
//   1
//    \
//     3
//    /
//   2
//
//Output:
//1
//
//Explanation:
//The minimum absolute difference is 1,
// which is the difference between 2 and 1 (or between 2 and 3).
//
//
//
//
// Note:
//
//
// There are at least two nodes in this BST.
// This question is the same as 783:
// https://leetcode.com/problems/minimum-distance-between-bst-nodes/
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
  //  内存消耗:39 MB,击败了92.31% 的Java用户
  public int getMinimumDifference(TreeNode root) {
    TreeNode[] preNode = new TreeNode[1];
    return inOrder(root, preNode, Integer.MAX_VALUE);
  }

  public int inOrder(TreeNode node, TreeNode[] preNode, int min) {
    if (node == null) {
      return Integer.MAX_VALUE;
    }
    min = Math.min(inOrder(node.left, preNode, min), min);

    if (preNode[0] != null) {
      min = Math.min(node.val - preNode[0].val, min);
    }
    preNode[0] = node;

    min = Math.min(inOrder(node.right, preNode, min), min);
    return min;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

