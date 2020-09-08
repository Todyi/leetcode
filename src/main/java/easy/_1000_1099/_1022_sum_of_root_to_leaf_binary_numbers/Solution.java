package easy._1000_1099._1022_sum_of_root_to_leaf_binary_numbers;

//Given a binary tree, each node has value 0 or 1. Each root-to-leaf path represents a binary number
// starting with the most significant bit. For example, if the path is 0 -> 1 -> 1 -> 0 -> 1,
// then this could represent 01101 in binary, which is 13.
//
// For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
//
// Return the sum of these numbers.
//
//
//
// Example 1:
//
//
//
//
//Input: [1,0,1,0,1,0,1]
//Output: 22
//Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
//
//
//
//
// Note:
//
//
// The number of nodes in the tree is between 1 and 1000.
// node.val is 0 or 1.
// The answer will not exceed 2^31 - 1.
//
// Related Topics Tree
// 👍 602 👎 74

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
  //  内存消耗:39 MB,击败了75.54% 的Java用户
  int sum = 0;

  public int sumRootToLeaf(TreeNode root) {
    preOrder(root, 0);
    return sum;
  }

  public void preOrder(TreeNode node, int preSum) {
    if (node == null) {
      return;
    }
    preSum = (preSum << 1) + node.val;
    if (node.left == null && node.right == null) {
      sum += preSum;
      return;
    }

    if (node.left != null) {
      preOrder(node.left, preSum);
    }
    if (node.right != null) {
      preOrder(node.right, preSum);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)
