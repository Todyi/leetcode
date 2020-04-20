package easy._101_symmetric_tree;/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 */

// @lc code=start

import common.TreeNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //195/195 cases passed (0 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 40.82 % of java submissions (39 MB)
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (root.left == null && root.right == null) {
      return true;
    }
    if (root.left == null || root.right == null) {
      return false;
    }
    if (root.left.val != root.right.val) {
      return false;
    }
    TreeNode mirror = buildMirror(root);

    return isSameTree(root, mirror);
  }

  public TreeNode buildMirror(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode mirror = new TreeNode(root.val);
    mirror.left = buildMirror(root.right);
    mirror.right = buildMirror(root.left);

    return mirror;
  }

  public boolean isSameTree(TreeNode root, TreeNode mirror) {
    if (root == null && mirror == null) {
      return true;
    }
    if (root == null || mirror == null) {
      return false;
    }
    if (root.val != mirror.val){
      return false;
    }
    return isSameTree(root.left, mirror.left) && isSameTree(root.right, mirror.right);

  }
}
// @lc code=end

