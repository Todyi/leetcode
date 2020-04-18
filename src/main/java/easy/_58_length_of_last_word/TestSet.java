package easy._58_length_of_last_word;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test() {
    String i = "Hello World";
    int result = 5;
    Assert.assertEquals(result, new easy._58_length_of_last_word.Solution().lengthOfLastWord(i));
  }

  @Test
  public void test1() {
    String i = "a ";
    int result = 1;
    Assert.assertEquals(result, new easy._58_length_of_last_word.Solution().lengthOfLastWord(i));
  }

  @Test
  public void test2() {
    String i = "";
    int result = 0;
    Assert.assertEquals(result, new easy._58_length_of_last_word.Solution().lengthOfLastWord(i));
  }
  @Test

  public void test3() {
    String i = "        ";
    int result = 0;
    Assert.assertEquals(result, new easy._58_length_of_last_word.Solution().lengthOfLastWord(i));
  }
}
