package easy._0500_0599._566_reshape_the_matrix;


import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] nums = {{1, 2}, {3, 4}};
    int r = 1;
    int c = 4;
    int[][] result = {{1, 2, 3, 4}};
    int[][] solution = new easy._0500_0599._566_reshape_the_matrix.Solution()
        .matrixReshape(nums, r, c);
    System.out.println(JSON.toJSONString(result));
    System.out.println(JSON.toJSONString(solution));
  }

  @Test
  public void test1() {
    int[][] nums = {{1, 2}, {3, 4}};
    int r = 2;
    int c = 4;
    int[][] result = {{1, 2}, {3, 4}};
    int[][] solution = new easy._0500_0599._566_reshape_the_matrix.Solution()
        .matrixReshape(nums, r, c);
    System.out.println(JSON.toJSONString(result));
    System.out.println(JSON.toJSONString(solution));
  }

}
