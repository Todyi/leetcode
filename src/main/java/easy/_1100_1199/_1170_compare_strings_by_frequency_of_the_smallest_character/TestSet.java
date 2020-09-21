package easy._1100_1199._1170_compare_strings_by_frequency_of_the_smallest_character;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] queries = {"cbd"};
    String[] words = {"zaaaz"};
    int[] result = {1};
    int[] solution = new easy._1100_1199._1170_compare_strings_by_frequency_of_the_smallest_character.Solution()
        .numSmallerByFrequency(queries, words);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    String[] queries = {"bbb", "cc"};
    String[] words = {"a", "aa", "aaa", "aaaa"};
    int[] result = {1, 2};
    int[] solution = new easy._1100_1199._1170_compare_strings_by_frequency_of_the_smallest_character.Solution()
        .numSmallerByFrequency(queries, words);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }
}
