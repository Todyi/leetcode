package easy._400_499._412_fizz_buzz;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 15;
    String[] result = new String[]{
        "1", "2", "Fizz", "4",
        "Buzz", "Fizz", "7", "8",
        "Fizz", "Buzz", "11", "Fizz",
        "13", "14", "FizzBuzz"
    };
    List<String> solution = new easy._400_499._412_fizz_buzz.Solution().fizzBuzz(n);
    String[] solutionArr = new String[solution.size()];
    solutionArr = solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
