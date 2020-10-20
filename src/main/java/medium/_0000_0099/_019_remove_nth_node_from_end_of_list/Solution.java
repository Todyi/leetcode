package medium._0000_0099._019_remove_nth_node_from_end_of_list;

//Given the head of a linked list, remove the nth node from the end of the list
//and return its head.
//
// Follow up: Could you do this in one pass?
//
//
// Example 1:
//
//
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//
//
// Example 2:
//
//
//Input: head = [1], n = 1
//Output: []
//
//
// Example 3:
//
//
//Input: head = [1,2], n = 1
//Output: [1]
//
//
//
// Constraints:
//
//
// The number of nodes in the list is sz.
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
// Related Topics Linked List Two Pointers
// 👍 4038 👎 254

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
  //  内存消耗:36.6 MB,击败了11.99% 的Java用户
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null) {
      return null;
    }
    int len = 0;
    ListNode point = head;
    while (point != null) {
      len++;
      point = point.next;
    }
    if (len == 1) {
      return null;
    }
    if (len == n) {
      return head.next;
    }
    point = head;
    int tmp = 0;
    while (len - ++tmp != n) {
      point = point.next;
    }
    point.next = point.next.next;
    return head;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

