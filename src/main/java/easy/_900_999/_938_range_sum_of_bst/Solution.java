package easy._900_999._938_range_sum_of_bst;

//Given the root node of a binary search tree,
// return the sum of values of all nodes with value between L and R (inclusive).
//
// The binary search tree is guaranteed to have unique values.
//
//
//
//
// Example 1:
//
//
//Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//Output: 32
//
//
//
// Example 2:
//
//
//Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//Output: 23
//
//
//
//
// Note:
//
//
// The number of nodes in the tree is at most 10000.
// The final answer is guaranteed to be less than 2^31.
//
//
// Related Topics Tree Recursion
// 👍 1390 👎 236

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
  //  内存消耗:47.1 MB,击败了87.59% 的Java用户
  public int rangeSumBST(TreeNode root, int L, int R) {
    if (root == null) {
      return 0;
    }
    int sum = 0;
    if (L <= root.val) {
      sum += rangeSumBST(root.left, L, R);
    }
    if (L <= root.val && root.val <= R) {
      sum += root.val;
    }
    if (root.val <= R) {
      sum += rangeSumBST(root.right, L, R);
    }

    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

