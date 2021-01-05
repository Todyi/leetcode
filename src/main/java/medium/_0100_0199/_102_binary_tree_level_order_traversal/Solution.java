package medium._0100_0199._102_binary_tree_level_order_traversal;

//Given a binary tree, return the level order traversal of its nodes' values.
// (ie, from left to right, level by level).
//
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//
//
//return its level order traversal as:
//
//[
//  [3],
//  [9,20],
//  [15,7]
//]
//
// Related Topics Tree Breadth-first Search
// 👍 3958 👎 96

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.3 MB,击败了55.63% 的Java用户
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    levelPreOrder(result, 0, root);
    return result;
  }

  public void levelPreOrder(List<List<Integer>> result, int level, TreeNode node) {
    if (node == null) {
      return;
    }
    List<Integer> levelList;
    if (level < result.size()) {
      levelList = result.get(level);
    } else {
      levelList = new ArrayList<>();
      result.add(levelList);
    }
    levelList.add(node.val);
    levelPreOrder(result, level + 1, node.left);
    levelPreOrder(result, level + 1, node.right);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

