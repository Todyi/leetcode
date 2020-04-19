package easy._100_same_tree;/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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

  //57/57 cases passed (1 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 5.75 % of java submissions (39.2 MB)
  public boolean isSameTree(TreeNode p, TreeNode q) {
    List<TreeNode> pQueue = new ArrayList<>();
    pQueue.add(p);
    List<TreeNode> qQueue = new ArrayList<>();
    qQueue.add(q);
    TreeNode pPointer;
    TreeNode qPointer;
    while (0 < pQueue.size()) {
      pPointer = pQueue.get(0);
      qPointer = qQueue.get(0);
      pQueue.remove(0);
      qQueue.remove(0);
      if (pPointer != null && qPointer != null) {
        if (pPointer.val != qPointer.val) {
          return false;
        }
      } else {
        if (pPointer == null && qPointer != null) {
          return false;
        }
        if (pPointer != null && qPointer == null) {
          return false;
        }
      }
      if (pPointer != null && (pPointer.left != null || pPointer.right != null)) {
        pQueue.add(pPointer.left);
        pQueue.add(pPointer.right);
      }
      if (qPointer != null && (qPointer.left != null || qPointer.right != null)) {
        qQueue.add(qPointer.left);
        qQueue.add(qPointer.right);
      }
    }
    if (0 < qQueue.size()) {
      return false;
    }
    return true;
  }

}
// @lc code=end

