package easy._500_599._572_subtree_of_another_tree;

//Given two non-empty binary trees s and t, check whether tree t has exactly the
// same structure and node values with a subtree of s. A subtree of s is a tree co
//nsists of a node in s and all of this node's descendants. The tree s could also
//be considered as a subtree of itself.
//
// Example 1:
//Given tree s:
//
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//
//Given tree t:
//
//
//   4
//  / \
// 1   2
//
//Return true, because t has the same structure and node values with a subtree o
//f s.
//
//
//
// Example 2:
//Given tree s:
//
//
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
//
//Given tree t:
//
//
//   4
//  / \
// 1   2
//
//Return false.
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
  //  执行耗时:1 ms,击败了98.94% 的Java用户
  //  内存消耗:39.8 MB,击败了100.00% 的Java用户
  public boolean isSubtree(TreeNode s, TreeNode t) {
    return postOrder(s, t, countNode(t));
  }

  public boolean postOrder(TreeNode s, TreeNode t, int nodeCount) {
    if (s == null) {
      return false;
    }
    return postOrder(s.left, t, nodeCount) || postOrder(s.right, t, nodeCount) || (s.val == t.val
        && countNode(s) == nodeCount && isSame(s, t));
  }


  public int countNode(TreeNode node) {
    return node == null ? 0 : 1 + countNode(node.left) + countNode(node.right);
  }

  public boolean isSame(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    return p.val == q.val && isSame(p.left, q.left) && isSame(p.right, q.right);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

