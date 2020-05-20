package easy._600_699._617_merge_two_binary_trees;

//Given two binary trees and imagine
// that when you put one of them to cover the other,
// some nodes of the two trees are overlapped while the others are not.
//
// You need to merge them into a new binary tree.
// The merge rule is that if two nodes overlap,
// then sum node values up as the new value of the merged node.
// Otherwise, the NOT null node will be used as the node of new tree.
//
// Example 1:
//
//
//Input:
//	Tree 1                     Tree 2
//          1                         2
//         / \                       / \
//        3   2                     1   3
//       /                           \   \
//      5                             4   7
//Output:
//Merged tree:
//	     3
//	    / \
//	   4   5
//	  / \   \
//	 5   4   7
//
//
//
//
// Note: The merging process must start from the root nodes of both trees.
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
  //  Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Merge Two Binary Trees.
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 != null) {
      return t2;
    }
    merge(t1, t2);
    return t1;
  }

  public void merge(TreeNode t1, TreeNode t2) {
    if (t1 == null) {
      return;
    }
    if (t2 != null) {
      t1.val += t2.val;
      if (t1.left != null && t2.left != null) {
        merge(t1.left, t2.left);
      } else if (t1.left == null && t2.left != null) {
        t1.left = t2.left;
      }
      if (t1.right != null && t2.right != null) {
        merge(t1.right, t2.right);
      } else if (t1.right == null && t2.right != null) {
        t1.right = t2.right;
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

