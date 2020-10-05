package easy._1400_1499._1417_reformat_the_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  private void assertTrue(String result, String s) {
    String solution = new Solution().reformat(s);
    if (result.equals(solution)) {
      Assert.assertTrue(true);
    } else {
      char[] arr = solution.toCharArray();
      boolean preChar = Character.isLetter(arr[0]);
      for (int i = 1; i < arr.length; i++) {
        boolean curChar = Character.isLetter(arr[i]);
        if (preChar == curChar) {
          Assert.fail();
        }
        preChar = curChar;
      }
      Assert.assertTrue(true);
    }
  }

  @Test
  public void test0() {
    String s = "a0b1c2";
    String result = "0a1b2c";
    assertTrue(result, s);
  }

  @Test
  public void test1() {
    String s = "leetcode";
    String result = "";
    assertTrue(result, s);
  }

  @Test
  public void test2() {
    String s = "1229857369";
    String result = "";
    assertTrue(result, s);
  }

  @Test
  public void test3() {
    String s = "covid2019";
    String result = "c2o0v1i9d";
    assertTrue(result, s);
  }

  @Test
  public void test4() {
    String s = "ab123";
    String result = "1a2b3";
    assertTrue(result, s);
  }

}
