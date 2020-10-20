package medium._0000_0099._024_swap_nodes_in_pairs;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4});
    ListNode result = ListNode.buildList(new Integer[]{2, 1, 4, 3});
    ListNode solution = new medium._0000_0099._024_swap_nodes_in_pairs.Solution()
        .swapPairs(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = null;
    ListNode result = null;
    ListNode solution = new medium._0000_0099._024_swap_nodes_in_pairs.Solution()
        .swapPairs(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{1});
    ListNode result = ListNode.buildList(new Integer[]{1});
    ListNode solution = new medium._0000_0099._024_swap_nodes_in_pairs.Solution()
        .swapPairs(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
