package easy._0100_0199._167_two_sum_ii;


import static common.ListNode.buildList;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] input = {2,7,11,15};
    int target = 9;
    String result = "[1,2]";
    String solution = JSON.toJSONString(new Solution().twoSum(input,target));
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test1() {
    int[] input = {0,0,3,4};
    int target = 0;
    String result = "[1,2]";
    String solution = JSON.toJSONString(new Solution().twoSum(input,target));
    Assert.assertTrue(result.equals(solution));
  }

}
