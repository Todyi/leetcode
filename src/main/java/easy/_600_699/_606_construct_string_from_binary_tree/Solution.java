package easy._600_699._606_construct_string_from_binary_tree;

//You need to construct a string
// consists of parenthesis and integers from a binary tree with the preorder traversing way.
//
// The null node needs to be represented by empty parenthesis pair "()".
// And you need to omit all the empty parenthesis pairs
// that don't affect the one-to-one mapping relationship between the string
// and the original binary tree.
//
// Example 1:
//
//Input: Binary tree: [1,2,3,4]
//       1
//     /   \
//    2     3
//   /
//  4
//
//Output: "1(2(4))(3)"
// Explanation: Originallay it needs to be "1(2(4)())(3()())", but you need to o
//mit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)".
//
//
//
// Example 2:
//
//Input: Binary tree: [1,2,3,null,4]
//       1
//     /   \
//    2     3
//     \
//      4
//
//Output: "1(2()(4))(3)"
// Explanation:
// Almost the same as the first example,
// except we can't omit the first parenthesis pair to break the one-to-one mapping relationship
// between the input and the output.
//
// Related Topics String Tree

//leetcode submit region begin(Prohibit modification and deletion)

import common.TreeNode;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Construct String from Binary Tree.
  //  Memory Usage: 39.2 MB, less than 94.74% of Java online submissions for Construct String from Binary Tree.
  public String tree2str(TreeNode t) {
    StringBuilder sb = new StringBuilder();
    preOrder(t, sb);
    return sb.toString();
  }

  public void preOrder(TreeNode node, StringBuilder sb) {
    if (node == null) {
      return;
    }
    sb.append(node.val);
    if (node.left == null && node.right == null) {
    } else {
      sb.append("(");
      preOrder(node.left, sb);
      sb.append(")");
      if (node.right != null) {
        sb.append("(");
        preOrder(node.right, sb);
        sb.append(")");
      }
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

