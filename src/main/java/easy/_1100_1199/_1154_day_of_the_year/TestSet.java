package easy._1100_1199._1154_day_of_the_year;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String date = "2019-01-09";
    Integer result = 9;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String date = "2019-02-10";
    Integer result = 41;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String date = "2003-03-01";
    Integer result = 60;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String date = "2004-03-01";
    Integer result = 61;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String date = "2016-02-29";
    Integer result = 60;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String date = "1976-01-24";
    Integer result = 24;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String date = "1900-03-25";
    Integer result = 84;
    int solution = new easy._1100_1199._1154_day_of_the_year.Solution()
        .dayOfYear(date);
    Assert.assertTrue(result.equals(solution));
  }

}
