package easy._1100_1199._1185_day_of_the_week;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int day = 31;
    int month = 8;
    int year = 2019;
    String result = "Saturday";
    String solution = new easy._1100_1199._1185_day_of_the_week.Solution()
        .dayOfTheWeek(day, month, year);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int day = 18;
    int month = 7;
    int year = 1999;
    String result = "Sunday";
    String solution = new easy._1100_1199._1185_day_of_the_week.Solution()
        .dayOfTheWeek(day, month, year);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int day = 15;
    int month = 8;
    int year = 1993;
    String result = "Sunday";
    String solution = new easy._1100_1199._1185_day_of_the_week.Solution()
        .dayOfTheWeek(day, month, year);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int day = 1;
    int month = 1;
    int year = 2000;
    String result = "Saturday";
    String solution = new easy._1100_1199._1185_day_of_the_week.Solution()
        .dayOfTheWeek(day, month, year);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int day = 29;
    int month = 2;
    int year = 2016;
    String result = "Monday";
    String solution = new easy._1100_1199._1185_day_of_the_week.Solution()
        .dayOfTheWeek(day, month, year);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    int day = 15;
    int month = 4;
    int year = 2008;
    String result = "Tuesday";
    String solution = new easy._1100_1199._1185_day_of_the_week.Solution()
        .dayOfTheWeek(day, month, year);
    Assert.assertTrue(result.equals(solution));
  }

}
