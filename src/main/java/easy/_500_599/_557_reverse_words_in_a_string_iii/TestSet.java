package easy._500_599._557_reverse_words_in_a_string_iii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "Let's take LeetCode contest";
    String result = "s'teL ekat edoCteeL tsetnoc";
    String solution = new easy._500_599._557_reverse_words_in_a_string_iii.Solution()
        .reverseWords(s);
    Assert.assertTrue(result.equals(solution));
  }

}
