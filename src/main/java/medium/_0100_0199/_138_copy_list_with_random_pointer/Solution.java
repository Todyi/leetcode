package medium._0100_0199._138_copy_list_with_random_pointer;

//A linked list is given such that each node contains an additional random point
//er which could point to any node in the list or null.
//
// Return a deep copy of the list.
//
// The Linked List is represented in the input/output as a list of n nodes. Each
// node is represented as a pair of [val, random_index] where:
//
//
// val: an integer representing Node.val
// random_index: the index of the node (range from 0 to n-1) where random pointer points to,
// or null if it does not point to any node.
//
//
//
// Example 1:
//
//
//Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
//
//
// Example 2:
//
//
//Input: head = [[1,1],[2,1]]
//Output: [[1,1],[2,1]]
//
//
// Example 3:
//
//
//
//
//Input: head = [[3,null],[3,0],[3,null]]
//Output: [[3,null],[3,0],[3,null]]
//
//
// Example 4:
//
//
//Input: head = []
//Output: []
//Explanation: Given linked list is empty (null pointer), so return null.
//
//
//
// Constraints:
//
//
// -10000 <= Node.val <= 10000
// Node.random is null or pointing to a node in the linked list.
// The number of nodes will not exceed 1000.
//
// Related Topics Hash Table Linked List
// 👍 4426 👎 782

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

import common.Node;
import java.util.HashMap;

class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.6 MB,击败了66.98% 的Java用户
//  public Node copyRandomList(Node head) {
//    if (head == null) {
//      return null;
//    }
//    Node pointer = head, newPointer;
//    while (pointer != null) {
//      Node tmp = new Node(pointer.val);
//      tmp.next = pointer.next;
//      pointer.next = tmp;
//      pointer = pointer.next.next;
//    }
//    Node newHead = head.next;
//
//    pointer = head;
//    while (pointer != null) {
//      if (pointer.random != null) {
//        pointer.next.random = pointer.random.next;
//      }
//      pointer = pointer.next.next;
//    }
//
//    pointer = head;
//    newPointer = head.next;
//    while (pointer != null) {
//      pointer.next = pointer.next.next;
//      if (newPointer.next != null) {
//        newPointer.next = newPointer.next.next;
//      }
//      pointer = pointer.next;
//      newPointer = newPointer.next;
//    }
//    return newHead;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了17.89% 的Java用户
//  HashMap<Node, Node> visitedMap = new HashMap<>();
//
//  public Node copyRandomList(Node head) {
//    if (head == null) {
//      return null;
//    }
//    if (visitedMap.containsKey(head)) {
//      return visitedMap.get(head);
//    }
//    Node newHead = new Node(head.val);
//    visitedMap.put(head, newHead);
//    newHead.next = copyRandomList(head.next);
//    newHead.random = copyRandomList(head.random);
//    return newHead;
//  }


  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.7 MB,击败了66.98% 的Java用户
  HashMap<Node, Node> visitedMap = new HashMap<>();

  public Node getNode(Node oldNode) {
    if (oldNode == null) {
      return null;
    }
    if (visitedMap.containsKey(oldNode)) {
      return visitedMap.get(oldNode);
    }
    Node copy = new Node(oldNode.val);
    visitedMap.put(oldNode, copy);
    return copy;
  }

  public Node copyRandomList(Node head) {
    if (head == null) {
      return null;
    }
    Node newHead = new Node(head.val), pointer = head, copyPointer = newHead;
    visitedMap.put(head, newHead);
    while (pointer != null) {
      copyPointer.random = getNode(pointer.random);
      copyPointer.next = getNode(pointer.next);
      pointer = pointer.next;
      copyPointer = copyPointer.next;
    }
    return newHead;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

