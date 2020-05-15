package easy._500_599._541_reverse_string_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "abcdefg";
    int k = 2;
    String result = "bacdfeg";
    String solution = new easy._500_599._541_reverse_string_ii.Solution().reverseStr(s, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "abcd";
    int k = 4;
    String result = "dcba";
    String solution = new easy._500_599._541_reverse_string_ii.Solution().reverseStr(s, k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
    int k = 39;
    String result = "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi";
    String solution = new easy._500_599._541_reverse_string_ii.Solution().reverseStr(s, k);
    Assert.assertTrue(result.equals(solution));
  }

}
