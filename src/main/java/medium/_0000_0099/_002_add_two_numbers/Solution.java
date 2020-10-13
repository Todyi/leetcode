package medium._0000_0099._002_add_two_numbers;

//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
//
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
// Example 1:
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//
//
// Example 2:
//
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//
//
// Example 3:
//
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
//
//
//
// Constraints:
//
//
// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading
// zeros.
//
// Related Topics Linked List Math
// 👍 9484 👎 2388

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.1 MB,击败了18.45% 的Java用户
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    addTwoNumbers(l1, l2, 0);
    return l1;
  }

  public void addTwoNumbers(ListNode l1, ListNode l2, int carry) {
    if (carry == 0 && l2 == null) {
      return;
    }
    int tmp = l1.val + (l2 != null ? l2.val : 0) + carry;
    carry = tmp / 10;
    l1.val = tmp % 10;
    if (l1.next == null) {
      if (0 < carry) {
        l1.next = new ListNode(carry);
        carry = 0;
      } else if (l2 != null) {
        l1.next = l2.next;
        l2.next = null;
      }
    }
    addTwoNumbers(l1.next, l2 != null ? l2.next : null, carry);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

