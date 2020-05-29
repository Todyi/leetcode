package easy._600_699._653_two_sum_iv_input_is_a_bst;

//Given a Binary Search Tree and a target number,
// return true if there exist two elements in the BST
// such that their sum is equal to the given target.
//
// Example 1:
//
//
//Input:
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 9
//
//Output: True
//
//
//
//
// Example 2:
//
//
//Input:
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 28
//
//Output: False
//
//
//
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了94.72% 的Java用户
  //  内存消耗:41.1 MB,击败了76.79% 的Java用户
  public boolean findTarget(TreeNode root, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    return preorder(root, map, k);
  }

  public boolean preorder(TreeNode node, Map<Integer, Integer> map, int k) {
    if (node == null) {
      return false;
    }
    if (map.get(k - node.val) != null) {
      return true;
    }
    map.put(node.val, 1);

    return preorder(node.left, map, k) || preorder(node.right, map, k);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

