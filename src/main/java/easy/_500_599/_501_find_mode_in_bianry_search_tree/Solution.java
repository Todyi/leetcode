package easy._500_599._501_find_mode_in_bianry_search_tree;

//Given a binary search tree (BST) with duplicates, find all the mode(s)
// (the most frequently occurred element) in the given BST.
//
// Assume a BST is defined as follows:
//
//
// The left subtree of a node contains only nodes with keys less than or equal to the node's key.
// The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
// Both the left and right subtrees must also be binary search trees.
//
//
//
//
// For example:
//Given BST [1,null,2,2],
//
//
//   1
//    \
//     2
//    /
//   2
//
//
//
//
// return [2].
//
// Note: If a tree has more than one mode, you can return them in any order.
//
// Follow up: Could you do that without using any extra space?
// (Assume that the implicit stack space incurred due to recursion does not count).
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:5 ms,击败了25.98% 的Java用户
  //  内存消耗:41.6 MB,击败了7.14% 的Java用户
  public int[] findMode(TreeNode root) {
    Map<Integer, Integer> map = new HashMap<>();
    traverse(root, map);
    int maxTimes = Integer.MIN_VALUE;
    List<Integer> res = new ArrayList<>();
    for (Integer i : map.keySet()) {
      int times = map.get(i);
      if (times < maxTimes) {
        continue;
      } else if (maxTimes == times) {
        res.add(i);
      } else {
        maxTimes = times;
        res.clear();
        res.add(i);
      }
    }

    return res.stream().mapToInt(Integer::intValue).toArray();
  }

  public void traverse(TreeNode node, Map<Integer, Integer> map) {
    if (node != null) {
      map.put(node.val, map.getOrDefault(node.val, 0) + 1);
      traverse(node.left, map);
      traverse(node.right, map);
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

