package easy._1300_1399._1309_decrypt_string_from_alphabet_to_integer_mapping;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "10#11#12";
    String result = "jkab";
    String solution = new easy._1300_1399._1309_decrypt_string_from_alphabet_to_integer_mapping.Solution()
        .freqAlphabets(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "1326#";
    String result = "acz";
    String solution = new easy._1300_1399._1309_decrypt_string_from_alphabet_to_integer_mapping.Solution()
        .freqAlphabets(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "25#";
    String result = "y";
    String solution = new easy._1300_1399._1309_decrypt_string_from_alphabet_to_integer_mapping.Solution()
        .freqAlphabets(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
    String result = "abcdefghijklmnopqrstuvwxyz";
    String solution = new easy._1300_1399._1309_decrypt_string_from_alphabet_to_integer_mapping.Solution()
        .freqAlphabets(s);
    Assert.assertTrue(result.equals(solution));
  }

}
