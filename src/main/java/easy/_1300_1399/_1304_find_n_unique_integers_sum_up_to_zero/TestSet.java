package easy._1300_1399._1304_find_n_unique_integers_sum_up_to_zero;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(int n) {
    int[] solution = new Solution()
        .sumZero(n);
    Assert.assertTrue(solution.length == n);
    int sum = 0;
    for (int i : solution) {
      sum += i;
    }
    Assert.assertTrue(sum == 0);
  }

  @Test
  public void test0() {
    int n = 5;
    assertTrue(n);
  }

  @Test
  public void test1() {
    int n = 3;
    assertTrue(n);
  }

  @Test
  public void test2() {
    int n = 1;
    assertTrue(n);
  }

}
