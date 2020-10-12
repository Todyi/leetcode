package easy._0100_0199._160_intersection_of_two_linked_lists;


import static common.ListNode.buildList;
import static common.ListNode.buildListAppend;

import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] inputA = {0,9,1};
    Integer[] inputB = {3};
    Integer[] intersect = {2,4};
    ListNode result = buildList(intersect);
    ListNode A = buildListAppend(inputA,result);
    ListNode B = buildListAppend(inputB,result);
    ListNode solution = new Solution().getIntersectionNode(A,B);
    Assert.assertTrue(result ==solution);
  }

  @Test
  public void test1() {
    Integer[] inputA = {4,1};
    Integer[] inputB = {5,0,1};
    Integer[] intersect = {8,4,5};
    ListNode result = buildList(intersect);
    ListNode A = buildListAppend(inputA,result);
    ListNode B = buildListAppend(inputB,result);
    ListNode solution = new Solution().getIntersectionNode(A,B);
    Assert.assertTrue(result ==solution);
  }

  @Test
  public void test2() {
    Integer[] inputA = {2,6,4};
    Integer[] inputB = {15};
    Integer[] intersect = {8,4,5};
    ListNode result = null;
    ListNode A = buildListAppend(inputA,result);
    ListNode B = buildListAppend(inputB,result);
    ListNode solution = new Solution().getIntersectionNode(A,B);
    Assert.assertTrue(result == solution);
  }

}
