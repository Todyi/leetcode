package easy._1100_1199._1122_relative_sort_array;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr2 = {2, 1, 4, 3, 9, 6};
    int[] result = {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
    int[] solution = new easy._1100_1199._1122_relative_sort_array.Solution()
        .relativeSortArray(arr1, arr2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] arr1 = {28, 6, 22, 8, 44, 17};
    int[] arr2 = {22, 28, 8, 6};
    int[] result = {22, 28, 8, 6, 17, 44};
    int[] solution = new easy._1100_1199._1122_relative_sort_array.Solution()
        .relativeSortArray(arr1, arr2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] arr1 = {26, 21, 11, 20, 50, 34, 1, 18};
    int[] arr2 = {21, 11, 26, 20};
    int[] result = {21, 11, 26, 20, 1, 18, 34, 50};
    int[] solution = new easy._1100_1199._1122_relative_sort_array.Solution()
        .relativeSortArray(arr1, arr2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] arr1 = {943, 790, 427, 722, 860, 550, 225, 846, 715, 320};
    int[] arr2 = {943, 715, 427, 790, 860, 722, 225, 320, 846, 550};
    int[] result = {943, 715, 427, 790, 860, 722, 225, 320, 846, 550};
    int[] solution = new easy._1100_1199._1122_relative_sort_array.Solution()
        .relativeSortArray(arr1, arr2);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
