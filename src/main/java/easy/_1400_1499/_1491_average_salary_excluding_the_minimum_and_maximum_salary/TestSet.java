package easy._1400_1499._1491_average_salary_excluding_the_minimum_and_maximum_salary;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] salary = {4000, 3000, 1000, 2000};
    Double result = 2500.00000;
    double solution = new easy._1400_1499._1491_average_salary_excluding_the_minimum_and_maximum_salary.Solution()
        .average(salary);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] salary = {1000, 2000, 3000};
    Double result = 2000.00000;
    double solution = new easy._1400_1499._1491_average_salary_excluding_the_minimum_and_maximum_salary.Solution()
        .average(salary);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] salary = {6000, 5000, 4000, 3000, 2000, 1000};
    Double result = 3500.00000;
    double solution = new easy._1400_1499._1491_average_salary_excluding_the_minimum_and_maximum_salary.Solution()
        .average(salary);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] salary = {8000, 9000, 2000, 3000, 6000, 1000};
    Double result = 4750.00000;
    double solution = new easy._1400_1499._1491_average_salary_excluding_the_minimum_and_maximum_salary.Solution()
        .average(salary);
    Assert.assertTrue(result.equals(solution));
  }


}
