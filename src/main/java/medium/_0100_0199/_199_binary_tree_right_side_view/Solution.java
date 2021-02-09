package medium._0100_0199._199_binary_tree_right_side_view;

//Given a binary tree, imagine yourself standing on the right side of it, return
// the values of the nodes you can see ordered from top to bottom. 
//
// Example: 
//
// 
//Input:[1,2,3,null,5,null,4]
//Output:[1, 3, 4]
//Explanation:
//
//   1            <---
// /   \
//2     3         <---
// \     \
//  5     4       <---
// Related Topics Tree Depth-first Search Breadth-first Search Recursion Queue 
// 👍 3479 👎 183

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  untime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Right Side View.
  //  Memory Usage: 37.4 MB, less than 85.86% of Java online submissions for Binary Tree Right Side View.
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new LinkedList<>();
    rightFirst(result, root, 0);
    return result;
  }

  public void rightFirst(List<Integer> result, TreeNode node, int depth) {
    if (node == null) {
      return;
    }
    if (result.size() == depth) {
      result.add(node.val);
    }
    rightFirst(result, node.right, depth + 1);
    rightFirst(result, node.left, depth + 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

