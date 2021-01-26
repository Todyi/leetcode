package medium._0100_0199._142_linked_list_cycle_ii;


import common.ListNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public ListNode[] buildList(Integer[] arr, int pos) {
    ListNode preHead = new ListNode(), pointer = preHead, cycle = null;
    for (int i = 0; i < arr.length; i++) {
      pointer.next = new ListNode(arr[i]);
      pointer = pointer.next;
      if (pos == i) {
        cycle = pointer;
      }
    }
    if (cycle != null) {
      pointer.next = cycle;
    }
    return new ListNode[]{preHead.next, cycle};
  }

  @Test
  public void test0() {
    ListNode[] head = buildList(new Integer[]{3, 2, 0, -4}, 1);
    ListNode result = head[1];
    ListNode solution = new medium._0100_0199._142_linked_list_cycle_ii.Solution()
        .detectCycle(head[0]);
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test1() {
    ListNode[] head = buildList(new Integer[]{1, 2}, 0);
    ListNode result = head[1];
    ListNode solution = new medium._0100_0199._142_linked_list_cycle_ii.Solution()
        .detectCycle(head[0]);
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test2() {
    ListNode[] head = buildList(new Integer[]{1}, -1);
    ListNode result = head[1];
    ListNode solution = new medium._0100_0199._142_linked_list_cycle_ii.Solution()
        .detectCycle(head[0]);
    Assert.assertTrue(result == solution);
  }

  @Test
  public void test3() {
    ListNode[] head = buildList(new Integer[]{1, 2}, -1);
    ListNode result = head[1];
    ListNode solution = new medium._0100_0199._142_linked_list_cycle_ii.Solution()
        .detectCycle(head[0]);
    Assert.assertTrue(result == solution);
  }


}
