package easy._500_599._504_base_7;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 100;
    String result = "202";
    String solution = new easy._500_599._504_base_7.Solution()
        .convertToBase7(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = -7;
    String result = "-10";
    String solution = new easy._500_599._504_base_7.Solution()
        .convertToBase7(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 0;
    String result = "0";
    String solution = new easy._500_599._504_base_7.Solution()
        .convertToBase7(num);
    Assert.assertTrue(result.equals(solution));
  }

}
