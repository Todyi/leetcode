package easy._1_200._160_intersection_of_two_linked_lists;

//Write a program to find the node at which the intersection of two singly linke
//d lists begins.
//
// For example, the following two linked lists:
//
//
// begin to intersect at node c1.
//
//
//
// Example 1:
//
//
//
//Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2
//, skipB = 3
//Output: Reference of the node with value = 8
//Input Explanation: The intersected node's value is 8 (note that this must not
//be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. F
//rom the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the inter
//sected node in A; There are 3 nodes before the intersected node in B.
//
//
//
// Example 2:
//
//
//
//Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skip
//B = 1
//Output: Reference of the node with value = 2
//Input Explanation: The intersected node's value is 2 (note that this must not
//be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. F
//rom the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected
// node in A; There are 1 node before the intersected node in B.
//
//
//
//
// Example 3:
//
//
//
//Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
//Output: null
//Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B
//, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be
//0, while skipA and skipB can be arbitrary values.
//Explanation: The two lists do not intersect, so return null.
//
//
//
//
// Notes:
//
//
// If the two linked lists have no intersection at all, return null.
// The linked lists must retain their original structure after the function retu
//rns.
// You may assume there are no cycles anywhere in the entire linked structure.
// Your code should preferably run in O(n) time and use only O(1) memory.
//
// Related Topics Linked List

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; next = null; } }
 */
public class Solution {

  //  解答成功:
  //  执行耗时:825 ms,击败了5.02% 的Java用户
  //  内存消耗:42 MB,击败了5.71% 的Java用户
//  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//    if (headA == null || headB == null) {
//      return null;
//    }
//    while (headA != null) {
//      if (headA.val != 0) {
//        ListNode pointer = headB;
//        while (pointer != null) {
//          if (headA == pointer) {
//            return headA;
//          }
//          pointer = pointer.next;
//        }
//      }
//      headA = headA.next;
//    }
//
//    return null;
//  }

//  解答成功:
//  执行耗时:1 ms,击败了96.71% 的Java用户
//  内存消耗:42.1 MB,击败了5.71% 的Java用户
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int aLength = length(headA);
    int bLength = length(headB);

    int skip = aLength - bLength;
    if (0 < skip) {
      while (0 < skip) {
        headA = headA.next;
        skip--;
      }
    } else {
      while (skip < 0) {
        headB = headB.next;
        skip++;
      }
    }

    while (headA != headB) {
      headA = headA.next;
      headB = headB.next;
    }
    return headA;
  }

  public int length(ListNode node) {
    int length = 0;
    while (node != null) {
      length++;
      node = node.next;
    }
    return length;
  }

}
//leetcode submit region end(Prohibit modification and deletion)
