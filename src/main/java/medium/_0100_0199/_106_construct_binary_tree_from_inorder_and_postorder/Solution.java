package medium._0100_0199._106_construct_binary_tree_from_inorder_and_postorder;

//Given inorder and postorder traversal of a tree, construct the binary tree. 
//
// Note: 
//You may assume that duplicates do not exist in the tree. 
//
// For example, given 
//
// 
//inorder =[9,3,15,20,7]
//postorder = [9,15,7,20,3] 
//
// Return the following binary tree: 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
// Related Topics Array Tree Depth-first Search 
// 👍 2318 👎 42

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
  //  内存消耗:38.7 MB,击败了89.98% 的Java用户
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    return buildTree(inorder, postorder, new int[]{inorder.length - 1, postorder.length - 1},
        Integer.MAX_VALUE);
  }

  public TreeNode buildTree(int[] inorder, int[] postorder, int[] idx, int parent) {
    if (idx[1] < 0 || inorder[idx[0]] == parent) {
      return null;
    }
    TreeNode root = new TreeNode(postorder[idx[1]--]);
    root.right = buildTree(inorder, postorder, idx, root.val);
    idx[0]--;
    root.left = buildTree(inorder, postorder, idx, parent);
    return root;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

