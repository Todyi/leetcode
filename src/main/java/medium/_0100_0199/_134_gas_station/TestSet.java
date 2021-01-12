package medium._0100_0199._134_gas_station;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] gas = {1, 2, 3, 4, 5};
    int[] cost = {3, 4, 5, 1, 2};
    Integer result = 3;
    int solution = new medium._0100_0199._134_gas_station.Solution()
        .canCompleteCircuit(gas, cost);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] gas = {2, 3, 4};
    int[] cost = {3, 4, 3};
    Integer result = -1;
    int solution = new medium._0100_0199._134_gas_station.Solution()
        .canCompleteCircuit(gas, cost);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] gas = {5, 1, 2, 3, 4};
    int[] cost = {4, 4, 1, 5, 1};
    Integer result = 4;
    int solution = new medium._0100_0199._134_gas_station.Solution()
        .canCompleteCircuit(gas, cost);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] gas = {3, 1, 1};
    int[] cost = {1, 2, 2};
    Integer result = 0;
    int solution = new medium._0100_0199._134_gas_station.Solution()
        .canCompleteCircuit(gas, cost);
    Assert.assertTrue(result.equals(solution));
  }


}
