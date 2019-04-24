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

  /**
   * √ Accepted
   * √ 208/208 cases passed (1 ms)
   * √ Your runtime beats 86.3 % of java submissions
   * √ Your memory usage beats 59.58 % of java submissions (40.9 MB)
   */
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

  /**
   * √ Accepted
     √ 208/208 cases passed (0 ms)
     √ Your runtime beats 100 % of java submissions
     √ Your memory usage beats 5.08 % of java submissions (42.2 MB)
   */
  public static ListNode anotherSolution(ListNode l1, ListNode l2) {
    if (l1 == null || l2 == null) {
      return l1 == null ? l2 : l1;
    }
    if (l1.val < l2.val) {
      l1.next = anotherSolution(l1.next, l2);
      return l1;
    } else {
      l2.next = anotherSolution(l1, l2.next);
      return l2;
    }
  }
}
