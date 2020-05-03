package easy._100_199._118_pascals_triangle;


import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 5;
    String result = "[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]";
    String solution = JSON.toJSONString(new Solution().generate(input));
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test1() {
    int input = 6;
    String result = "[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1],[1,5,10,10,5,1]]";
    String solution = JSON.toJSONString(new Solution().generate(input));
    Assert.assertTrue(result.equals(solution));
  }


}
