package easy._0900_0999._965_univalued_binary_tree;

//A binary tree is univalued if every node in the tree has the same value.
//
// Return true if and only if the given tree is univalued.
//
//
//
// Example 1:
//
//
//Input: [1,1,1,1,1,null,1]
//Output: true
//
//
//
// Example 2:
//
//
//Input: [2,2,2,5,2]
//Output: false
//
//
//
//
//
// Note:
//
//
// The number of nodes in the given tree will be in the range [1, 100].
// Each node's value will be an integer in the range [0, 99].
//
// Related Topics Tree
// 👍 592 👎 42

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
  //  内存消耗:36.7 MB,击败了97.91% 的Java用户
  int rootValue = 0;
  boolean isUniValue = true;

  public boolean isUnivalTree(TreeNode root) {
    rootValue = root.val;
    preOrder(root);
    return isUniValue;
  }

  public void preOrder(TreeNode node) {
    if (node == null || !isUniValue) {
      return;
    }
    if (node.val != rootValue) {
      isUniValue = false;
      return;
    }
    preOrder(node.left);
    preOrder(node.right);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

