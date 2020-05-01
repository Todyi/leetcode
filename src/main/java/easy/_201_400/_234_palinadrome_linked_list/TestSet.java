package easy._201_400._234_palinadrome_linked_list;


import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode input = ListNode.buildList(new Integer[]{1,2});
    Boolean result = false;
    boolean resolution = new easy._201_400._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    ListNode input = ListNode.buildList(new Integer[]{1,2,2,1});
    Boolean result = true;
    boolean resolution = new easy._201_400._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }
}
