package easy._800_899._860_lemonade_change;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] bills = {5, 5, 5, 10, 20};
    Boolean result = true;
    boolean solution = new easy._800_899._860_lemonade_change.Solution()
        .lemonadeChange(bills);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] bills = {5, 5, 10};
    Boolean result = true;
    boolean solution = new easy._800_899._860_lemonade_change.Solution()
        .lemonadeChange(bills);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] bills = {10, 10};
    Boolean result = false;
    boolean solution = new easy._800_899._860_lemonade_change.Solution()
        .lemonadeChange(bills);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] bills = {5, 5, 10, 10, 20};
    Boolean result = false;
    boolean solution = new easy._800_899._860_lemonade_change.Solution()
        .lemonadeChange(bills);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] bills = {5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5};
    Boolean result = true;
    boolean solution = new easy._800_899._860_lemonade_change.Solution()
        .lemonadeChange(bills);
    Assert.assertTrue(result.equals(solution));
  }

}
