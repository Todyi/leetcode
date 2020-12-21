package medium._0000_0099._082_remove_duplicates_from_sorted_list_ii;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 3, 4, 4, 5});
    ListNode result = ListNode.buildList(new Integer[]{1, 2, 5});
    ListNode solution = new medium._0000_0099._082_remove_duplicates_from_sorted_list_ii.Solution()
        .deleteDuplicates(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{1, 1, 1, 2, 3});
    ListNode result = ListNode.buildList(new Integer[]{2, 3});
    ListNode solution = new medium._0000_0099._082_remove_duplicates_from_sorted_list_ii.Solution()
        .deleteDuplicates(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 2});
    ListNode result = ListNode.buildList(new Integer[]{1});
    ListNode solution = new medium._0000_0099._082_remove_duplicates_from_sorted_list_ii.Solution()
        .deleteDuplicates(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
