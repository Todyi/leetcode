package medium._0100_0199._117_populating_next_right_pointers_in_each_node_ii;

//Given a binary tree
//
//
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//}
//
//
// Populate each next pointer to point to its next right node. If there is no ne
//xt right node, the next pointer should be set to NULL.
//
// Initially, all next pointers are set to NULL.
//
//
//
// Follow up:
//
//
// You may only use constant extra space.
// Recursive approach is fine, you may assume implicit stack space does not coun
//t as extra space for this problem.
//
//
//
// Example 1:
//
//
//
//
//Input: root = [1,2,3,4,5,null,7]
//Output: [1,#,2,3,#,4,5,7,#]
//Explanation: Given the above binary tree (Figure A),
// your function should populate each next pointer to point to its next right node,
// just like in Figure B. The serialized output is in level order as connected by the next pointers,
// with '#' signifying the end of each level.
//
//
//
// Constraints:
//
//
// The number of nodes in the given tree is less than 6000.
// -100 <= node.val <= 100
//
// Related Topics Tree Depth-first Search
// 👍 2172 👎 195

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import common.Node;

class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.9 MB,击败了38.92% 的Java用户
  public Node connect(Node root) {
    Node cur = root;
    while (cur != null) {
      Node head = null, pre = null;
      while (cur != null) {
        if (cur.left != null) {
          if (head == null) {
            head = cur.left;
          }
          if (pre != null) {
            pre.next = cur.left;
          }
          pre = cur.left;
        }
        if (cur.right != null) {
          if (head == null) {
            head = cur.right;
          }
          if (pre != null) {
            pre.next = cur.right;
          }
          pre = cur.right;
        }
        cur = cur.next;
      }
      cur = head;
    }
    return root;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

