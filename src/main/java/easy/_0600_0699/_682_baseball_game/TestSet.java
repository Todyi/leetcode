package easy._0600_0699._682_baseball_game;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] ops = {"5","2","C","D","+"};
    Integer result = 30;
    int solution = new easy._0600_0699._682_baseball_game.Solution()
        .calPoints(ops);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] ops = {"5","-2","4","C","D","9","+","+"};
    Integer result = 27;
    int solution = new easy._0600_0699._682_baseball_game.Solution()
        .calPoints(ops);
    Assert.assertTrue(result.equals(solution));
  }

}
