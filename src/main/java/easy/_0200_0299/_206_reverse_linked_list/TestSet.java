package easy._0200_0299._206_reverse_linked_list;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode input = ListNode.buildList(new Integer[]{1,2,3,4,5});
    ListNode result = ListNode.buildList(new Integer[]{5,4,3,2,1});
    ListNode resolution = new easy._0200_0299._206_reverse_linked_list.Solution().reverseList(input);
    Assert.assertTrue(Comparators.isSame(result,resolution));
  }
}
