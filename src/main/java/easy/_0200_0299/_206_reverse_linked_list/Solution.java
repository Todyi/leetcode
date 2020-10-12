package easy._0200_0299._206_reverse_linked_list;

//Reverse a singly linked list.
//
// Example:
//
//
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL
//
//
// Follow up:
//
// A linked list can be reversed either iteratively or recursively. Could you im
//plement both?
// Related Topics Linked List


//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.5 MB,击败了5.04% 的Java用户
  public ListNode reverseList(ListNode head) {
    ListNode pointer = head;
    ListNode tmp;
    ListNode reverse = null;
    while (pointer != null){
      tmp = null;
      if (pointer.next != null){
        tmp = pointer.next;
      }
      pointer.next = reverse;
      reverse = pointer;
      pointer = tmp;
    }
    return reverse;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

