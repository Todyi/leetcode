package easy._1300_1399._1360_number_of_days_between_two_dates;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String date1 = "2019-06-29";
    String date2 = "2019-06-30";
    Integer result = 1;
    int solution = new easy._1300_1399._1360_number_of_days_between_two_dates.Solution()
        .daysBetweenDates(date1, date2);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String date1 = "2020-01-15";
    String date2 = "2019-12-31";
    Integer result = 15;
    int solution = new easy._1300_1399._1360_number_of_days_between_two_dates.Solution()
        .daysBetweenDates(date1, date2);
    Assert.assertTrue(result.equals(solution));
  }

}
