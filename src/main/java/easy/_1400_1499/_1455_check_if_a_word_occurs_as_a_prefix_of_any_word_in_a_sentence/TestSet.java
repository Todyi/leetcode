package easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String sentence = "i love eating burger";
    String searchWord = "burg";
    Integer result = 4;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String sentence = "this problem is an easy problem";
    String searchWord = "pro";
    Integer result = 2;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String sentence = "i am tired";
    String searchWord = "you";
    Integer result = -1;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String sentence = "i use triple pillow";
    String searchWord = "pill";
    Integer result = 4;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String sentence = "hello from the other side";
    String searchWord = "they";
    Integer result = -1;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String sentence = "hellohello hellohellohello";
    String searchWord = "ell";
    Integer result = -1;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String sentence = "love errichto jonathan dumb";
    String searchWord = "dumb";
    Integer result = 4;
    int solution = new easy._1400_1499._1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence.Solution()
        .isPrefixOfWord(sentence, searchWord);
    Assert.assertTrue(result.equals(solution));
  }

}
