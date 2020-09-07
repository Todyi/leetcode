package easy._1000_1099._1018_binary_prefix_divisible_by_5;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] A = {0, 1, 1};
    Boolean[] result = {true, false, false};
    List<Boolean> solution = new easy._1000_1099._1018_binary_prefix_divisible_by_5.Solution()
        .prefixesDivBy5(A);
    Assert.assertTrue(Comparators.isSame(result, solution.toArray(new Boolean[0])));
  }

  @Test
  public void test1() {
    int[] A = {1, 1, 1};
    Boolean[] result = {false, false, false};
    List<Boolean> solution = new easy._1000_1099._1018_binary_prefix_divisible_by_5.Solution()
        .prefixesDivBy5(A);
    Assert.assertTrue(Comparators.isSame(result, solution.toArray(new Boolean[0])));
  }

  @Test
  public void test2() {
    int[] A = {0, 1, 1, 1, 1, 1};
    Boolean[] result = {true, false, false, false, true, false};
    List<Boolean> solution = new easy._1000_1099._1018_binary_prefix_divisible_by_5.Solution()
        .prefixesDivBy5(A);
    Assert.assertTrue(Comparators.isSame(result, solution.toArray(new Boolean[0])));
  }

  @Test
  public void test3() {
    int[] A = {1, 1, 1, 0, 1};
    Boolean[] result = {false, false, false, false, false};
    List<Boolean> solution = new easy._1000_1099._1018_binary_prefix_divisible_by_5.Solution()
        .prefixesDivBy5(A);
    Assert.assertTrue(Comparators.isSame(result, solution.toArray(new Boolean[0])));
  }

  @Test
  public void test4() {
    int[] A = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0,
        0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
    Boolean[] result = {false, false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, true, false, false, true, true, true, true,
        false};
    List<Boolean> solution = new easy._1000_1099._1018_binary_prefix_divisible_by_5.Solution()
        .prefixesDivBy5(A);
    Assert.assertTrue(Comparators.isSame(result, solution.toArray(new Boolean[0])));
  }

  @Test
  public void test5() {
    int[] A = {
        1, 0, 1, 1, 1, 1, 0, 0,
        0, 0, 1, 0, 0, 0, 0, 0,
        1, 0, 0, 1, 1, 1, 1, 1,
        0, 0, 0, 0, 1, 1, 1, 0,
        0, 0, 0, 0, 1, 0, 0, 0,
        1, 0, 0, 1, 1, 1, 1, 1,
        1, 0, 1, 1, 0, 1, 0, 0,
        0, 0, 0, 0, 1, 0, 1, 1,
        1, 0, 0, 1, 0};
    Boolean[] result = {false, false, true, false, false, false, false, false, false, false, true,
        true, true, true, true, true, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, false, false, false, false, false, false, false, false,
        false, false, false, false, false, true, false, false, false, true, false, false, true,
        false, false, true, true, true, true, true, true, true, false, false, true, false, false,
        false, false, true, true};
    List<Boolean> solution = new easy._1000_1099._1018_binary_prefix_divisible_by_5.Solution()
        .prefixesDivBy5(A);
    Assert.assertTrue(Comparators.isSame(result, solution.toArray(new Boolean[0])));
  }

}
