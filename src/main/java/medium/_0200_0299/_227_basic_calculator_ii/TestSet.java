package medium._0200_0299._227_basic_calculator_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "3+2*2";
    Integer result = 7;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = " 3/2 ";
    Integer result = 1;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = " 3+5 / 2 ";
    Integer result = 5;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "1+1+1";
    Integer result = 3;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "1*2-3/4+5*6-7*8+9/10";
    Integer result = -24;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String s = "14/3*2";
    Integer result = 8;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String s = "0-2147483647";
    Integer result = -2147483647;
    int solution = new medium._0200_0299._227_basic_calculator_ii.Solution()
        .calculate(s);
    Assert.assertTrue(result.equals(solution));
  }
}
