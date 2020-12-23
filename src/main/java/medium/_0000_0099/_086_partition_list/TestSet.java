package medium._0000_0099._086_partition_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 4, 3, 2, 5, 2});
    int x = 3;
    ListNode result = ListNode.buildList(new Integer[]{1, 2, 2, 4, 3, 5});
    ListNode solution = new medium._0000_0099._086_partition_list.Solution()
        .partition(head, x);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{4, 1, 3, 2, 5, 2});
    int x = 3;
    ListNode result = ListNode.buildList(new Integer[]{1, 2, 2, 4, 3, 5});
    ListNode solution = new medium._0000_0099._086_partition_list.Solution()
        .partition(head, x);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{2, 0, 4, 1, 3, 1, 4, 0, 3});
    int x = 4;
    ListNode result = ListNode.buildList(new Integer[]{2, 0, 1, 3, 1, 0, 3, 4, 4});
    ListNode solution = new medium._0000_0099._086_partition_list.Solution()
        .partition(head, x);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    ListNode head = ListNode.buildList(new Integer[]{});
    int x = 0;
    ListNode result = ListNode.buildList(new Integer[]{});
    ListNode solution = new medium._0000_0099._086_partition_list.Solution()
        .partition(head, x);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
