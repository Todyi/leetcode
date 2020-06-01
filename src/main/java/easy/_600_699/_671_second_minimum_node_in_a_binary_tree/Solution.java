package easy._600_699._671_second_minimum_node_in_a_binary_tree;

//Given a non-empty special binary tree consisting of nodes with the non-negative value,
// where each node in this tree has exactly two or zero sub-node.
// If the node has two sub-nodes,
// then this node's value is the smaller value among its two sub-nodes.
// More formally, the property root.val = min(root.left.val, root.right.val) always holds.
//
// Given such a binary tree,
// you need to output the second minimum value
// in the set made of all the nodes' value in the whole tree.
//
// If no such second minimum value exists, output -1 instead.
//
// Example 1:
//
//
//Input:
//    2
//   / \
//  2   5
//     / \
//    5   7
//
//Output: 5
//Explanation: The smallest value is 2, the second smallest value is 5.
//
//
//
//
// Example 2:
//
//
//Input:
//    2
//   / \
//  2   2
//
//Output: -1
//Explanation: The smallest value is 2, but there isn't any second smallest value.
//
//
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
  //  内存消耗:36.8 MB,击败了5.26% 的Java用户
  public int findSecondMinimumValue(TreeNode root) {
    long[] secondMin = new long[1];
    secondMin[0] = Long.MAX_VALUE;
    findSecondMinimumValue(root, secondMin);
    return secondMin[0] == Long.MAX_VALUE ? -1 : (int) secondMin[0];
  }

  public void findSecondMinimumValue(TreeNode tree, long[] secondMin) {
    if (tree == null || tree.left == null) {
      return;
    }
    if (tree.left.val != tree.right.val) {
      secondMin[0] = Math.min(secondMin[0], Math.max(tree.left.val, tree.right.val));
    }
    if (tree.left.val == tree.val) {
      findSecondMinimumValue(tree.left, secondMin);
    }
    if (tree.right.val == tree.val) {
      findSecondMinimumValue(tree.right, secondMin);
    }

  }
}
//leetcode submit region end(Prohibit modification and deletion)

