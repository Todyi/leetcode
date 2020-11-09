package medium._0000_0099._061_rotate_list;

//Given a linked list, rotate the list to the right by k places, where k is non-negative.
//
// Example 1:
//
//
//Input: 1->2->3->4->5->NULL, k = 2
//Output: 4->5->1->2->3->NULL
//Explanation:
//rotate 1 steps to the right: 5->1->2->3->4->NULL
//rotate 2 steps to the right: 4->5->1->2->3->NULL
//
//
// Example 2:
//
//
//Input: 0->1->2->NULL, k = 4
//Output: 2->0->1->NULL
//Explanation:
//rotate 1 steps to the right: 2->0->1->NULL
//rotate 2 steps to the right: 1->2->0->NULL
//rotate 3 steps to the right: 0->1->2->NULL
//rotate 4 steps to the right: 2->0->1->NULL
// Related Topics Linked List Two Pointers
// 👍 1803 👎 1081

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
  //  内存消耗:38.2 MB,击败了34.50% 的Java用户
  public ListNode rotateRight(ListNode head, int k) {
    int len = 0;
    ListNode pointer = head;
    ListNode tail = null;
    while (pointer != null) {
      len++;
      if (pointer.next == null) {
        tail = pointer;
      }
      pointer = pointer.next;
    }
    if (len < 2 || (k = len - (k % len)) == len) {
      return head;
    }

    tail.next = head;

    pointer = head;
    while (1 < k) {
      pointer = pointer.next;
      k--;
    }
    head = pointer.next;
    pointer.next = null;
    return head;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

