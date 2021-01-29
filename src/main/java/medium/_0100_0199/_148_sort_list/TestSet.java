package medium._0100_0199._148_sort_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{4, 2, 1, 3});
    ListNode result = ListNode.buildList(new Integer[]{1, 2, 3, 4});
    ListNode solution = new medium._0100_0199._148_sort_list.Solution()
        .sortList(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{-1, 5, 3, 4, 0});
    ListNode result = ListNode.buildList(new Integer[]{-1, 0, 3, 4, 5});
    ListNode solution = new medium._0100_0199._148_sort_list.Solution()
        .sortList(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
