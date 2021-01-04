package medium._0000_0099._098_validate_binary_search_tree;

//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//
// A valid BST is defined as follows:
//
//
// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
//
//
//
// Example 1:
//
//
//Input: root = [2,1,3]
//Output: true
//
//
// Example 2:
//
//
//Input: root = [5,1,4,null,null,3,6]
//Output: false
//Explanation: The root node's value is 5 but its right child's value is 4.
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [1, 104].
// -231 <= Node.val <= 231 - 1
//
// Related Topics Tree Depth-first Search Recursion
// 👍 5201 👎 619

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
  //  内存消耗:38.3 MB,击败了96.03% 的Java用户
  Integer preNum = null;

  public boolean isValidBST(TreeNode root) {
    return inOrder(root);
  }

  public boolean inOrder(TreeNode node) {
    if (node == null) {
      return true;
    }
    if (inOrder(node.left)) {
      if (preNum == null || preNum < node.val) {
        preNum = node.val;
        if (inOrder(node.right)) {
          return true;
        }
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

