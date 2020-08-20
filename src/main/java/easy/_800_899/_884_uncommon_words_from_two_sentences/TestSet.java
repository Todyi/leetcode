package easy._800_899._884_uncommon_words_from_two_sentences;


import common.Comparators;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String A = "this apple is sweet";
    String B = "this apple is sour";
    String[] result = {"sweet", "sour"};
    String[] solution = new easy._800_899._884_uncommon_words_from_two_sentences.Solution()
        .uncommonFromSentences(A, B);
    Arrays.sort(result);
    Arrays.sort(solution);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    String A = "apple apple";
    String B = "banana";
    String[] result = {"banana"};
    String[] solution = new easy._800_899._884_uncommon_words_from_two_sentences.Solution()
        .uncommonFromSentences(A, B);
    Arrays.sort(result);
    Arrays.sort(solution);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    String A = "d b zu d t";
    String B = "udb zu ap";
    String[] result = {"b", "t", "udb", "ap"};
    String[] solution = new easy._800_899._884_uncommon_words_from_two_sentences.Solution()
        .uncommonFromSentences(A, B);
    Arrays.sort(result);
    Arrays.sort(solution);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
