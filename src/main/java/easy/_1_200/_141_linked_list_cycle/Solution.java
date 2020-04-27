package easy._1_200._141_linked_list_cycle;

//Given a linked list, determine if it has a cycle in it.
//
// To represent a cycle in the given linked list, we use an integer pos which re
//presents the position (0-indexed) in the linked list where tail connects to. If
//pos is -1, then there is no cycle in the linked list.
//
//
//
//
// Example 1:
//
//
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the s
//econd node.
//
//
//
//
//
//
// Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the f
//irst node.
//
//
//
//
//
//
// Example 3:
//
//
//Input: head = [1], pos = -1
//Output: false
//Explanation: There is no cycle in the linked list.
//
//
//
//
//
//
//
// Follow up:
//
// Can you solve it using O(1) (i.e. constant) memory?
// Related Topics Linked List Two Pointers

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了23.36% 的Java用户
  //  内存消耗:39.5 MB,击败了5.71% 的Java用户
//  public boolean hasCycle(ListNode head) {
//    if (head == null) {
//      return false;
//    }
//    ListNode cycleStart = head;
//    int count = 1;
//    while (head.next != null) {
//      if (head.next == cycleStart) {
//        return true;
//      }
//      if (10 < count) {
//        cycleStart = cycleStart.next;
//        count = 1;
//      }
//      head = head.next;
//      count++;
//    }
//    return false;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了5.71% 的Java用户
  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    while (head.next != null) {
      if (head.next == head) {
        return true;
      }
      head = head.next;
      if (head != null && head.next != null) {
        head.next = head.next.next;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

