package easy._600_699._661_image_smoother;


import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] M = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    int[][] solution = new easy._600_699._661_image_smoother.Solution()
        .imageSmoother(M);
    Assert.assertTrue(JSON.toJSONString(result).equals(JSON.toJSONString(solution)));
  }

}
