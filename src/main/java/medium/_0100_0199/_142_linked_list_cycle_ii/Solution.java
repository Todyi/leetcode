package medium._0100_0199._142_linked_list_cycle_ii;

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
// There is a cycle in a linked list if there is some node in the list
// that can be reached again by continuously following the next pointer.
// Internally, pos is used to denote the index of the node
// that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
// Notice that you should not modify the linked list.
//
//
// Example 1:
//
//
//Input: head = [3,2,0,-4], pos = 1
//Output: tail connects to node index 1
//Explanation: There is a cycle in the linked list, where tail connects to the second node.
//
//
// Example 2:
//
//
//Input: head = [1,2], pos = 0
//Output: tail connects to node index 0
//Explanation: There is a cycle in the linked list, where tail connects to the first node.
//
//
// Example 3:
//
//
//Input: head = [1], pos = -1
//Output: no cycle
//Explanation: There is no cycle in the linked list.
//
//
//
// Constraints:
//
//
// The number of the nodes in the list is in the range [0, 10^4].
// -10^5 <= Node.val <= 10^5
// pos is -1 or a valid index in the linked-list.
//
//
//
// Follow up: Can you solve it using O(1) (i.e. constant) memory?
// Related Topics Linked List Two Pointers
// 👍 3672 👎 277

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:41.6 MB,击败了12.67% 的Java用户
  public ListNode detectCycle(ListNode head) {
    // 3->2->0
    //     ↖ |
    //      -4
    //fast:3,2,0,-4,2,0,-4
    //slow:3,  2,   0,  -4
    //let A = no cycle len,B = cycle len,c = cycle step when fast met slow
    //step(fast) = 2step(slow)
    //step(fast) = A + nB + c
    //step(slow) = A + c
    //a+nb+c = 2a+2c => nb = a+c. take A step from c to reach the cycle head node

    ListNode fast = head, slow = head;
    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
      if (fast == null || fast.next == null) {
        return null;
      }
      fast = fast.next;
      if (fast == slow) {
        break;
      }
    }
    fast = head;
    while (fast != slow){
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

