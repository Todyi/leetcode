package medium._0100_0199._143_reorder_list;

//Given a singly linked list L: L0→L1→…→Ln-1→Ln,
//reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
//
// You may not modify the values in the list's nodes, only nodes itself may be changed.
//
// Example 1:
//
//
//Given 1->2->3->4, reorder it to 1->4->2->3.
//
// Example 2:
//
//
//Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
//
// Related Topics Linked List
// 👍 2806 👎 140

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;
import java.util.List;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:42.8 MB,击败了21.83% 的Java用户
  public void reorderList(ListNode head) {
    if (head != null && head.next != null) {
      reorder(head, head.next);
    }
  }

  public ListNode reorder(ListNode slow, ListNode fast) {
    //when the fast pointer reach the end, slow points to the preNode of the last half
    //1,2,3,4,5
    //s   f
    //1   2
    //2   4
    //3   null   -> pre = 3
    if (fast == null) {
      return slow;
    }
    if (fast.next == null) {
      return slow.next;
    }

    ListNode pre = reorder(slow.next, fast.next.next);
    ListNode tmp = pre.next;

    pre.next = tmp.next;
    tmp.next = slow.next;
    slow.next = tmp;

    return pre;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

