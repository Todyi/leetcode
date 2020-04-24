package easy._168_excel_sheet_column_title;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int input = 1;
    String result = "A";
    String solution = new easy._168_excel_sheet_column_title.Solution().convertToTitle(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int input = 28;
    String result = "AB";
    String solution = new easy._168_excel_sheet_column_title.Solution().convertToTitle(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int input = 701;
    String result = "ZY";
    String solution = new easy._168_excel_sheet_column_title.Solution().convertToTitle(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int input = 704;
    String result = "AAB";
    String solution = new easy._168_excel_sheet_column_title.Solution().convertToTitle(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int input = 26;
    String result = "Z";
    String solution = new easy._168_excel_sheet_column_title.Solution().convertToTitle(input);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int input = 52;
    String result = "AZ";
    String solution = new easy._168_excel_sheet_column_title.Solution().convertToTitle(input);
    Assert.assertTrue(result.equals(solution));
  }

}
