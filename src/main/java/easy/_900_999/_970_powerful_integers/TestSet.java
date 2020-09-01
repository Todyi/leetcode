package easy._900_999._970_powerful_integers;


import common.Comparators;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int x, int y, int bound, Integer[] result) {
    List<Integer> solution = new Solution()
        .powerfulIntegers(x, y, bound);
    Integer[] solutionArr = new Integer[solution.size()];
    solution.toArray(solutionArr);
    Arrays.sort(result);
    Arrays.sort(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test0() {
    int x = 2;
    int y = 3;
    int bound = 10;
    Integer[] result = {2, 3, 4, 5, 7, 9, 10};
    assertTrue(x, y, bound, result);
  }

  @Test
  public void test1() {
    int x = 3;
    int y = 5;
    int bound = 15;
    Integer[] result = {2, 4, 6, 8, 10, 14};
    assertTrue(x, y, bound, result);
  }

  @Test
  public void test2() {
    int x = 2;
    int y = 1;
    int bound = 10;
    Integer[] result = {2, 3, 5, 9};
    assertTrue(x, y, bound, result);
  }

  @Test
  public void test3() {
    int x = 1;
    int y = 1;
    int bound = 2;
    Integer[] result = {2};
    assertTrue(x, y, bound, result);
  }

}
