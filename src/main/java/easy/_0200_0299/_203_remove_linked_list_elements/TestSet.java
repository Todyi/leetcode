package easy._0200_0299._203_remove_linked_list_elements;


import common.Comparators;
import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode input = ListNode.buildList(new Integer[]{1,2,6,3,4,5,6});
    int val = 6;
    ListNode result = ListNode.buildList(new Integer[]{1,2,3,4,5});
    ListNode resolution = new easy._0200_0299._203_remove_linked_list_elements.Solution().removeElements(input,val);
    Assert.assertTrue(Comparators.isSame(result,resolution));
  }

  @Test
  public void test1() {
    ListNode input = ListNode.buildList(new Integer[]{1,1});
    int val = 1;
    ListNode result = ListNode.buildList(new Integer[]{});
    ListNode resolution = new easy._0200_0299._203_remove_linked_list_elements.Solution().removeElements(input,val);
    Assert.assertTrue(Comparators.isSame(result,resolution));
  }

  @Test
  public void test2() {
    ListNode input = ListNode.buildList(new Integer[]{1,2,2,1});
    int val = 2;
    ListNode result = ListNode.buildList(new Integer[]{1,1});
    ListNode resolution = new easy._0200_0299._203_remove_linked_list_elements.Solution().removeElements(input,val);
    Assert.assertTrue(Comparators.isSame(result,resolution));
  }

}
