package easy._200_299._203_remove_linked_list_elements;

//Remove all elements from a linked list of integers that have value val.
//
// Example:
//
//
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5
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
  //  执行耗时:1 ms,击败了81.74% 的Java用户
  //  内存消耗:40 MB,击败了100.00% 的Java用户
  public ListNode removeElements(ListNode head, int val) {
    if (head != null) {

      while (head != null && head.val == val) {
        head = head.next;
      }
      ListNode pointer = head;
      while (pointer != null && pointer.next != null) {
        ListNode next = pointer.next;
        if (next != null && next.val == val) {
          pointer.next = next.next;
        } else {
          pointer = pointer.next;
        }
      }
      return head;
    }
    return null;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

