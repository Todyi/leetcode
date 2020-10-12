package easy._0500_0599._563_binary_tree_tilt;

//Given a binary tree, return the tilt of the whole tree.
//
// The tilt of a tree node is defined as the absolute difference between
// the sum of all left subtree node values and the sum of all right subtree node values.
// Null node has tilt 0.
//
// The tilt of the whole tree is defined as the sum of all nodes' tilt.
//
// Example:
//
//Input:
//         1
//       /   \
//      2     3
//Output: 1
//Explanation:
//Tilt of node 2 : 0
//Tilt of node 3 : 0
//Tilt of node 1 : |2-3| = 1
//Tilt of binary tree : 0 + 0 + 1 = 1
//
//
//
// Note:
//
// The sum of node values in any subtree won't exceed the range of 32-bit integer.
// All the tilt values won't exceed the range of 32-bit integer.
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
  //  内存消耗:39.9 MB,击败了50.00% 的Java用户
  public int findTilt(TreeNode root) {
    int[] tilt = new int[1];
    sum(root, tilt);
    return tilt[0];
  }

  public int sum(TreeNode node, int[] tilt) {
    if (node == null) {
      return 0;
    }
    int lSum = sum(node.left, tilt);
    int rSum = sum(node.right, tilt);
    tilt[0] += Math.abs(lSum - rSum);

    return lSum + rSum + node.val;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

