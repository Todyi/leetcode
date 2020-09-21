package easy._1100_1199._1160_find_words_that_can_be_formed_by_characters;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] words = {"cat","bt","hat","tree"};
    String chars = "atach";
    Integer result = 6;
    int solution = new easy._1100_1199._1160_find_words_that_can_be_formed_by_characters.Solution()
        .countCharacters(words, chars);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] words = {"hello","world","leetcode"};
    String chars = "welldonehoneyr";
    Integer result = 10;
    int solution = new easy._1100_1199._1160_find_words_that_can_be_formed_by_characters.Solution()
        .countCharacters(words, chars);
    Assert.assertTrue(result.equals(solution));
  }

}
