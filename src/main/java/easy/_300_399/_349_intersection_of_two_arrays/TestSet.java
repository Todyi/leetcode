package easy._300_399._349_intersection_of_two_arrays;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] num1 = {1, 2, 2, 1};
    int[] num2 = {2, 2};
    int[] result = {2};
    int[] solution = new easy._300_399._349_intersection_of_two_arrays.Solution()
        .intersection(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] num1 = {4, 9, 5};
    int[] num2 = {9, 4, 9, 8, 4};
    int[] result = {9, 4};
    int[] solution = new easy._300_399._349_intersection_of_two_arrays.Solution()
        .intersection(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] num1 = {61, 24, 20, 58, 95, 53, 17, 32, 45, 85, 70, 20, 83, 62, 35, 89, 5, 95, 12, 86, 58,
        77, 30, 64, 46, 13, 5, 92, 67, 40, 20, 38, 31, 18, 89, 85, 7, 30, 67, 34, 62, 35, 47, 98, 3,
        41, 53, 26, 66, 40, 54, 44, 57, 46, 70, 60, 4, 63, 82, 42, 65, 59, 17, 98, 29, 72, 1, 96,
        82, 66, 98, 6, 92, 31, 43, 81, 88, 60, 10, 55, 66, 82, 0, 79, 11, 81};
    int[] num2 = {5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38,
        85, 34, 16, 6, 99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48};
    int[] result = {9, 4};
    int[] solution = new easy._300_399._349_intersection_of_two_arrays.Solution()
        .intersection(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] num1 = {};
    int[] num2 = {};
    int[] result = {};
    int[] solution = new easy._300_399._349_intersection_of_two_arrays.Solution()
        .intersection(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test4() {
    int[] num1 = {};
    int[] num2 = {1};
    int[] result = {};
    int[] solution = new easy._300_399._349_intersection_of_two_arrays.Solution()
        .intersection(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test5() {
    int[] num1 = {4,7,9,7,6,7};
    int[] num2 = {5,0,0,6,1,6,2,2,4};
    int[] result = {6,4};
    int[] solution = new easy._300_399._349_intersection_of_two_arrays.Solution()
        .intersection(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
