package medium._0100_0199._145_binary_tree_postorder_traversal;

//Given the root of a binary tree, return the postorder traversal of its nodes'
//values.
//
//
// Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [3,2,1]
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
//Output: [2,1]
//
//
//
// Constraints:
//
//
// The number of the nodes in the tree is in the range [0, 100].
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
// Related Topics Stack Tree
// 👍 2327 👎 110

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
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了64.45% 的Java用户
  public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode pre = null, pointer = root;
    while (pointer != null || !stack.isEmpty()) {
      while (pointer != null) {
        stack.push(pointer);
        pointer = pointer.left;
      }
      pointer = stack.pop();
      if (pointer != null) {
        if (pointer.right == null || pointer.right == pre) {
          result.add(pointer.val);
          pre = pointer;
          pointer = null;
        } else {
          stack.push(pointer);
          pointer = pointer.right;
        }
      }
    }

    return result;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

