package easy._900_999._953_verifying_an_alien_dictionary;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] words = {"hello", "leetcode"};
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    Boolean result = true;
    boolean solution = new easy._900_999._953_verifying_an_alien_dictionary.Solution()
        .isAlienSorted(words, order);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] words = {"word", "world", "row"};
    String order = "worldabcefghijkmnpqstuvxyz";
    Boolean result = false;
    boolean solution = new easy._900_999._953_verifying_an_alien_dictionary.Solution()
        .isAlienSorted(words, order);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String[] words = {"apple", "app"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    Boolean result = false;
    boolean solution = new easy._900_999._953_verifying_an_alien_dictionary.Solution()
        .isAlienSorted(words, order);
    Assert.assertTrue(result.equals(solution));
  }

}
