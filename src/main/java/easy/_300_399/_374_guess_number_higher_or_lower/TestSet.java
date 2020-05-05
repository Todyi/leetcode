package easy._300_399._374_guess_number_higher_or_lower;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 10;
    Integer result = 6;
    GuessGame.guessNum = result;
    int solution = new easy._300_399._374_guess_number_higher_or_lower.Solution().guessNumber(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 10;
    Integer result = Integer.MIN_VALUE;
    GuessGame.guessNum = result;
    int solution = new easy._300_399._374_guess_number_higher_or_lower.Solution().guessNumber(n);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 1702766719;
    Integer result = 2126753390;
    GuessGame.guessNum = result;
    int solution = new easy._300_399._374_guess_number_higher_or_lower.Solution().guessNumber(n);
    Assert.assertTrue(result.equals(solution));
  }

}
