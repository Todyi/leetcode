package easy._0700_0799._700_search_in_a_binary_search_tree;

//Given the root node of a binary search tree (BST) and a value.
// You need to find the node in the BST that the node's value equals the given value.
// Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
//
// For example,
//
//
//Given the tree:
//        4
//       / \
//      2   7
//     / \
//    1   3
//
//And the value to search: 2
//
//
// You should return this subtree:
//
//
//      2
//     / \
//    1   3
//
//
// In the example above, if we want to search the value 5, since there is no node with value 5,
// we should return NULL.
//
// Note that an empty tree is represented by NULL,
// therefore you would see the expected output (serialized tree format) as [], not null.
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
  //  内存消耗:40.3 MB,击败了22.58% 的Java用户
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }
    if (root.val == val) {
      return root;
    }
    if (root.val < val) {
      return searchBST(root.right, val);
    } else {
      return searchBST(root.left, val);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

