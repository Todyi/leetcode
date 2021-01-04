package medium._0000_0099._094_binary_tree_inorder_traversal;

//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//
//
// Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [1,3,2]
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
//Output: [2,1]
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
//
// Follow up:
//
// Recursive solution is trivial, could you do it iteratively?
//
//
// Related Topics Hash Table Stack Tree
// 👍 4069 👎 176

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了95.82% 的Java用户
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    deep(stack, root);
    while (!stack.empty()) {
      TreeNode cur = stack.pop();
      result.add(cur.val);
      deep(stack, cur.right);
    }
    return result;
  }

  public void deep(Stack<TreeNode> stack, TreeNode cur) {
    while (cur != null) {
      stack.push(cur);
      if (cur.left == null) {
        break;
      }
      cur = cur.left;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

