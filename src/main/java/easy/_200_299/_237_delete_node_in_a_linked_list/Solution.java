package easy._200_299._237_delete_node_in_a_linked_list;

//Write a function to delete a node (except the tail) in a singly linked list, g
//iven only access to that node.
//
// Given linked list -- head = [4,5,1,9], which looks like following:
//
//
//
//
//
// Example 1:
//
//
//Input: head = [4,5,1,9], node = 5
//Output: [4,1,9]
//Explanation: You are given the second node with value 5, the linked list shoul
//d become 4 -> 1 -> 9 after calling your function.
//
//
// Example 2:
//
//
//Input: head = [4,5,1,9], node = 1
//Output: [4,5,9]
//Explanation: You are given the third node with value 1, the linked list should
// become 4 -> 5 -> 9 after calling your function.
//
//
//
//
// Note:
//
//
// The linked list will have at least two elements.
// All of the nodes' values will be unique.
// The given node will not be the tail and it will always be a valid node of the
// linked list.
// Do not return anything from your function.
//
// Related Topics Linked List

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38.6 MB,击败了5.09% 的Java用户
  public void deleteNode(ListNode node) {
    ListNode pointer = node;
    ListNode pre = node;
    while (pointer != null) {
      if (pointer.next != null) {
        pointer.val = pointer.next.val;
        pre = pointer;
      }
      pointer = pointer.next;
    }
    pre.next = null;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
