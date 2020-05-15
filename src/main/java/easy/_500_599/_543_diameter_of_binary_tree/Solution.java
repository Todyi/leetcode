package easy._500_599._543_diameter_of_binary_tree;

//
//Given a binary tree, you need to compute the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
// This path may or may not pass through the root.
//
//
//
//Example:
//Given a binary tree
//
//          1
//         / \
//        2   3
//       / \
//      4   5
//
//
//
//Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
//
//
// Note:
//The length of path between two nodes is represented by the number of edges between them.
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.Map;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了14.29% 的Java用户
  public int diameterOfBinaryTree(TreeNode root) {
    int[] diameter = new int[1];
    postOrder(root, diameter);
    return diameter[0];
  }

  public int postOrder(TreeNode node, int[] diameter) {
    if (node == null) {
      return 0;
    }
    int lDepth = postOrder(node.left, diameter);
    int rDepth = postOrder(node.right, diameter);
    diameter[0] = Math.max(diameter[0], lDepth + rDepth);
    return (lDepth < rDepth ? rDepth : lDepth) + 1;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

