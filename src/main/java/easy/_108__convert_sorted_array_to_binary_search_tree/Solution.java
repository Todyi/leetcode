package easy._108__convert_sorted_array_to_binary_search_tree;/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

  //32/32 cases passed (0 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 5.16 % of java submissions (39.7 MB)
  public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length - 1);
  }

  public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
    TreeNode node;
    if (left == right) {
      return new TreeNode(nums[left]);
    }
    if (right - left == 1) {
      node = new TreeNode(nums[right]);
      node.left = new TreeNode(nums[left]);
    } else {
      int mid = (left + right) >> 1;
      node = new TreeNode(nums[mid]);
      node.left = sortedArrayToBST(nums, left, mid - 1);
      node.right = sortedArrayToBST(nums, mid + 1, right);
    }

    return node;
  }
}
// @lc code=end

