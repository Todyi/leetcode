package easy._200_299._234_palinadrome_linked_list;


import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode input = ListNode.buildList(new Integer[]{1,2});
    Boolean result = false;
    boolean resolution = new easy._200_299._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    ListNode input = ListNode.buildList(new Integer[]{1,2,2,1});
    Boolean result = true;
    boolean resolution = new easy._200_299._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    ListNode input = ListNode.buildList(new Integer[]{1,0,0});
    Boolean result = false;
    boolean resolution = new easy._200_299._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    ListNode input = ListNode.buildList(new Integer[]{1});
    Boolean result = true;
    boolean resolution = new easy._200_299._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test4() {
    ListNode input = ListNode.buildList(new Integer[]{1,0,1});
    Boolean result = true;
    boolean resolution = new easy._200_299._234_palinadrome_linked_list.Solution().isPalindrome(input);
    Assert.assertTrue(result.equals(resolution));
  }
}
