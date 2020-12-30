package medium._0000_0099._092_reverse_linked_list_ii;

//Reverse a linked list from position m to n. Do it in one-pass.
//
// Note: 1 ≤ m ≤ n ≤ length of list.
//
// Example:
//
//
//Input: 1->2->3->4->5->NULL, m = 2, n = 4
//Output: 1->4->3->2->5->NULL
//
// Related Topics Linked List
// 👍 3107 👎 165

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
  //  内存消耗:36.9 MB,击败了12.88% 的Java用户
  public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode nodeBeforeM, nodeM = head;
    boolean tmpHead = false;

    //find nodeM,nodeBeforeM
    int tmp = m;
    if (m == 1) {
      tmpHead = true;
      nodeBeforeM = new ListNode();
      nodeBeforeM.next = head;
    } else {
      while (2 < tmp) {
        nodeM = nodeM.next;
        tmp--;
      }
      nodeBeforeM = nodeM;
      nodeM = nodeM.next;
    }

    //reverse
    tmp = n - m;
    while (0 < tmp) {
      ListNode tmpNode = nodeBeforeM.next;
      nodeBeforeM.next = nodeM.next;
      nodeM.next = nodeM.next.next;
      nodeBeforeM.next.next = tmpNode;
      tmp--;
    }

    return tmpHead ? nodeBeforeM.next : head;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
