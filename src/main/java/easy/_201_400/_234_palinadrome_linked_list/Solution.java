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

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  //  解答成功:
  //  执行耗时:3 ms,击败了26.91% 的Java用户
  //  内存消耗:43.1 MB,击败了13.42% 的Java用户
//  public boolean isPalindrome(ListNode head) {
//    if (head == null){
//      return true;
//    }
//    Stack<Integer> stack = new Stack<>();
//    ListNode pointer = head;
//
//    while (pointer != null){
//      stack.push(pointer.val);
//      pointer = pointer.next;
//    }
//
//    while (head != null){
//      if (head.val != stack.pop()){
//        return false;
//      }
//      head = head.next;
//    }
//
//    return stack.empty();
//
//  }


  //  解答成功:
  //  执行耗时:1 ms,击败了95.16% 的Java用户
  //  内存消耗:43.4 MB,击败了12.20% 的Java用户
  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    int length = 0;
    ListNode pointer = head;
    while (pointer != null) {
      pointer = pointer.next;
      length++;
    }

    int half = length >> 1;
    ListNode halfNode = head;
    ListNode beforeHalf = null;
    for (int i = 0; i < half; i++) {
      ListNode tmp = new ListNode(halfNode.val);
      tmp.next = beforeHalf;
      beforeHalf = tmp;
      halfNode = halfNode.next;
    }
    if (length % 2 != 0) {
      halfNode = halfNode.next;
    }

    while (halfNode != null) {
      if (halfNode.val != beforeHalf.val) {
        return false;
      }
      halfNode = halfNode.next;
      beforeHalf = beforeHalf.next;
    }

    return true;


  }


}
//leetcode submit region end(Prohibit modification and deletion)

