package easy._0600_0699._661_image_smoother;


import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] M = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    int[][] solution = new easy._0600_0699._661_image_smoother.Solution()
        .imageSmoother(M);
    Assert.assertTrue(JSON.toJSONString(result).equals(JSON.toJSONString(solution)));
  }
  
  @Test
  public void test1() {
    int[][] M = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
    int[][] result = {{4,4,5},{5,6,6},{8,9,9},{11,12,12},{13,13,14}};
    int[][] solution = new easy._0600_0699._661_image_smoother.Solution()
        .imageSmoother(M);
    Assert.assertTrue(JSON.toJSONString(result).equals(JSON.toJSONString(solution)));
  }

}
