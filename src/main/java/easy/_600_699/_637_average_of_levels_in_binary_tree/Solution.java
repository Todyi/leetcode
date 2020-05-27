package easy._600_699._637_average_of_levels_in_binary_tree;

//Given a non-empty binary tree,
// return the average value of the nodes on each level in the form of an array.
//
// Example 1:
//
//Input:
//    3
//   / \
//  9  20
//    /  \
//   15   7
//Output: [3, 14.5, 11]
//Explanation:
//The average value of nodes on level 0 is 3,  on level 1 is 14.5,
// and on level 2 is 11. Hence return [3, 14.5, 11].
//
//
//
// Note:
//
// The range of node's value is in the range of 32-bit signed integer.
//
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
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:41.4 MB,击败了36.00% 的Java用户
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> levelList = new ArrayList<>();
    List<Double> levelCount = new ArrayList<>();
    calAvg(root, 0, levelList, levelCount);
    return levelList;
  }

  public void calAvg(TreeNode node, int level, List<Double> levelList, List<Double> levelCount) {
    if (node == null) {
      return;
    }
    if (levelList.size() <= level) {
      levelList.add(Double.valueOf(node.val));
      levelCount.add(1D);
    } else {
      Double avg = levelList.get(level);
      Double count = levelCount.get(level);
      levelList.set(level, (avg * count + Double.valueOf(node.val)) / (count + 1));
      levelCount.set(level, count + 1);
    }

    calAvg(node.left, level + 1, levelList, levelCount);
    calAvg(node.right, level + 1, levelList, levelCount);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

