package easy._800_899._832_filpping_an_image;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int[][] A, int[][] result) {
    int[][] solution = new easy._800_899._832_filpping_an_image.Solution().flipAndInvertImage(A);
    for (int i = 0; i < result.length; i++) {
      Assert.assertTrue(Comparators.isSame(result[i], solution[i]));
    }
  }

  @Test
  public void test0() {
    int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
    int[][] result = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
    assertTrue(A, result);
  }
  
  @Test
  public void test1() {
    int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
    int[][] result = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
    assertTrue(A, result);
  }


}
