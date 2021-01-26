package medium._0100_0199._143_reorder_list;


import common.Comparators;
import common.ListNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4});
    ListNode result = ListNode.buildList(new Integer[]{1, 4, 2, 3});
    new medium._0100_0199._143_reorder_list.Solution().reorderList(head);
    Assert.assertTrue(Comparators.isSame(result, head));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{1, 2, 3, 4, 5});
    ListNode result = ListNode.buildList(new Integer[]{1, 5, 2, 4, 3});
    new medium._0100_0199._143_reorder_list.Solution().reorderList(head);
    Assert.assertTrue(Comparators.isSame(result, head));
  }
}
