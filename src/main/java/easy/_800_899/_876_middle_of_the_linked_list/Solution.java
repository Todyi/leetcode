package easy._800_899._876_middle_of_the_linked_list;

//Given a non-empty, singly linked list with head node head, return a middle node of linked list.
//
// If there are two middle nodes, return the second middle node.
//
//
//
//
// Example 1:
//
//
//Input: [1,2,3,4,5]
//Output: Node 3 from this list (Serialization: [3,4,5])
//The returned node has value 3.  (The judge's serialization of this node is [3,
//4,5]).
//Note that we returned a ListNode object ans, such that:
//ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next =
// NULL.
//
//
//
// Example 2:
//
//
//Input: [1,2,3,4,5,6]
//Output: Node 4 from this list (Serialization: [4,5,6])
//Since the list has two middle nodes with values 3 and 4, we return the second
//one.
//
//
//
//
// Note:
//
//
// The number of nodes in the given list will be between 1 and 100.
//
//
//
// Related Topics Linked List
// 👍 1484 👎 63

//leetcode submit region begin(Prohibit modification and deletion)

import common.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.6 MB,击败了84.14% 的Java用户
  public ListNode middleNode(ListNode head) {
    List<ListNode> list = new ArrayList<>();
    int len = 0;
    ListNode point = head;
    while (point != null) {
      len++;
      list.add(point);
      point = point.next;
    }

    return list.get(len / 2);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

