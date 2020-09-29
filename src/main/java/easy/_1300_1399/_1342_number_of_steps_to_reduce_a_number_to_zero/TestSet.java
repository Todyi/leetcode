package easy._1300_1399._1342_number_of_steps_to_reduce_a_number_to_zero;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 14;
    Integer result = 6;
    int solution = new easy._1300_1399._1342_number_of_steps_to_reduce_a_number_to_zero.Solution()
        .numberOfSteps(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int num = 8;
    Integer result = 4;
    int solution = new easy._1300_1399._1342_number_of_steps_to_reduce_a_number_to_zero.Solution()
        .numberOfSteps(num);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int num = 123;
    Integer result = 12;
    int solution = new easy._1300_1399._1342_number_of_steps_to_reduce_a_number_to_zero.Solution()
        .numberOfSteps(num);
    Assert.assertTrue(result.equals(solution));
  }

}
