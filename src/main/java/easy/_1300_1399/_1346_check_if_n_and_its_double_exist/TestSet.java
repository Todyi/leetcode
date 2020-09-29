package easy._1300_1399._1346_check_if_n_and_its_double_exist;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {10, 2, 5, 3};
    Boolean result = true;
    boolean solution = new easy._1300_1399._1346_check_if_n_and_its_double_exist.Solution()
        .checkIfExist(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {7, 1, 14, 11};
    Boolean result = true;
    boolean solution = new easy._1300_1399._1346_check_if_n_and_its_double_exist.Solution()
        .checkIfExist(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr = {3, 1, 7, 11};
    Boolean result = false;
    boolean solution = new easy._1300_1399._1346_check_if_n_and_its_double_exist.Solution()
        .checkIfExist(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] arr = {-778, -481, 842, 495, 44, 1000, -572, 977, 240, -116, 673, 997, -958, -539, -964,
        -187, -701, -928, 472, 965, -672, -88, 443, 36, 388, -127, 115, 704, -549, 1000, 998, 291,
        633, 423, 57, -77, -543, 72, 328, -938, -192, 382, 179};
    Boolean result = true;
    boolean solution = new easy._1300_1399._1346_check_if_n_and_its_double_exist.Solution()
        .checkIfExist(arr);
    Assert.assertTrue(result.equals(solution));
  }


}
