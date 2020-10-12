package easy._0400_0499._482_license_key_formatting;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "5F3Z-2e-9-w";
    int k = 4;
    String result = "5F3Z-2E9W";
    String solution = new easy._0400_0499._482_license_key_formatting.Solution()
        .licenseKeyFormatting(s,k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "2-5g-3-J";
    int k = 2;
    String result = "2-5G-3J";
    String solution = new easy._0400_0499._482_license_key_formatting.Solution()
        .licenseKeyFormatting(s,k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = "2-4A0r7-4k";
    int k = 4;
    String result = "24A0-R74K";
    String solution = new easy._0400_0499._482_license_key_formatting.Solution()
        .licenseKeyFormatting(s,k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = "2-4A0r7-4ki";
    int k = 4;
    String result = "2-4A0R-74KI";
    String solution = new easy._0400_0499._482_license_key_formatting.Solution()
        .licenseKeyFormatting(s,k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String s = "2-4A0r7-4k";
    int k = 3;
    String result = "24-A0R-74K";
    String solution = new easy._0400_0499._482_license_key_formatting.Solution()
        .licenseKeyFormatting(s,k);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String s = "--a-a-a-a--";
    int k = 2;
    String result = "AA-AA";
    String solution = new easy._0400_0499._482_license_key_formatting.Solution()
        .licenseKeyFormatting(s,k);
    Assert.assertTrue(result.equals(solution));
  }
}
