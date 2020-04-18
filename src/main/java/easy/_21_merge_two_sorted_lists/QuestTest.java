package easy._21_merge_two_sorted_lists;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: leetcode
 * @description:
 * @author: hdy
 * @create: 2019-04-24
 **/

public class QuestTest {

  public ListNode buildFromArray(int[] array){
    if (array != null && array.length>0){
      ListNode build = new ListNode(array[0]);
      ListNode point = build;
      for (int i = 1;i<array.length;i++){
        point.next = new ListNode(array[i]);
        point = point.next;
      }
      return build;
    }
    return null;
  }

  @Test
  public void test1() {
    ListNode l1 = buildFromArray(new int[]{1,2,4});
    ListNode l2 = buildFromArray(new int[]{1,3,4});
    ListNode result = buildFromArray(new int[]{1,1,2,3,4,4});
    String resultStr = JSON.toJSONString(result);
    Assert.assertEquals(resultStr, JSON.toJSONString(MergeTwoSortedLists.anotherSolution(l1,l2)));
  }
  @Test
  public void test2() {
    ListNode l1 = buildFromArray(new int[]{});
    ListNode l2 = buildFromArray(new int[]{0});
    ListNode result = buildFromArray(new int[]{0});
    String resultStr = JSON.toJSONString(result);
    Assert.assertEquals(resultStr, JSON.toJSONString(MergeTwoSortedLists.anotherSolution(l1,l2)));
  }
  @Test
  public void test4() {
    ListNode l1 = buildFromArray(new int[]{2});
    ListNode l2 = buildFromArray(new int[]{1});
    ListNode result = buildFromArray(new int[]{1,2});
    String resultStr = JSON.toJSONString(result);
    Assert.assertEquals(resultStr, JSON.toJSONString(MergeTwoSortedLists.anotherSolution(l1,l2)));
  }

}
