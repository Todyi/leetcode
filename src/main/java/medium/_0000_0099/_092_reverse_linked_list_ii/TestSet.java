package medium._0000_0099._092_reverse_linked_list_ii;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
    int m = 2;
    int n = 4;
    ListNode result = ListNode.buildList(new Integer[]{1, 4, 3, 2, 5});
    ListNode solution = new medium._0000_0099._092_reverse_linked_list_ii.Solution()
        .reverseBetween(head, m, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
    int m = 1;
    int n = 5;
    ListNode result = ListNode.buildList(new Integer[]{5, 4, 3, 2, 1});
    ListNode solution = new medium._0000_0099._092_reverse_linked_list_ii.Solution()
        .reverseBetween(head, m, n);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
