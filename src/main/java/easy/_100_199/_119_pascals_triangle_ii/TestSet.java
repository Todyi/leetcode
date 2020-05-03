package easy._100_199._119_pascals_triangle_ii;


import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 3;
    String result = "[1,3,3,1]";
    String solution = JSON.toJSONString(new Solution().getRow(input));
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int input = 5;
    String result = "[1,5,10,10,5,1]";
    String solution = JSON.toJSONString(new Solution().getRow(input));
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int input = 6;
    String result = "[1,6,15,20,15,6,1]";
    String solution = JSON.toJSONString(new Solution().getRow(input));
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int input = 7;
    String result = "[1,7,21,35,35,21,7,1]";
    String solution = JSON.toJSONString(new Solution().getRow(input));
    Assert.assertTrue(result.equals(solution));
  }


}
