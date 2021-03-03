package medium._0200_0299._222_count_complete_tree_nodes;

//Given the root of a complete binary tree, return the number of the nodes in the tree.
//
// According to Wikipedia, every level, except possibly the last,
// is completely filled in a complete binary tree,
// and all nodes in the last level are as far left as possible.
// It can have between 1 and 2h nodes inclusive at the last level h.
//
//
//
// Example 1:
//
//
//Input: root = [1,2,3,4,5,6]
//Output: 6
//
//
// Example 2:
//
//
//Input: root = []
//Output: 0
//
//
// Example 3:
//
//
//Input: root = [1]
//Output: 1
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 5 * 104].
// 0 <= Node.val <= 5 * 104
// The tree is guaranteed to be complete.
//
//
//
//Follow up: Traversing the tree to count the number of nodes in the tree
// is an easy solution but with O(n) complexity. Could you find a faster algorithm?
// Related Topics Binary Search Tree
// 👍 2742 👎 250

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:41.6 MB,击败了54.63% 的Java用户
  boolean flag = false;
  int lastLevelCount = 0;

  public int countNodes(TreeNode root) {
    int height = height(root);
    lastLevelCount(root, height, 1);
    int result = lastLevelCount;
    height--;
    for (int i = 0; i < height; i++) {
      result += (int) Math.pow(2, i);
    }
    return result;
  }

  public int height(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return height(node.left) + 1;
  }

  public void lastLevelCount(TreeNode node, int height, int curHeight) {
    if (flag) {
      return;
    }
    if (curHeight < height) {
      lastLevelCount(node.left, height, curHeight + 1);
      lastLevelCount(node.right, height, curHeight + 1);
    } else if (height == curHeight) {
      if (node != null) {
        lastLevelCount++;
      } else {
        flag = true;
      }
    }


  }

}
//leetcode submit region end(Prohibit modification and deletion)

