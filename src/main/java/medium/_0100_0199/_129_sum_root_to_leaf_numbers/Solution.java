package medium._0100_0199._129_sum_root_to_leaf_numbers;

//Given a binary tree containing digits from 0-9 only, each root-to-leaf path co
//uld represent a number.
//
// An example is the root-to-leaf path 1->2->3 which represents the number 123.
//
//
// Find the total sum of all root-to-leaf numbers.
//
// Note: A leaf is a node with no children.
//
// Example:
//
//
//Input: [1,2,3]
//    1
//   / \
//  2   3
//Output: 25
//Explanation:
//The root-to-leaf path 1->2 represents the number 12.
//The root-to-leaf path 1->3 represents the number 13.
//Therefore, sum = 12 + 13 = 25.
//
// Example 2:
//
//
//Input: [4,9,0,5,1]
//    4
//   / \
//  9   0
/// \
//5   1
//Output: 1026
//Explanation:
//The root-to-leaf path 4->9->5 represents the number 495.
//The root-to-leaf path 4->9->1 represents the number 491.
//The root-to-leaf path 4->0 represents the number 40.
//Therefore, sum = 495 + 491 + 40 = 1026.
// Related Topics Tree Depth-first Search
// 👍 1969 👎 52

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
  //  内存消耗:36.3 MB,击败了93.37% 的Java用户
  int sum = 0;

  public int sumNumbers(TreeNode root) {
    depthFirst(root, 0);
    return sum;
  }

  public void depthFirst(TreeNode node, int pre) {
    if (node == null) {
      return;
    }
    pre = pre * 10 + node.val;
    if (node.left == null && node.right == null) {
      sum += pre;
    } else {
      depthFirst(node.left, pre);
      depthFirst(node.right, pre);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

