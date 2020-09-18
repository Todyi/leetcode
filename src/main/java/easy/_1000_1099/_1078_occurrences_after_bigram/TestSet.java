package easy._1000_1099._1078_occurrences_after_bigram;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String text = "alice is a good girl she is a good student";
    String first = "a";
    String second = "good";
    String[] result = {"girl", "student"};
    String[] solution = new easy._1000_1099._1078_occurrences_after_bigram.Solution()
        .findOcurrences(text, first, second);
    Assert.assertTrue(Comparators.isSame(result,solution));
  }

  @Test
  public void test1() {
    String text = "we will we will rock you";
    String first = "we";
    String second = "will";
    String[] result = {"we", "rock"};
    String[] solution = new easy._1000_1099._1078_occurrences_after_bigram.Solution()
        .findOcurrences(text, first, second);
    Assert.assertTrue(Comparators.isSame(result,solution));
  }

}
