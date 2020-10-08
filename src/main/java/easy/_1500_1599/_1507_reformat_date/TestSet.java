package easy._1500_1599._1507_reformat_date;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String date = "20th Oct 2052";
    String result = "2052-10-20";
    String solution = new easy._1500_1599._1507_reformat_date.Solution()
        .reformatDate(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String date = "6th Jun 1933";
    String result = "1933-06-06";
    String solution = new easy._1500_1599._1507_reformat_date.Solution()
        .reformatDate(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String date = "26th May 1960";
    String result = "1960-05-26";
    String solution = new easy._1500_1599._1507_reformat_date.Solution()
        .reformatDate(date);
    Assert.assertTrue(result.equals(solution));
  }

}
