package easy._100_199._171_excel_sheet_column_number;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String input = "A";
    Integer result = 1;
    int solution = new Solution().titleToNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String input = "AB";
    Integer result = 28;
    int solution = new Solution().titleToNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String input = "ZY";
    Integer result = 701;
    int solution = new Solution().titleToNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String input = "AAB";
    Integer result = 704;
    int solution = new Solution().titleToNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String input = "Z";
    Integer result = 26;
    int solution = new Solution().titleToNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String input = "AZ";
    Integer result = 52;
    int solution = new Solution().titleToNumber(input);
    Assert.assertTrue(result.equals(solution));
  }

}
