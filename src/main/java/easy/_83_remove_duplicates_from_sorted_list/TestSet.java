package easy._83_remove_duplicates_from_sorted_list;


import common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public ListNode build(int[] array){
    if (array.length == 0) return null;
    ListNode header = new ListNode(array[0]);
    ListNode pointer = header;
    for (int i = 1; i < array.length; i++) {
      pointer.next = new ListNode(array[i]);
      pointer = pointer.next;
    }
    return header;
  }

  public boolean checkEquals(int[] result,ListNode list){
    ListNode pointer = list;
    for (int i = 0; i < result.length; i++) {
      if (result[i] != pointer.val){
        return false;
      }
      pointer = pointer.next;
    }
    if (pointer != null){
      return false;
    }
    return true;
  }

  @Test
  public void test() {
    int[] arr = {1,1,2};
    ListNode x = build(arr);
    int[] result = {1,2};
    Assert.assertTrue(checkEquals(result, new easy._83_remove_duplicates_from_sorted_list.Solution().deleteDuplicates(x)));
  }
  @Test
  public void test1() {
    int[] arr = {1,1,2,3,3};
    ListNode x = build(arr);
    int[] result = {1,2,3};
    Assert.assertTrue(checkEquals(result, new easy._83_remove_duplicates_from_sorted_list.Solution().deleteDuplicates(x)));
  }

  @Test
  public void test2() {
    int[] arr = {};
    ListNode x = build(arr);
    int[] result = {};
    Assert.assertTrue(checkEquals(result, new easy._83_remove_duplicates_from_sorted_list.Solution().deleteDuplicates(x)));
  }
}
