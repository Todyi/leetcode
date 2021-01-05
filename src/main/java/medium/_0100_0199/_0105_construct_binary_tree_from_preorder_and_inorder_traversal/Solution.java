package medium._0100_0199._0105_construct_binary_tree_from_preorder_and_inorder_traversal;

//Given preorder and inorder traversal of a tree, construct the binary tree. 
//
// Note: 
//You may assume that duplicates do not exist in the tree. 
//
// For example, given 
//
// 
//preorder =[3,9,20,15,7]
//inorder = [9,3,15,20,7] 
//
// Return the following binary tree: 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7 
// Related Topics Array Tree Depth-first Search 
// 👍 4467 👎 114

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了97.97% 的Java用户
  //  内存消耗:38.8 MB,击败了88.98% 的Java用户
//  HashMap<Integer, Integer> map = new HashMap<>();
//  int idx = 0;
//
//  public TreeNode buildTree(int[] preorder, int[] inorder) {
//    for (int i = 0; i < inorder.length; i++) {
//      map.put(inorder[i], i);
//    }
//    return buildTree(preorder, 0, inorder.length - 1);
//  }
//
//  public TreeNode buildTree(int[] preOrder, int inStart, int inEnd) {
//    if (inEnd < inStart) {
//      return null;
//    }
//    TreeNode root = new TreeNode(preOrder[idx++]);
//    int mid = map.get(root.val);
//    root.left = buildTree(preOrder, inStart, mid - 1);
//    root.right = buildTree(preOrder, mid + 1, inEnd);
//    return root;
//  }


  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.8 MB,击败了79.53% 的Java用户
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return buildTree(preorder, inorder, new int[]{0, 0}, Integer.MAX_VALUE);
  }

  //idx[0] current preorderIdx,idx[1] current inorderIdx
  public TreeNode buildTree(int[] preorder, int[] inorder, int[] idx, int parent) {
    if (preorder.length == idx[0] || inorder[idx[1]] == parent) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[idx[0]++]);
    root.left = buildTree(preorder, inorder, idx, root.val);
    idx[1]++;
    root.right = buildTree(preorder, inorder, idx, parent);
    return root;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
