package easy._0700_0799._709_to_lower_case;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String str = "Hello";
    String result = "hello";
    String solution = new easy._0700_0799._709_to_lower_case.Solution()
        .toLowerCase(str);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String str = "here";
    String result = "here";
    String solution = new easy._0700_0799._709_to_lower_case.Solution()
        .toLowerCase(str);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String str = "LOVELY";
    String result = "lovely";
    String solution = new easy._0700_0799._709_to_lower_case.Solution()
        .toLowerCase(str);
    Assert.assertTrue(result.equals(solution));
  }

}
