package easy._1000_1099._1009_complement_of_base_10_integer;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int N = 5;
    Integer result = 2;
    int solution = new easy._1000_1099._1009_complement_of_base_10_integer.Solution()
        .bitwiseComplement(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int N = 7;
    Integer result = 0;
    int solution = new easy._1000_1099._1009_complement_of_base_10_integer.Solution()
        .bitwiseComplement(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int N = 10;
    Integer result = 5;
    int solution = new easy._1000_1099._1009_complement_of_base_10_integer.Solution()
        .bitwiseComplement(N);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int N = 0;
    Integer result = 1;
    int solution = new easy._1000_1099._1009_complement_of_base_10_integer.Solution()
        .bitwiseComplement(N);
    Assert.assertTrue(result.equals(solution));
  }

}
