package medium._0100_0199._144_binary_tree_preorder_traversal;

//Given the root of a binary tree, return the preorder traversal of its nodes' values.
//
//
// Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [1,2,3]
//
//
// Example 2:
//
//
//Input: root = []
//Output: []
//
//
// Example 3:
//
//
//Input: root = [1]
//Output: [1]
//
//
// Example 4:
//
//
//Input: root = [1,2]
//Output: [1,2]
//
//
// Example 5:
//
//
//Input: root = [1,null,2]
//Output: [1,2]
//
//
//
// Constraints:
//
//
// The number of nodes in the tree is in the range [0, 100].
// -100 <= Node.val <= 100
//
//
//
// Follow up: Recursive solution is trivial, could you do it iteratively?
// Related Topics Stack Tree
// 👍 2008 👎 84

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了10.40% 的Java用户
  //  内存消耗:36.7 MB,击败了99.92% 的Java用户
  public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      while (node != null) {
        result.add(node.val);
        if (node.right != null) {
          stack.push(node.right);
        }
        node = node.left;
      }
    }
    return result;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

