package medium._0100_0199._114_flatten_binary_tree_to_linked_list;

//Given a binary tree, flatten it to a linked list in-place.
//
// For example, given the following tree:
//
//
//    1
//   / \
//  2   5
// / \   \
//3   4   6
//
//
// The flattened tree should look like:
//
//
//1
// \
//  2
//   \
//    3
//     \
//      4
//       \
//        5
//         \
//          6
//
// Related Topics Tree Depth-first Search
// 👍 3673 👎 385

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
  //  内存消耗:38.4 MB,击败了58.99% 的Java用户
  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }
    flat(root, null);
  }

  public TreeNode flat(TreeNode root, TreeNode parent) {
    if (root == null) {
      return parent;
    }
    parent = root;
    TreeNode tmpL = root.left, tmpR = root.right;
    if (root.left != null) {
      root.left = null;
      root.right = tmpL;
      TreeNode lastNode = flat(tmpL, parent);
      lastNode.right = tmpR;
      parent = lastNode;
    }
    return flat(tmpR, parent);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

