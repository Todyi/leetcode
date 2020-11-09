package medium._0000_0099._061_rotate_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
    int k = 2;
    ListNode result = ListNode.buildList(new Integer[]{4, 5, 1, 2, 3});
    ListNode solution = new medium._0000_0099._061_rotate_list.Solution()
        .rotateRight(head, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{0, 1, 2});
    int k = 4;
    ListNode result = ListNode.buildList(new Integer[]{2, 0, 1});
    ListNode solution = new medium._0000_0099._061_rotate_list.Solution()
        .rotateRight(head, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{1});
    int k = 0;
    ListNode result = ListNode.buildList(new Integer[]{1});
    ListNode solution = new medium._0000_0099._061_rotate_list.Solution()
        .rotateRight(head, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    ListNode head = ListNode.buildList(new Integer[]{});
    int k = 0;
    ListNode result = ListNode.buildList(new Integer[]{});
    ListNode solution = new medium._0000_0099._061_rotate_list.Solution()
        .rotateRight(head, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test4() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2});
    int k = 0;
    ListNode result = ListNode.buildList(new Integer[]{1, 2});
    ListNode solution = new medium._0000_0099._061_rotate_list.Solution()
        .rotateRight(head, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test5() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2});
    int k = 2;
    ListNode result = ListNode.buildList(new Integer[]{1, 2});
    ListNode solution = new medium._0000_0099._061_rotate_list.Solution()
        .rotateRight(head, k);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
