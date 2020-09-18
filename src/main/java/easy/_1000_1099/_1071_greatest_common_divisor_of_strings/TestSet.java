package easy._1000_1099._1071_greatest_common_divisor_of_strings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String str1 = "ABCABC";
    String str2 = "ABC";
    String result = "ABC";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String str1 = "ABABAB";
    String str2 = "ABAB";
    String result = "AB";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String str1 = "LEET";
    String str2 = "CODE";
    String result = "";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String str1 = "ABCDEF";
    String str2 = "ABC";
    String result = "";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String str1 = "ABABABAB";
    String str2 = "ABAB";
    String result = "ABAB";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
    String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
    String result = "TAUXX";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String str1 = "CXTXNCXTXNCXTXNCXTXNCXTXN";
    String str2 = "CXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXNCXTXN";
    String result = "CXTXN";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    String str1 = "AAAAAAAAA";
    String str2 = "AAACCC";
    String result = "";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test8() {
    String str1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String str2 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String result = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String solution = new easy._1000_1099._1071_greatest_common_divisor_of_strings.Solution()
        .gcdOfStrings(str1, str2);
    Assert.assertTrue(result.equals(solution));
  }

}
