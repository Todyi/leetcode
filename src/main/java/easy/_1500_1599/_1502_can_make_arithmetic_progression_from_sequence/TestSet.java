package easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] arr = {3, 5, 1};
    Boolean result = true;
    boolean solution = new easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence.Solution()
        .canMakeArithmeticProgression(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] arr = {1, 2, 4};
    Boolean result = false;
    boolean solution = new easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence.Solution()
        .canMakeArithmeticProgression(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] arr = {0, 0, 0, 0};
    Boolean result = true;
    boolean solution = new easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence.Solution()
        .canMakeArithmeticProgression(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] arr = {1, 2, 3, 2, 5};
    Boolean result = false;
    boolean solution = new easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence.Solution()
        .canMakeArithmeticProgression(arr);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] arr = {-68, -96, -12, -40, 16};
    Boolean result = true;
    boolean solution = new easy._1500_1599._1502_can_make_arithmetic_progression_from_sequence.Solution()
        .canMakeArithmeticProgression(arr);
    Assert.assertTrue(result.equals(solution));
  }

}
