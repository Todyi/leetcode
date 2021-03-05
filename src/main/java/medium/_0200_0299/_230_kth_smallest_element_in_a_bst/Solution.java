package medium._0200_0299._230_kth_smallest_element_in_a_bst;

//Given the root of a binary search tree, and an integer k, return the kth (1-in
//dexed) smallest element in the tree.
//
//
// Example 1:
//
//
//Input: root = [3,1,4,null,2], k = 1
//Output: 1
//
//
// Example 2:
//
//
//Input: root = [5,3,6,2,4,null,null,1], k = 3
//Output: 3
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is n.
// 1 <= k <= n <= 104
// 0 <= Node.val <= 104
//
//
//
//Follow up: If the BST is modified often (i.e., we can do insert and delete operations)
// and you need to find the kth smallest frequently, how would you optimize?
// Related Topics Binary Search Tree
// 👍 3567 👎 82

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
  //  内存消耗:38.5 MB,击败了96.20% 的Java用户
  int k;

  public int kthSmallest(TreeNode root, int k) {
    this.k = k;
    return inorder(root);
  }

  public int inorder(TreeNode node) {
    if (node == null) {
      return -1;
    }
    int left = inorder(node.left);
    if (k == 0) {
      return left;
    }
    if (--k == 0) {
      return node.val;
    }
    return inorder(node.right);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

