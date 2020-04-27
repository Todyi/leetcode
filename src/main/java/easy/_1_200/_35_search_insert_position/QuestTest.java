package easy._1_200._35_search_insert_position;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: leetcode
 * @description:
 * @author: hdy
 * @create: 2019-04-24
 **/

public class QuestTest {

  @Test
  public void test() {
    int[] nums = {1,3,5,6};
    int target = 5;
    int result = 2;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }

  @Test
  public void test1() {
    int[] nums = {1,3,5,6};
    int target = 2;
    int result = 1;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }

  @Test
  public void test2() {
    int[] nums = {1,3,5,6};
    int target = 5;
    int result = 2;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }

  @Test
  public void test3() {
    int[] nums = {1,3,5,6};
    int target = 7;
    int result = 4;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }

  @Test
  public void test4() {
    int[] nums = {1,3,5,6};
    int target = 0;
    int result = 0;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }
  @Test
  public void test53() {
    int[] nums = {1};
    int target = 0;
    int result = 0;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }
  @Test
  public void test54() {
    int[] nums = {1};
    int target = 1;
    int result = 0;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }
  @Test
  public void test55() {
    int[] nums = {1,3};
    int target = 1;
    int result = 0;
    Assert.assertEquals(result, SearchInsertPosition.searchInsert(nums, target));
  }

}
