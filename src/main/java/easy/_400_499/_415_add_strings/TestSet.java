package easy._400_499._415_add_strings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String nums1 = "123";
    String nums2 = "321";
    String result = "444";
    String solution = new easy._400_499._415_add_strings.Solution().addStrings(nums1,nums2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String nums1 = "1234";
    String nums2 = "321";
    String result = "1555";
    String solution = new easy._400_499._415_add_strings.Solution().addStrings(nums1,nums2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String nums1 = "9";
    String nums2 = "99";
    String result = "108";
    String solution = new easy._400_499._415_add_strings.Solution().addStrings(nums1,nums2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String nums1 = "1";
    String nums2 = "9";
    String result = "10";
    String solution = new easy._400_499._415_add_strings.Solution().addStrings(nums1,nums2);
    Assert.assertTrue(result.equals(solution));
  }

}
