//Given a binary tree and a sum, determine if the tree has a root-to-leaf path s
//uch that adding up all the values along the path equals the given sum.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given the below binary tree and sum = 22,
//
//
//      5
//     / \
//    4   8
//   /   / \
//  11  13  4
// /  \      \
//7    2      1
//
//
// return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
//
// Related Topics Tree Depth-first Search

//leetcode submit region begin(Prohibit modification and deletion)
package easy._1_200._112_path_sum;

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.4 MB,击败了5.88% 的Java用户
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.left != null || root.right != null) {
      sum = sum - root.val;
      return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
    if (root.val == sum) {
      return true;
    }

    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
