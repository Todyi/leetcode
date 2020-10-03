package easy._1300_1399._1385_find_the_distance_value_between_two_arrays;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr1 = {4, 5, 8};
    int[] arr2 = {10, 9, 1, 8};
    int d = 2;
    Integer result = 2;
    int solution = new easy._1300_1399._1385_find_the_distance_value_between_two_arrays.Solution()
        .findTheDistanceValue(arr1, arr2, d);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr1 = {1, 4, 2, 3};
    int[] arr2 = {-4, -3, 6, 10, 20, 30};
    int d = 3;
    Integer result = 2;
    int solution = new easy._1300_1399._1385_find_the_distance_value_between_two_arrays.Solution()
        .findTheDistanceValue(arr1, arr2, d);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr1 = {2, 1, 100, 3};
    int[] arr2 = {-5, -2, 10, -3, 7};
    int d = 6;
    Integer result = 1;
    int solution = new easy._1300_1399._1385_find_the_distance_value_between_two_arrays.Solution()
        .findTheDistanceValue(arr1, arr2, d);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] arr1 = {-3,-3,4,-1,-10};
    int[] arr2 = {7,10};
    int d = 12;
    Integer result = 1;
    int solution = new easy._1300_1399._1385_find_the_distance_value_between_two_arrays.Solution()
        .findTheDistanceValue(arr1, arr2, d);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] arr1 = {4, -3, -7, 0, -10};
    int[] arr2 = {10};
    int d = 69;
    Integer result = 0;
    int solution = new easy._1300_1399._1385_find_the_distance_value_between_two_arrays.Solution()
        .findTheDistanceValue(arr1, arr2, d);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int[] arr1 = {-3,2,-5,7,1};
    int[] arr2 = {4};
    int d = 84;
    Integer result = 0;
    int solution = new easy._1300_1399._1385_find_the_distance_value_between_two_arrays.Solution()
        .findTheDistanceValue(arr1, arr2, d);
    Assert.assertTrue(result.equals(solution));
  }

}
