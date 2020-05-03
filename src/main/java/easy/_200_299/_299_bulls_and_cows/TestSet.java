package easy._200_299._299_bulls_and_cows;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String secret = "1807";
    String guess = "7810";
    String result = "1A3B";
    String resolution = new easy._200_299._299_bulls_and_cows.Solution().getHint(secret,guess);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test1() {
    String secret = "1123";
    String guess = "0111";
    String result = "1A1B";
    String resolution = new easy._200_299._299_bulls_and_cows.Solution().getHint(secret,guess);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test2() {
    String secret = "1";
    String guess = "0";
    String result = "0A0B";
    String resolution = new easy._200_299._299_bulls_and_cows.Solution().getHint(secret,guess);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test3() {
    String secret = "1122";
    String guess = "2211";
    String result = "0A4B";
    String resolution = new easy._200_299._299_bulls_and_cows.Solution().getHint(secret,guess);
    Assert.assertTrue(result.equals(resolution));
  }

  @Test
  public void test4() {
    String secret = "1122";
    String guess = "3456";
    String result = "0A0B";
    String resolution = new easy._200_299._299_bulls_and_cows.Solution().getHint(secret,guess);
    Assert.assertTrue(result.equals(resolution));
  }


}
