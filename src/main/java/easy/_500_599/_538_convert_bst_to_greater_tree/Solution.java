package easy._500_599._538_convert_bst_to_greater_tree;

//Given a Binary Search Tree (BST), convert it to a Greater Tree
// such that every key of the original BST is changed to
// the original key plus sum of all keys greater than the original key in BST.
//
// Example:
//
//
//Input: The root of a Binary Search Tree like this:
//              5
//            /   \
//           2     13
//
//Output: The root of a Greater Tree like this:
//             18
//            /   \
//          20     13
//
//
// Note: This question is the same as 1038:
// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
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
  //  执行耗时:1 ms,击败了31.78% 的Java用户
  //  内存消耗:39.6 MB,击败了81.25% 的Java用户
  public TreeNode convertBST(TreeNode root) {
    // value[0]=preNodeSourceValue
    // value[1]=preNodeNewValue
    // value[2]=sum
    Integer[] value = new Integer[3];
    value[2] = 0;
    sum(root, value);
    return root;
  }

  public void sum(TreeNode node, Integer[] value) {
    if (node == null) {
      return;
    }
    sum(node.right, value);

    value[2] += node.val;
    if (value[0] == null) {
      value[0] = node.val;
      value[1] = node.val;
    } else if (value[0] == node.val) {
      node.val = value[1];
    } else {//value[0]!=node.val
      node.val = value[2];
      value[1] = node.val;
    }

    sum(node.left, value);


  }
}
//leetcode submit region end(Prohibit modification and deletion)

