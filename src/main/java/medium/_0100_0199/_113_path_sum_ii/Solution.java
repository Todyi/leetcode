package medium._0100_0199._113_path_sum_ii;

//Given a binary tree and a sum, find all root-to-leaf paths
// where each path's sum equals the given sum.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given the below binary tree and sum = 22,
//
//
//      5
//     / \
//    4   8
//   /   / \
//  11  13  4
// /  \    / \
//7    2  5   1
//
//
// Return:
//
//
//[
//   [5,4,11,2],
//   [5,8,4,5]
//]
//
// Related Topics Tree Depth-first Search
// 👍 2403 👎 85

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
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.7 MB,击败了38.85% 的Java用户
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<>();
    pathSum(result, new ArrayList<>(), root, 0, sum);
    return result;
  }

  public void pathSum(List<List<Integer>> result, List<Integer> cur, TreeNode node, int curSum,
      int sum) {
    if (node == null) {
      return;
    }
    curSum += node.val;
    cur.add(node.val);
    if (node.left == null && node.right == null && curSum == sum) {
      result.add(new ArrayList<>(cur));
    }else {
      pathSum(result, cur, node.left, curSum, sum);
      pathSum(result, cur, node.right, curSum, sum);
    }
    cur.remove(cur.size() - 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

