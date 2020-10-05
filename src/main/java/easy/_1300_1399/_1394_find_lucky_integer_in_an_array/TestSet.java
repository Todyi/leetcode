package easy._1300_1399._1394_find_lucky_integer_in_an_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {2, 2, 3, 4};
    Integer result = 2;
    int solution = new easy._1300_1399._1394_find_lucky_integer_in_an_array.Solution()
        .findLucky(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2, 2, 3, 3, 3};
    Integer result = 3;
    int solution = new easy._1300_1399._1394_find_lucky_integer_in_an_array.Solution()
        .findLucky(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr = {2, 2, 2, 3, 3};
    Integer result = -1;
    int solution = new easy._1300_1399._1394_find_lucky_integer_in_an_array.Solution()
        .findLucky(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] arr = {5};
    Integer result = -1;
    int solution = new easy._1300_1399._1394_find_lucky_integer_in_an_array.Solution()
        .findLucky(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] arr = {7, 7, 7, 7, 7, 7, 7};
    Integer result = 7;
    int solution = new easy._1300_1399._1394_find_lucky_integer_in_an_array.Solution()
        .findLucky(arr);
    Assert.assertTrue(result.equals(solution));
  }

}
