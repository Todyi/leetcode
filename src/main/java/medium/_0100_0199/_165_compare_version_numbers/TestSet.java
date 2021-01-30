package medium._0100_0199._165_compare_version_numbers;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String version1 = "1.01";
    String version2 = "1.001";
    Integer result = 0;
    int solution = new medium._0100_0199._165_compare_version_numbers.Solution()
        .compareVersion(version1, version2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String version1 = "1.0";
    String version2 = "1.0.0";
    Integer result = 0;
    int solution = new medium._0100_0199._165_compare_version_numbers.Solution()
        .compareVersion(version1, version2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String version1 = "1.0.1";
    String version2 = "1";
    Integer result = 1;
    int solution = new medium._0100_0199._165_compare_version_numbers.Solution()
        .compareVersion(version1, version2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String version1 = "7.5.2.4";
    String version2 = "7.5.3";
    Integer result = -1;
    int solution = new medium._0100_0199._165_compare_version_numbers.Solution()
        .compareVersion(version1, version2);
    Assert.assertTrue(result.equals(solution));
  }


}
