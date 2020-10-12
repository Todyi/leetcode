package easy._0000_0099._083_remove_duplicates_from_sorted_list;/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start

import common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

  //165/165 cases passed (0 ms)
  //Your runtime beats 100 % of java submissions
  //Your memory usage beats 7.14 % of java submissions (39.2 MB)

  public ListNode deleteDuplicates(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode pointer = head;
    ListNode next = pointer.next;
    while (true) {
      if (next == null) {
        pointer.next = null;
        break;
      }
      if (pointer.val != next.val) {
        pointer.next = next;
        pointer = pointer.next;
      }
      next = next.next;
    }

    return head;
  }
}
// @lc code=end

