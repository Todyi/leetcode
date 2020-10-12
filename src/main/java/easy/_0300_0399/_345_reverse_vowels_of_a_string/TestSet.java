package easy._0300_0399._345_reverse_vowels_of_a_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "hello";
    String result = "holle";
    String solution = new easy._0300_0399._345_reverse_vowels_of_a_string.Solution().reverseVowels(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "leetcode";
    String result = "leotcede";
    String solution = new easy._0300_0399._345_reverse_vowels_of_a_string.Solution().reverseVowels(s);
    Assert.assertTrue(result.equals(solution));
  }


  @Test
  public void test2() {
    String s = "aA";
    String result = "Aa";
    String solution = new easy._0300_0399._345_reverse_vowels_of_a_string.Solution().reverseVowels(s);
    Assert.assertTrue(result.equals(solution));
  }


}
