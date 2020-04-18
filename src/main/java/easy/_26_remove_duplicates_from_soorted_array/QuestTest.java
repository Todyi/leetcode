package easy._26_remove_duplicates_from_soorted_array;

import com.alibaba.fastjson.JSON;
import java.util.Arrays;
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
  public void test0() {
    int[] nums = {1, 1, 2};
    int[] result = {1, 2};
    Assert.assertEquals(JSON.toJSONString(result),
        JSON.toJSONString(Arrays.copyOf(nums, RemoveDuplicatesFromSortedArray.anotherSolution(nums))));
  }

  @Test
  public void test1() {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int[] result = {0, 1, 2, 3, 4};
    Assert.assertEquals(JSON.toJSONString(result),
        JSON.toJSONString(Arrays.copyOf(nums, RemoveDuplicatesFromSortedArray.anotherSolution(nums))));
  }
}
