package easy._201_400._234_palinadrome_linked_list;

//Given a singly linked list, determine if it is a palindrome.
//
// Example 1:
//
//
//Input: 1->2
//Output: false
//
// Example 2:
//
//
//Input: 1->2->2->1
//Output: true
//
// Follow up:
//Could you do it in O(n) time and O(1) space?
// Related Topics Linked List Two Pointers


//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;
import java.util.Stack;

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
  //  执行耗时:3 ms,击败了26.91% 的Java用户
  //  内存消耗:43.1 MB,击败了13.42% 的Java用户
  public boolean isPalindrome(ListNode head) {
    if (head == null){
      return true;
    }
    Stack<Integer> stack = new Stack<>();
    ListNode pointer = head;

    while (pointer != null){
      stack.push(pointer.val);
      pointer = pointer.next;
    }

    while (!stack.empty()){
      if (head.val != stack.pop()){
        return false;
      }
      head = head.next;
    }

    return true;

  }


}
//leetcode submit region end(Prohibit modification and deletion)

