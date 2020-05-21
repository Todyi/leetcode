package easy._500_599._589_n_ary_tree_preorder_traversal;

//Given an n-ary tree, return the preorder traversal of its nodes' values.
//
// Nary-Tree input serialization is represented in their level order traversal,
//each group of children is separated by the null value (See examples).
//
//
//
// Follow up:
//
// Recursive solution is trivial, could you do it iteratively?
//
//
// Example 1:
//
//
//
//
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [1,3,5,6,2,4]
//
//
// Example 2:
//
//
//
//
//Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null
//,12,null,13,null,null,14]
//Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
//
//
//
// Constraints:
//
//
// The height of the n-ary tree is less than or equal to 1000
// The total number of nodes is between [0, 10^4]
//
// Related Topics Tree

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import common.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

  //  Runtime: 2 ms, faster than 54.12% of Java online submissions for N-ary Tree Preorder Traversal.
  //  Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
//  public List<Integer> preorder(Node root) {
//    List<Integer> res = new ArrayList<>();
//    Stack<Node> stack = new Stack<>();
//    stack.push(root);
//    while (!stack.isEmpty()) {
//      Node node = stack.pop();
//      while (node != null) {
//        res.add(node.val);
//        if (node.children != null && 0 < node.children.size()) {
//          for (int i = node.children.size() - 1; i > 0; i--) {
//            stack.push(node.children.get(i));
//          }
//          node = node.children.get(0);
//        } else {
//          break;
//        }
//      }
//    }
//    return res;
//  }

  //  Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
  //  Memory Usage: 40.8 MB, less than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
  public List<Integer> preorder(Node root) {
    List<Integer> res = new ArrayList<>();
    preOrder(root, res);
    return res;
  }

  public void preOrder(Node node, List<Integer> list) {
    if (node == null) {
      return;
    }
    list.add(node.val);
    if (node.children != null) {
      for (Node child : node.children) {
        preOrder(child, list);
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

