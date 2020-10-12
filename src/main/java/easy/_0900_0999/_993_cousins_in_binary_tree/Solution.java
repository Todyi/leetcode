package easy._0900_0999._993_cousins_in_binary_tree;

//In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
//
// Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
//
// We are given the root of a binary tree with unique values,
// and the values x and y of two different nodes in the tree.
//
// Return true if and only if the nodes corresponding to the values x and y are cousins.
//
//
//
// Example 1:
//
//
//
//Input: root = [1,2,3,4], x = 4, y = 3
//Output: false
//
//
//
// Example 2:
//
//
//
//Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
//Output: true
//
//
//
// Example 3:
//
//
//
//
//Input: root = [1,2,3,null,4], x = 2, y = 3
//Output: false
//
//
//
//
//
// Constraints:
//
//
// The number of nodes in the tree will be between 2 and 100.
// Each node has a unique integer value from 1 to 100.
//
// Related Topics Tree Breadth-first Search
// 👍 980 👎 54

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
  //  内存消耗:39.6 MB,击败了6.26% 的Java用户
  int x, y, xDepth, yDepth;
  TreeNode xParent, yParent;

  public boolean isCousins(TreeNode root, int x, int y) {
    this.x = x;
    this.y = y;
    getDepth(root, null, 0);
    getDepth(root, null, 0);
    return xDepth == yDepth && xParent != yParent;
  }

  public void getDepth(TreeNode node, TreeNode parent, int depth) {
    if (node == null || (xParent != null && yParent != null)) {
      return;
    }
    depth++;
    if (node.val == x || node.val == y) {
      if (node.val == x) {
        xDepth = depth;
        xParent = parent;
      } else {
        yDepth = depth;
        yParent = parent;
      }
    } else {
      getDepth(node.left, node, depth);
      if (xParent == null || yParent == null) {
        getDepth(node.right, node, depth);
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

