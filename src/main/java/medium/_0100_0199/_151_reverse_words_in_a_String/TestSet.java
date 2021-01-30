package medium._0100_0199._151_reverse_words_in_a_String;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "the sky is blue";
    String result = "blue is sky the";
    String solution = new medium._0100_0199._151_reverse_words_in_a_String.Solution()
        .reverseWords(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "  hello world  ";
    String result = "world hello";
    String solution = new medium._0100_0199._151_reverse_words_in_a_String.Solution()
        .reverseWords(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "a good   example";
    String result = "example good a";
    String solution = new medium._0100_0199._151_reverse_words_in_a_String.Solution()
        .reverseWords(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "  Bob    Loves  Alice   ";
    String result = "Alice Loves Bob";
    String solution = new medium._0100_0199._151_reverse_words_in_a_String.Solution()
        .reverseWords(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "Alice does not even like bob";
    String result = "bob like even not does Alice";
    String solution = new medium._0100_0199._151_reverse_words_in_a_String.Solution()
        .reverseWords(s);
    Assert.assertTrue(result.equals(solution));
  }


}
