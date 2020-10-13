package medium._0000_0099._002_add_two_numbers;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode l1 = ListNode.buildList(new Integer[]{2, 4, 3});
    ListNode l2 = ListNode.buildList(new Integer[]{5, 6, 4});
    ListNode result = ListNode.buildList(new Integer[]{7, 0, 8});
    ListNode solution = new medium._0000_0099._002_add_two_numbers.Solution()
        .addTwoNumbers(l1, l2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode l1 = ListNode.buildList(new Integer[]{0});
    ListNode l2 = ListNode.buildList(new Integer[]{0});
    ListNode result = ListNode.buildList(new Integer[]{0});
    ListNode solution = new medium._0000_0099._002_add_two_numbers.Solution()
        .addTwoNumbers(l1, l2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    ListNode l1 = ListNode.buildList(new Integer[]{9, 9, 9, 9, 9, 9, 9});
    ListNode l2 = ListNode.buildList(new Integer[]{9, 9, 9, 9});
    ListNode result = ListNode.buildList(new Integer[]{8, 9, 9, 9, 0, 0, 0, 1});
    ListNode solution = new medium._0000_0099._002_add_two_numbers.Solution()
        .addTwoNumbers(l1, l2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
