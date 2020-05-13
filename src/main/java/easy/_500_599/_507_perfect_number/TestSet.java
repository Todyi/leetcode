package easy._500_599._507_perfect_number;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 28;//1+2+4+7+14
    Boolean result = true;
    boolean solution = new easy._500_599._507_perfect_number.Solution()
        .checkPerfectNumber(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = 1;
    Boolean result = false;
    boolean solution = new easy._500_599._507_perfect_number.Solution()
        .checkPerfectNumber(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 6;//1+2+3
    Boolean result = true;
    boolean solution = new easy._500_599._507_perfect_number.Solution()
        .checkPerfectNumber(num);
    Assert.assertTrue(result.equals(solution));
  }

}
