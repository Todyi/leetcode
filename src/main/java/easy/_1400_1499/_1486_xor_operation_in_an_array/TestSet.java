package easy._1400_1499._1486_xor_operation_in_an_array;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int n = 5;
    int start = 0;
    Integer result = 8;
    int solution = new easy._1400_1499._1486_xor_operation_in_an_array.Solution()
        .xorOperation(n, start);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int n = 4;
    int start = 3;
    Integer result = 8;
    int solution = new easy._1400_1499._1486_xor_operation_in_an_array.Solution()
        .xorOperation(n, start);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int n = 1;
    int start = 7;
    Integer result = 7;
    int solution = new easy._1400_1499._1486_xor_operation_in_an_array.Solution()
        .xorOperation(n, start);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int n = 10;
    int start = 5;
    Integer result = 2;
    int solution = new easy._1400_1499._1486_xor_operation_in_an_array.Solution()
        .xorOperation(n, start);
    Assert.assertTrue(result.equals(solution));
  }

}
