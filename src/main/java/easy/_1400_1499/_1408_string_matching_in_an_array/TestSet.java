package easy._1400_1499._1408_string_matching_in_an_array;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] words = {"mass", "as", "hero", "superhero"};
    String[] result = {"as", "hero"};
    List<String> solution = new easy._1400_1499._1408_string_matching_in_an_array.Solution()
        .stringMatching(words);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    String[] words = {"leetcode", "et", "code"};
    String[] result = {"et", "code"};
    List<String> solution = new easy._1400_1499._1408_string_matching_in_an_array.Solution()
        .stringMatching(words);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    String[] words = {"blue", "green", "bu"};
    String[] result = {};
    List<String> solution = new easy._1400_1499._1408_string_matching_in_an_array.Solution()
        .stringMatching(words);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test3() {
    String[] words = {"abcd", "a", "b"};
    String[] result = {"a","b"};
    List<String> solution = new easy._1400_1499._1408_string_matching_in_an_array.Solution()
        .stringMatching(words);
    String[] solutionArr = new String[solution.size()];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
