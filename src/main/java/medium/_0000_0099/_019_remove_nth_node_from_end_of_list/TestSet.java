package medium._0000_0099._019_remove_nth_node_from_end_of_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
    int n = 2;
    ListNode result = ListNode.buildList(new Integer[]{1, 2, 3, 5});
    ListNode solution = new medium._0000_0099._019_remove_nth_node_from_end_of_list.Solution()
        .removeNthFromEnd(head, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{1});
    int n = 1;
    ListNode result = ListNode.buildList(new Integer[]{});
    ListNode solution = new medium._0000_0099._019_remove_nth_node_from_end_of_list.Solution()
        .removeNthFromEnd(head, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2});
    int n = 1;
    ListNode result = ListNode.buildList(new Integer[]{1});
    ListNode solution = new medium._0000_0099._019_remove_nth_node_from_end_of_list.Solution()
        .removeNthFromEnd(head, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2});
    int n = 2;
    ListNode result = ListNode.buildList(new Integer[]{2});
    ListNode solution = new medium._0000_0099._019_remove_nth_node_from_end_of_list.Solution()
        .removeNthFromEnd(head, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
