package easy._201_400._202_happy_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 19;
    Boolean result = true;
    boolean resolution = new easy._201_400._202_happy_number.Solution().isHappy(input);
    Assert.assertTrue(result.equals(resolution));
  }
  @Test
  public void test1() {
    int input = 1;
    Boolean result = true;
    boolean resolution = new easy._201_400._202_happy_number.Solution().isHappy(input);
    Assert.assertTrue(result.equals(resolution));
  }
  @Test
  public void test2() {
    int input = 2;
    Boolean result = false;
    boolean resolution = new easy._201_400._202_happy_number.Solution().isHappy(input);
    Assert.assertTrue(result.equals(resolution));
  }

}
