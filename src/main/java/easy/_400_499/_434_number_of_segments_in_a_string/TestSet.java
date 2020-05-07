package easy._400_499._434_number_of_segments_in_a_string;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "Hello, my name is John";
    Integer result = 5;
    int solution = new easy._400_499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "";
    Integer result = 0;
    int solution = new easy._400_499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String s = ", , , ,        a, eaefa";
    Integer result = 6;
    int solution = new easy._400_499._434_number_of_segments_in_a_string.Solution().countSegments(s);
    Assert.assertTrue(result.equals(solution));
  }


}
