package medium._0000_0099._093_restore_ip_addresses;


import common.Comparators;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "25525511135";
    String[] result = {"255.255.11.135", "255.255.111.35"};
    List<String> solution = new medium._0000_0099._093_restore_ip_addresses.Solution()
        .restoreIpAddresses(s);
    String[] solutionArr = new String[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test1() {
    String s = "0000";
    String[] result = {"0.0.0.0"};
    List<String> solution = new medium._0000_0099._093_restore_ip_addresses.Solution()
        .restoreIpAddresses(s);
    String[] solutionArr = new String[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test2() {
    String s = "1111";
    String[] result = {"1.1.1.1"};
    List<String> solution = new medium._0000_0099._093_restore_ip_addresses.Solution()
        .restoreIpAddresses(s);
    String[] solutionArr = new String[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test3() {
    String s = "010010";
    String[] result = {"0.10.0.10", "0.100.1.0"};
    List<String> solution = new medium._0000_0099._093_restore_ip_addresses.Solution()
        .restoreIpAddresses(s);
    String[] solutionArr = new String[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

  @Test
  public void test4() {
    String s = "101023";
    String[] result = {"1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"};
    List<String> solution = new medium._0000_0099._093_restore_ip_addresses.Solution()
        .restoreIpAddresses(s);
    String[] solutionArr = new String[result.length];
    solution.toArray(solutionArr);
    Assert.assertTrue(Comparators.isSame(result, solutionArr));
  }

}
