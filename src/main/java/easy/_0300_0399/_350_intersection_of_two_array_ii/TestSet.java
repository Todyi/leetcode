package easy._0300_0399._350_intersection_of_two_array_ii;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] num1 = {1, 2, 2, 1};
    int[] num2 = {2, 2};
    int[] result = {2,2};
    int[] solution = new easy._0300_0399._350_intersection_of_two_array_ii.Solution().intersect(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] num1 = {4,9,5};
    int[] num2 = {9,4,9,8,4};
    int[] result = {4,9};
    int[] solution = new easy._0300_0399._350_intersection_of_two_array_ii.Solution().intersect(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    //[-2147483648,1,2,3]
    //[1,-2147483648,-2147483648]
    int[] num1 = {-2147483648,1,2,3};
    int[] num2 = {1,-2147483648,-2147483648};
    int[] result = {1,-2147483648};
    int[] solution = new easy._0300_0399._350_intersection_of_two_array_ii.Solution().intersect(num1, num2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
