package medium._0000_0099._099_recover_binary_search_tree;

//You are given the root of a binary search tree (BST),
// where exactly two nodes of the tree were swapped by mistake.
// Recover the tree without changing its structure.
//
// Follow up: A solution using O(n) space is pretty straight forward. Could you
//devise a constant space solution?
//
//
// Example 1:
//
//
//Input: root = [1,3,null,null,2]
//Output: [3,1,null,null,2]
//Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
//
//
// Example 2:
//
//
//Input: root = [3,1,4,null,null,2]
//Output: [2,1,4,null,null,3]
//Explanation: 2 cannot be in the right subtree of 3 because 2 < 3.
// Swapping 2 and 3 makes the BST valid.
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [2, 1000].
// -231 <= Node.val <= 231 - 1
//
// Related Topics Tree Depth-First Search Binary Search Tree Binary Tree
// 👍 2753 👎 105

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了37.79% 的Java用户
  //  内存消耗:44 MB,击败了15.25% 的Java用户
  TreeNode pre = null;
  TreeNode n1 = null;
  TreeNode n2 = null;

  public void recoverTree(TreeNode root) {
    inorder(root);
    swap(n1, n2);
  }

  public void inorder(TreeNode root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    if (pre != null) {
      if (root.val < pre.val) {
        if (n1 == null) {
          n1 = pre;
        }
        n2 = root;
      }
    }
    pre = root;
    inorder(root.right);
  }

  public void swap(TreeNode n1, TreeNode n2) {
    int tmp = n1.val;
    n1.val = n2.val;
    n2.val = tmp;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
