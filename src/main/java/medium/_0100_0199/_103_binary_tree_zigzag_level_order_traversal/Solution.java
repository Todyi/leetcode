package medium._0100_0199._103_binary_tree_zigzag_level_order_traversal;

//Given a binary tree, return the zigzag level order traversal of its nodes' val
//ues. (ie, from left to right, then right to left for the next level and alternate between).
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
//return its zigzag level order traversal as:
//
//[
//  [3],
//  [20,9],
//  [15,7]
//]
//
// Related Topics Stack Tree Breadth-first Search
// 👍 2912 👎 118

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
  //  内存消耗:39.3 MB,击败了35.86% 的Java用户
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    levelPreOrder(result, 0, root);
    for (int i = 1; i < result.size(); i += 2) {
      reverse(result.get(i));
    }
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

  public void reverse(List<Integer> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
      list.add(list.remove(i));
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

