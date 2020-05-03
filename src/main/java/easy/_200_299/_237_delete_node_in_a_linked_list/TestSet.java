package easy._200_299._237_delete_node_in_a_linked_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode input = ListNode.buildList(new Integer[]{4,5,1,9});
    ListNode result = ListNode.buildList(new Integer[]{4,1,9});
    new easy._200_299._237_delete_node_in_a_linked_list.Solution().deleteNode(input.next);
    Assert.assertTrue(Comparators.isSame(result,input));
  }

  @Test
  public void test1() {
    ListNode input = ListNode.buildList(new Integer[]{4,5,1,9});
    ListNode result = ListNode.buildList(new Integer[]{4,5,9});
    new easy._200_299._237_delete_node_in_a_linked_list.Solution().deleteNode(input.next.next);
    Assert.assertTrue(Comparators.isSame(result,input));
  }
}
