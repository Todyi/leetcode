package easy._700_799._733_flood_fill;


import com.alibaba.fastjson.JSON;
import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int sr = 1, sc = 1, newColor = 2;
    int[][] result = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
    int[][] solution = new easy._700_799._733_flood_fill.Solution()
        .floodFill(image, sr, sc, newColor);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[][] image = {{0, 0, 0}, {0, 1, 1}};
    int sr = 1, sc = 1, newColor = 1;
    int[][] result = {{0, 0, 0}, {0, 1, 1}};
    int[][] solution = new easy._700_799._733_flood_fill.Solution()
        .floodFill(image, sr, sc, newColor);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }


}
