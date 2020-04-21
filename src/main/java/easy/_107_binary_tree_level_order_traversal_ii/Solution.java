package easy._107_binary_tree_level_order_traversal_ii;/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */

// @lc code=start

import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //34/34 cases passed (1 ms)
  //Your runtime beats 81.75 % of java submissions
  //Your memory usage beats 5 % of java submissions (39.9 MB)
  public List<List<Integer>> levelOrderBottom(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();
    if (root != null) {
      List<TreeNode> nextLay = new ArrayList<>();
      nextLay.add(root.left);
      nextLay.add(root.right);
      result = getNextLayResult(nextLay);
      List<Integer> rootSeq = new ArrayList<>();
      rootSeq.add(root.val);
      result.add(rootSeq);
    }
    return result;
  }

  public List<List<Integer>> getNextLayResult(List<TreeNode> thisLay) {
    List<List<Integer>> result;
    List<Integer> laySequence = new ArrayList<>();
    List<TreeNode> nextLay = new ArrayList<>();
    while (0 < thisLay.size()) {
      TreeNode node = thisLay.get(0);
      thisLay.remove(0);
      if (node != null) {
        nextLay.add(node.left);
        nextLay.add(node.right);
        laySequence.add(node.val);
      }
    }
    if (0 < nextLay.size()) {
      result = getNextLayResult(nextLay);
    } else {
      result = new ArrayList<>();
    }
    if (0 < laySequence.size()) {
      result.add(laySequence);
    }
    return result;
  }

}
// @lc code=end

