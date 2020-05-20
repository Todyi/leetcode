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

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了75.71% 的Java用户
  //  内存消耗:40.4 MB,击败了31.58% 的Java用户
  public String tree2str(TreeNode t) {
    if (t == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    sb.append(t.val);
    String left = tree2str(t.left);
    String right = tree2str(t.right);
    if (!(left.isEmpty() && right.isEmpty())) {
      sb.append("(").append(left).append(")");
      if (!right.isEmpty()) {
        sb.append("(").append(right).append(")");
      }
    }

    return sb.toString();
  }

}
//leetcode submit region end(Prohibit modification and deletion)

