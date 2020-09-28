package easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer;


import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    ListNode head = ListNode.buildList(new Integer[]{1, 0, 1});
    Integer result = 5;
    int solution = new easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer.Solution()
        .getDecimalValue(head);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    ListNode head = ListNode.buildList(new Integer[]{0});
    Integer result = 0;
    int solution = new easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer.Solution()
        .getDecimalValue(head);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    ListNode head = ListNode.buildList(new Integer[]{1});
    Integer result = 1;
    int solution = new easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer.Solution()
        .getDecimalValue(head);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    ListNode head = ListNode.buildList(new Integer[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0});
    Integer result = 18880;
    int solution = new easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer.Solution()
        .getDecimalValue(head);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    ListNode head = ListNode.buildList(new Integer[]{0, 0});
    Integer result = 0;
    int solution = new easy._1200_1299._1290_convert_binary_number_in_a_linked_listed_to_integer.Solution()
        .getDecimalValue(head);
    Assert.assertTrue(result.equals(solution));
  }

}
