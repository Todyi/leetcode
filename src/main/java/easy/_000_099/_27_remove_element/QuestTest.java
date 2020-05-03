package easy._000_099._27_remove_element;

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
  public void test1(){
    int[] nums={3,2,2,3};
    int val = 3;
    int[] result={2,2};
    int[] cal = Arrays.copyOf(nums,RemoveElement.removeElement(nums,val));
    Assert.assertTrue(Arrays.equals(result,cal));
  }
  @Test
  public void test2(){
    int[] nums={0,1,2,2,3,0,4,2};
    int val = 2;
    int[] result={0,1,3,0,4};
    int[] cal = Arrays.copyOf(nums,RemoveElement.removeElement(nums,val));
    Assert.assertTrue(Arrays.equals(result,cal));
  }
  @Test
  public void test93(){
    int[] nums={2};
    int val = 3;
    int[] result={2};
    int[] cal = Arrays.copyOf(nums,RemoveElement.removeElement(nums,val));
    Assert.assertTrue(Arrays.equals(result,cal));
  }
  @Test
  public void test94(){
    int[] nums={3,3};
    int val = 5;
    int[] result={3,3};
    int[] cal = Arrays.copyOf(nums,RemoveElement.removeElement(nums,val));
    Assert.assertTrue(Arrays.equals(result,cal));
  }


}
