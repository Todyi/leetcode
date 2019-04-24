package merge_two_sorted_lists_21;

/**
 * @program: leetcode
 * @description: 21.merge-two-sorted-lists
 * @author: hdy
 * @create: 2019-04-24
 **/


public class MergeTwoSortedLists {

  public static ListNode findSuitNode(ListNode list, int val) {
    while (list.next != null) {
      if (list.val <= val && list.next.val >= val) {
        return list;
      }
      list = list.next;
    }
    return list;
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }

    if (l1 != null && l2 != null) {
      if (l1.val > l2.val) {
        ListNode exchange = l2;
        l2 = l1;
        l1 = exchange;
      }
    }

    ListNode result = l1;

    while (l2 != null) {
      ListNode tmp = new ListNode(l2.val);
      ListNode suitNode = findSuitNode(result, l2.val);
      if (suitNode.val <= l2.val) {
        tmp.next = suitNode.next;
        suitNode.next = tmp;
      } else {
        tmp.next = suitNode;
        suitNode.next = tmp;
      }
      l2 = l2.next;
    }
    return result;
  }
}
