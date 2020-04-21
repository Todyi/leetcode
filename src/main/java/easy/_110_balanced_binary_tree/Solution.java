package easy._110_balanced_binary_tree;

//Given a binary tree, determine if it is height-balanced.
//
// For this problem, a height-balanced binary tree is defined as:
//
//
// a binary tree in which the left and right subtrees of every node differ in he
//ight by no more than 1.
//
//
//
//
// Example 1:
//
// Given the following tree [3,9,20,null,null,15,7]:
//
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
// Return true.
//
//Example 2:
//
// Given the following tree [1,2,2,3,3,null,null,4,4]:
//
//
//       1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
//
//
// Return false.
// Related Topics Tree Depth-first Search

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //解答成功:
  //执行耗时:1 ms,击败了50.21% 的Java用户
  //内存消耗:39.8 MB,击败了68.52% 的Java用户
//  public boolean isBalanced(TreeNode root) {
//    if (root == null) {
//      return true;
//    }
//    if (root.left == null && root.right == null) {
//      return true;
//    }
//    int maxLevelLeft = getMaxLevel(root.left);
//    int maxLevelRight = getMaxLevel(root.right);
//    if (Math.abs(maxLevelLeft - maxLevelRight) < 2) {
//      return isBalanced(root.left) && isBalanced(root.right);
//    }
//    return false;
//
//  }
//

//解答成功:
//执行耗时:0 ms,击败了100.00% 的Java用户
//内存消耗:39.6 MB,击败了70.37% 的Java用户
  public int getMaxLevel(TreeNode node) {
    if (node == null) {
      return 0;
    }
    if (node.left == null && node.right == null) {
      return 1;
    }
    return 1 + Math.max(getMaxLevel(node.left), getMaxLevel(node.right));
  }

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (root.left == null && root.right == null) {
      return true;
    }
    if (isBalanced(root.left) && isBalanced(root.right)) {
      int maxLevelLeft = getMaxLevel(root.left);
      int maxLevelRight = getMaxLevel(root.right);
      return Math.abs(maxLevelLeft - maxLevelRight) < 2;
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

