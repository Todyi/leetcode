package easy._201_400._257_binary_tree_paths;

//Given a binary tree, return all root-to-leaf paths.
//
// Note: A leaf is a node with no children.
//
// Example:
//
//
//Input:
//
//   1
// /   \
//2     3
// \
//  5
//
//Output: ["1->2->5", "1->3"]
//
//Explanation: All root-to-leaf paths are: 1->2->5, 1->3
// Related Topics Tree Depth-first Search

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
  //  执行耗时:10 ms,击败了12.42% 的Java用户
  //  内存消耗:39.6 MB,击败了5.55% 的Java用户
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    if (root.left == null && root.right == null) {
      result.add(root.val + "");
    } else {
      List<String> left = binaryTreePaths(root.left);
      for (String s : left) {
        result.add(root.val + "->" + s);
      }
      List<String> right = binaryTreePaths(root.right);
      for (String s : right) {
        result.add(root.val + "->" + s);
      }
    }
    return result;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

