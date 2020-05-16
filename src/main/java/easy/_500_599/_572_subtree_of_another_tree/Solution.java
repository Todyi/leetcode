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

import com.sun.source.tree.Tree;
import common.TreeNode;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了98.08% 的Java用户
  //  内存消耗:39.9 MB,击败了100.00% 的Java用户
  public boolean isSubtree(TreeNode s, TreeNode t) {
    Stack<TreeNode> stack = new Stack<>();
    findSameNode(s, t.val, stack);

    while (!stack.empty()) {
      TreeNode subTree = stack.pop();
      if (isSame(subTree, t)) {
        return true;
      }
    }
    return false;
  }

  public void findSameNode(TreeNode tree, int value, Stack<TreeNode> stack) {
    if (tree == null) {
      return;
    }
    if (tree.val == value) {
      stack.push(tree);
    }
    findSameNode(tree.left, value, stack);
    findSameNode(tree.right, value, stack);
  }

  public boolean isSame(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val == q.val) {
      return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

