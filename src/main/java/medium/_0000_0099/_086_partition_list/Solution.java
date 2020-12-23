package medium._0000_0099._086_partition_list;

//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
// You should preserve the original relative order of the nodes in each of the two partitions.
//
// Example:
//
//
//Input: head = 1->4->3->2->5->2, x = 3
//Output: 1->2->2->4->3->5
//
// Related Topics Linked List Two Pointers
// 👍 1697 👎 345

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:38 MB,击败了91.07% 的Java用户
  public ListNode partition(ListNode head, int x) {
    if (head == null) {
      return null;
    }
    ListNode lessPre;
    if (head != null && x <= head.val) {
      lessPre = findLessOrLessPre(head, x);
      if (lessPre.next == null) {
        return head;
      }
      ListNode tmp = head;
      head = lessPre.next;
      lessPre.next = lessPre.next.next;
      head.next = tmp;
    }
    ListNode pointer = head;
    while (pointer.next != null && pointer.next.val < x) {
      pointer = pointer.next;
    }
    while ((lessPre = findLessOrLessPre(pointer, x)).next != null) {
      ListNode tmp = pointer.next;
      pointer.next = lessPre.next;
      lessPre.next = lessPre.next.next;
      pointer.next.next = tmp;
      pointer = pointer.next;
    }
    return head;
  }

  public ListNode findLessOrLessPre(ListNode node, int x) {
    if (node == null) {
      return null;
    }
    ListNode preNode = node;
    node = node.next;
    while (node != null && x <= node.val) {
      preNode = preNode.next;
      node = node.next;
    }
    return preNode;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

