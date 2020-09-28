package easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer;

//Given head which is a reference node to a singly-linked list.
// The value of each node in the linked list is either 0 or 1.
// The linked list holds the binary representation of a number.
//
// Return the decimal value of the number in the linked list.
//
//
// Example 1:
//
//
//Input: head = [1,0,1]
//Output: 5
//Explanation: (101) in base 2 = (5) in base 10
//
//
// Example 2:
//
//
//Input: head = [0]
//Output: 0
//
//
// Example 3:
//
//
//Input: head = [1]
//Output: 1
//
//
// Example 4:
//
//
//Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
//Output: 18880
//
//
// Example 5:
//
//
//Input: head = [0,0]
//Output: 0
//
//
//
// Constraints:
//
//
// The Linked List is not empty.
// Number of nodes will not exceed 30.
// Each node's value is either 0 or 1.
// Related Topics Linked List Bit Manipulation
// 👍 619 👎 47

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
  //  内存消耗:36.4 MB,击败了99.60% 的Java用户
  public int getDecimalValue(ListNode head) {
    int decimal = 0;
    while (head != null) {
      decimal = (decimal << 1) | head.val;
      head = head.next;
    }
    return decimal;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

