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
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了52.65% 的Java用户
  //  内存消耗:41.4 MB,击败了7.14% 的Java用户
//  public int[] findMode(TreeNode root) {
//    Map<Integer, Integer> map = new HashMap<>();
//    traverse(root, map);
//    int maxTimes = Integer.MIN_VALUE;
//    int maxCount = 0;
//    int[] res = new int[map.size()];
//    for (Integer i : map.keySet()) {
//      int times = map.get(i);
//      if (times < maxTimes) {
//        continue;
//      } else if (maxTimes == times) {
//        res[maxCount++]++;
//      } else {
//        maxTimes = times;
//        maxCount = 0;
//        res[maxCount++] = 1;
//      }
//    }
//    return Arrays.copyOf(res, maxCount);
//  }
//
//  public void traverse(TreeNode node, Map<Integer, Integer> map) {
//    if (node != null) {
//      map.put(node.val, map.getOrDefault(node.val, 0) + 1);
//      traverse(node.left, map);
//      traverse(node.right, map);
//    }
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.8 MB,击败了28.57% 的Java用户
  public int[] findMode(TreeNode root) {
    List<Integer> resList = new ArrayList<>();
    int[] count = new int[2];
    TreeNode[] preNode = new TreeNode[1];
    inOrder(root, preNode, count, resList);

    int[] res = new int[resList.size()];
    int index = 0;
    for (Integer i : resList) {
      res[index++] = i;
    }
    return res;
  }

  //inOrder to count the times of curNode's val occurred
  //Tree{1, 1, 2, 1, null, 2, 2} will be traversed by sequence{1,1,null,1,1,2,2,2}
  //count[0] is the times of curNode's val occurred
  //count[1] is the times of preNode's val occurred
  public void inOrder(TreeNode curNode, TreeNode[] preNode, int[] count, List<Integer> resList) {
    if (curNode == null) {
      return;
    }

    inOrder(curNode.left, preNode, count, resList);

    if (preNode[0] != null && curNode.val == preNode[0].val) {
      count[0]++;
    } else {
      count[0] = 1;
    }

    if (count[1] <= count[0]) {
      if (count[1] < count[0]) {
        resList.clear();
      }
      resList.add(curNode.val);
      count[1] = count[0];
    }

    preNode[0] = curNode;

    inOrder(curNode.right, preNode, count, resList);

  }

}
//leetcode submit region end(Prohibit modification and deletion)

