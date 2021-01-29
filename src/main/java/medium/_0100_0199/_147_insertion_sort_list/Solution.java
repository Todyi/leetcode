package medium._0100_0199._147_insertion_sort_list;

//Sort a linked list using insertion sort.
//
//
//
//
//
//A graphical example of insertion sort.
// The partial sorted list (black) initially contains only the first element in the list.
//With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list
//
//
//
//
//
// Algorithm of Insertion Sort:
//
//
// Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
// At each iteration, insertion sort removes one element from the input data,
// finds the location it belongs within the sorted list, and inserts it there.
// It repeats until no input elements remain.
//
//
//
//Example 1:
//
//
//Input: 4->2->1->3
//Output: 1->2->3->4
//
//
// Example 2:
//
//
//Input: -1->5->3->4->0
//Output: -1->0->3->4->5
//
// Related Topics Linked List Sort
// 👍 938 👎 666

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.68% 的Java用户
  //  内存消耗:39 MB,击败了21.50% 的Java用户
  public ListNode insertionSortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode mid = insertionSortList(findMid(head));
    head = insertionSortList(head);
    return merge(head, mid);
  }

  public ListNode findMid(ListNode l) {
    if (l == null || l.next == null) {
      return l;
    }
    ListNode midPre = null;
    while (l != null && l.next != null) {
      midPre = midPre == null ? l : midPre.next;
      l = l.next.next;
    }
    ListNode mid = midPre.next;
    midPre.next = null;
    return mid;

  }

  public ListNode merge(ListNode l1, ListNode l2) {
    ListNode tmpHead = new ListNode(), pointer = tmpHead;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        pointer.next = l1;
        l1 = l1.next;
      } else {
        pointer.next = l2;
        l2 = l2.next;
      }
      pointer = pointer.next;
    }
    pointer.next = l1 == null ? l2 : l1;
    return tmpHead.next;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
