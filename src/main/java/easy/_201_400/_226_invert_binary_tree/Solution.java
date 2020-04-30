package easy._201_400._226_invert_binary_tree;

//Invert a binary tree.
//
// Example:
//
// Input:
//
//
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//
// Output:
//
//
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1
//
// Trivia:
//This problem was inspired by this original tweet by Max Howell:
//
// Google: 90% of our engineers use the software you wrote (Homebrew), but you c
//an’t invert a binary tree on a whiteboard so f*** off.
// Related Topics Tree


//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.1 MB,击败了5.10% 的Java用户
  public TreeNode invertTree(TreeNode root) {
    if (root == null || (root.left == null && root.right == null)){
      return root;
    }
    TreeNode invertLeft = invertTree(root.left);
    TreeNode invertRight = invertTree(root.right);
    root.left = invertRight;
    root.right = invertLeft;
    return root;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

