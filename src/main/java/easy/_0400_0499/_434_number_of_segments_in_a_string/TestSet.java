package easy._0400_0499._434_number_of_segments_in_a_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "Hello, my name is John";
    Integer result = 5;
    int solution = new easy._0400_0499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "";
    Integer result = 0;
    int solution = new easy._0400_0499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = ", , , ,        a, eaefa";
    Integer result = 6;
    int solution = new easy._0400_0499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String s = " 123 ";
    Integer result = 1;
    int solution = new easy._0400_0499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test4() {
    String s = " 123 321 ^ 1";
    Integer result = 4;
    int solution = new easy._0400_0499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }
  @Test
  public void test5() {
    String s = "hello";
    Integer result = 1;
    int solution = new easy._0400_0499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }


}
