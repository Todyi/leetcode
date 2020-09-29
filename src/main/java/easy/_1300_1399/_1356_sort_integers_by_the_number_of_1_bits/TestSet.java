package easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    int[] result = {0, 1, 2, 4, 8, 3, 5, 6, 7};
    int[] solution = new easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits.Solution()
        .sortByBits(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    int[] result = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
    int[] solution = new easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits.Solution()
        .sortByBits(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    int[] arr = {10000, 10000};
    int[] result = {10000, 10000};
    int[] solution = new easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits.Solution()
        .sortByBits(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test3() {
    int[] arr = {2, 3, 5, 7, 11, 13, 17, 19};
    int[] result = {2, 3, 5, 17, 7, 11, 13, 19};
    int[] solution = new easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits.Solution()
        .sortByBits(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test4() {
    int[] arr = {10, 100, 1000, 10000};
    int[] result = {10, 100, 10000, 1000};
    int[] solution = new easy._1300_1399._1356_sort_integers_by_the_number_of_1_bits.Solution()
        .sortByBits(arr);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
