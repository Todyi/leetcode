package easy._0400_0499._404_sum_of_left_leaves;

//Find the sum of all left leaves in a given binary tree.
//
// Example:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
//
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.8 MB,击败了80.43% 的Java用户
  public int sumOfLeftLeaves(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    int sum = 0;
    if (root == null || (root.left == null && root.right == null)) {
      return sum;
    }
    stack.push(root);
    while (!stack.empty()) {
      TreeNode node = stack.pop();
      while (node != null) {
        if (node.right != null && (node.right.left != null || node.right.right != null)) {
          stack.push(node.right);
        }
        if (node.left == null && node.right == null) {
          sum += node.val;
        }
        node = node.left;
      }
    }
    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

