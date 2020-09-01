package easy._900_999._976_largest_perimeter_triangle;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {2, 1, 2};
    Integer result = 5;
    int solution = new easy._900_999._976_largest_perimeter_triangle.Solution()
        .largestPerimeter(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] A = {1, 2, 1};
    Integer result = 0;
    int solution = new easy._900_999._976_largest_perimeter_triangle.Solution()
        .largestPerimeter(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] A = {3, 2, 3, 4};
    Integer result = 10;
    int solution = new easy._900_999._976_largest_perimeter_triangle.Solution()
        .largestPerimeter(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] A = {3, 6, 2, 3};
    Integer result = 8;
    int solution = new easy._900_999._976_largest_perimeter_triangle.Solution()
        .largestPerimeter(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] A = {10, 7, 9, 10, 17, 49, 45, 4, 41, 10, 28, 42, 123, 76, 38, 14, 15, 26, 37, 23, 11, 43,
        3, 19, 11, 19, 8, 42, 47, 26, 37};
    Integer result = 248;
    int solution = new easy._900_999._976_largest_perimeter_triangle.Solution()
        .largestPerimeter(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] A = {3, 4, 15, 2, 9, 4};
    Integer result = 11;
    int solution = new easy._900_999._976_largest_perimeter_triangle.Solution()
        .largestPerimeter(A);
    Assert.assertTrue(result.equals(solution));
  }

}
