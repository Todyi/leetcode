package easy._0700_0799._783_minimum_distance_between_bst_nodes;

//Given a Binary Search Tree (BST) with the root node root,
// return the minimum difference between the values of any two different nodes in the tree.
//
// Example :
//
//
//Input: root = [4,2,6,1,3,null,null]
//Output: 1
//Explanation:
//Note that root is a TreeNode object, not an array.
//
//The given tree [4,2,6,1,3,null,null] is represented by the following diagram:
//
//          4
//        /   \
//      2      6
//     / \
//    1   3
//
//while the minimum difference in this tree is 1, it occurs between node 1 and n
//ode 2, also between node 3 and node 2.
//
//
// Note:
//
//
// The size of the BST will be between 2 and 100.
// The BST is always valid, each node's value is an integer, and each node's value is different.
// This question is the same as 530:
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
//
// Related Topics Tree Recursion
// 👍 691 👎 195

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
  //  内存消耗:37.1 MB,击败了31.43% 的Java用户
  public int minDiffInBST(TreeNode root) {
    //tmp[0]:preValue,tmp[1]:minDiff
    Integer[] tmp = {null, Integer.MAX_VALUE};
    inOrder(root, tmp);
    return tmp[1];
  }

  public void inOrder(TreeNode node, Integer[] tmp) {
    if (node == null) {
      return;
    }
    inOrder(node.left, tmp);

    if (tmp[0] != null) {
      int diff = node.val - tmp[0];
      if (diff < tmp[1]) {
        tmp[1] = diff;
      }
      if (tmp[1] == 1){
        return;
      }
    }
    tmp[0] = node.val;
    inOrder(node.right, tmp);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

