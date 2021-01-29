package medium._0100_0199._148_sort_list;

//Given the head of a linked list, return the list after sorting it in ascending
// order.
//
// Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.
//e. constant space)?
//
//
// Example 1:
//
//
//Input: head = [4,2,1,3]
//Output: [1,2,3,4]
//
//
// Example 2:
//
//
//Input: head = [-1,5,3,4,0]
//Output: [-1,0,3,4,5]
//
//
// Example 3:
//
//
//Input: head = []
//Output: []
//
//
//
// Constraints:
//
//
// The number of nodes in the list is in the range [0, 5 * 104].
// -105 <= Node.val <= 105
//
// Related Topics Linked List Sort
// 👍 3814 👎 164

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:43.7 MB,击败了94.96% 的Java用户
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    int preVal = head.val;
    ListNode cur = head.next;
    boolean sorted = true;
    while (cur != null && sorted) {
      sorted = preVal <= cur.val;
      preVal = cur.val;
      cur = cur.next;
    }

    if (sorted) {
      return head;
    }

    ListNode lower = null, higher = null, pivot = head;
    cur = head.next;
    while (cur != null) {
      ListNode tmp = cur.next;
      if (cur.val < pivot.val) {
        cur.next = lower;
        lower = cur;
      } else {
        cur.next = higher;
        higher = cur;
      }
      cur = tmp;
    }

    lower = sortList(lower);
    higher = sortList(higher);
    if (lower == null) {
      head = pivot;
    } else {
      head = lower;
      while (lower.next != null) {
        lower = lower.next;
      }
      lower.next = pivot;
    }
    pivot.next = higher;

    return head;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

