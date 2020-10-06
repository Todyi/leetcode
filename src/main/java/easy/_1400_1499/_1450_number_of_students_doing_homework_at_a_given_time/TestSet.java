package easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int[] startTime = {1, 2, 3};
    int[] endTime = {3, 2, 7};
    int queryTime = 4;
    Integer result = 1;
    int solution = new easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time.Solution()
        .busyStudent(startTime, endTime, queryTime);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int[] startTime = {4};
    int[] endTime = {4};
    int queryTime = 4;
    Integer result = 1;
    int solution = new easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time.Solution()
        .busyStudent(startTime, endTime, queryTime);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int[] startTime = {4};
    int[] endTime = {4};
    int queryTime = 5;
    Integer result = 0;
    int solution = new easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time.Solution()
        .busyStudent(startTime, endTime, queryTime);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int[] startTime = {1, 1, 1, 1};
    int[] endTime = {1, 3, 2, 4};
    int queryTime = 7;
    Integer result = 0;
    int solution = new easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time.Solution()
        .busyStudent(startTime, endTime, queryTime);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int[] startTime = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] endTime = {10, 10, 10, 10, 10, 10, 10, 10, 10};
    int queryTime = 5;
    Integer result = 5;
    int solution = new easy._1400_1499._1450_number_of_students_doing_homework_at_a_given_time.Solution()
        .busyStudent(startTime, endTime, queryTime);
    Assert.assertTrue(result.equals(solution));
  }

}
