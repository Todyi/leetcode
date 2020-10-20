package medium._0000_0099._024_swap_nodes_in_pairs;

//Given a linked list, swap every two adjacent nodes and return its head.
//
// You may not modify the values in the list's nodes. Only nodes itself may be changed.
//
//
// Example 1:
//
//
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
//
//
// Example 2:
//
//
//Input: head = []
//Output: []
//
//
// Example 3:
//
//
//Input: head = [1]
//Output: [1]
//
//
//
// Constraints:
//
//
// The number of nodes in the list is in the range [0, 100].
// 0 <= Node.val <= 100
//
// Related Topics Linked List
// 👍 2765 👎 183

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
  //  内存消耗:36.5 MB,击败了14.96% 的Java用户
  public ListNode swapPairs(ListNode head) {
    ListNode pointer = head;
    boolean swap = true;
    while (pointer != null) {
      if (pointer.next != null && swap) {
        int tmp = pointer.val;
        pointer.val = pointer.next.val;
        pointer.next.val = tmp;
      }
      swap = !swap;
      pointer = pointer.next;
    }

    return head;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

