package medium._0200_0299._223_rectangle_area;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2;
    Integer result = 45;
    int solution = new medium._0200_0299._223_rectangle_area.Solution()
        .computeArea(A, B, C, D, E, F, G, H);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int A = -2, B = -2, C = 2, D = 2, E = -1, F = -1, G = 1, H = 1;
    Integer result = 16;
    int solution = new medium._0200_0299._223_rectangle_area.Solution()
        .computeArea(A, B, C, D, E, F, G, H);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int A = -2, B = -2, C = 2, D = 2, E = 1, F = -3, G = 3, H = -1;
    Integer result = 19;
    int solution = new medium._0200_0299._223_rectangle_area.Solution()
        .computeArea(A, B, C, D, E, F, G, H);
    Assert.assertTrue(result.equals(solution));
  }


}
