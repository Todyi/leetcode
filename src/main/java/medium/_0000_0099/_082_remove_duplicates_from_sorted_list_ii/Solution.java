package medium._0000_0099._082_remove_duplicates_from_sorted_list_ii;

//Given a sorted linked list, delete all nodes that have duplicate numbers, leav
//ing only distinct numbers from the original list.
//
// Return the linked list sorted as well.
//
// Example 1:
//
//
//Input: 1->2->3->3->4->4->5
//Output: 1->2->5
//
//
// Example 2:
//
//
//Input: 1->1->1->2->3
//Output: 2->3
//
// Related Topics Linked List
// 👍 2220 👎 116

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
  //  内存消耗:38.2 MB,击败了88.40% 的Java用户
  public ListNode deleteDuplicates(ListNode head) {
    if ((head = findSingleNode(head)) == null) {
      return null;
    }
    ListNode tail = head;
    while (tail.next != null) {
      if ((tail.next = findSingleNode(tail.next)) != null){
        tail = tail.next;
      }
    }
    return head;
  }

  public ListNode findSingleNode(ListNode node) {
    if (node == null) {
      return null;
    }
    if (isSingle(node)) {
      return node;
    }
    ListNode pointer = node.next;
    int curValue = node.val;
    while (pointer != null && pointer.val == curValue) {
      pointer = pointer.next;
    }
    return findSingleNode(pointer);
  }

  public boolean isSingle(ListNode node) {
    if (node != null) {
      return node.next == null || node.val != node.next.val;
    }
    return false;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

