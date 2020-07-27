package easy._700_799._728_self_dividing_numbers;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int left = 1;
    int right = 22;
    Integer[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22};
    List<Integer> solution = new easy._700_799._728_self_dividing_numbers.Solution()
        .selfDividingNumbers(left, right);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    int left = 47;
    int right = 85;
    Integer[] result = {48, 55, 66, 77};
    List<Integer> solution = new easy._700_799._728_self_dividing_numbers.Solution()
        .selfDividingNumbers(left, right);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    int left = 66;
    int right = 708;
    Integer[] result = {66, 77, 88, 99, 111, 112, 115, 122, 124, 126, 128, 132, 135, 144, 155, 162,
        168, 175, 184, 212, 216, 222, 224, 244, 248, 264, 288, 312, 315, 324, 333, 336, 366, 384,
        396, 412, 424, 432, 444, 448, 488, 515, 555, 612, 624, 636, 648, 666, 672};
    List<Integer> solution = new easy._700_799._728_self_dividing_numbers.Solution()
        .selfDividingNumbers(left, right);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
