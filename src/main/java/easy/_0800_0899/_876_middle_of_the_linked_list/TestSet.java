package easy._0800_0899._876_middle_of_the_linked_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
    ListNode result = ListNode.buildList(new Integer[]{3, 4, 5});
    ListNode solution = new easy._0800_0899._876_middle_of_the_linked_list.Solution()
        .middleNode(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5, 6});
    ListNode result = ListNode.buildList(new Integer[]{4, 5, 6});
    ListNode solution = new easy._0800_0899._876_middle_of_the_linked_list.Solution()
        .middleNode(head);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
