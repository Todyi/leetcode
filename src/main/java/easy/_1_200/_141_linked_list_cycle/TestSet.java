package easy._1_200._141_linked_list_cycle;


import static common.ListNode.buildList;

import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Integer[] input = {3,2,0,-4};
    Integer pos = 1;
    Boolean result = true;
    boolean solution = new Solution().hasCycle(buildList(input,pos));
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    Integer[] input = {1,2};
    Integer pos = 0;
    Boolean result = true;
    boolean solution = new Solution().hasCycle(buildList(input,pos));
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test2() {
    Integer[] input = {1};
    Integer pos = -1;
    Boolean result = false;
    boolean solution = new Solution().hasCycle(buildList(input,pos));
    Assert.assertTrue(result.equals(solution));
  }

}
