package medium._0100_0199._116_populating_next_right_pointers_in_each_node;

//You are given a perfect binary tree where all leaves are on the same level, an
//d every parent has two children. The binary tree has the following definition:
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
//Input: root = [1,2,3,4,5,6,7]
//Output: [1,#,2,3,#,4,5,6,7,#]
//Explanation: Given the above perfect binary tree (Figure A),
// your function should populate each next pointer to point to its next right node,
// just like in Figure B. The serialized output is in level order as connected by the next pointers,
// with '#' signifying the end of each level.
//
//
//
// Constraints:
//
//
// The number of nodes in the given tree is less than 4096.
// -1000 <= node.val <= 1000
// Related Topics Tree Depth-first Search Breadth-first Search
// 👍 2887 👎 158

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
  //  内存消耗:39.2 MB,击败了71.43% 的Java用户
  Node[] map = new Node[12];

  public Node connect(Node root) {
    connectPreorder(root, 0);
    return root;
  }

  public void connectPreorder(Node head, int level) {
    if (head == null) {
      return;
    }
    if (map[level] != null) {
      map[level].next = head;
    }
    map[level] = head;
    connectPreorder(head.left, level + 1);
    connectPreorder(head.right, level + 1);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
