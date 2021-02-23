package medium._0200_0299._207_course_schedule;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int numCourses = 2;
    int[][] prerequisites = {{1, 0}};
    Boolean result = true;
    boolean solution = new medium._0200_0299._207_course_schedule.Solution()
        .canFinish(numCourses, prerequisites);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    int numCourses = 2;
    int[][] prerequisites = {{1, 0}, {0, 1}};
    Boolean result = false;
    boolean solution = new medium._0200_0299._207_course_schedule.Solution()
        .canFinish(numCourses, prerequisites);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    int numCourses = 1;
    int[][] prerequisites = {};
    Boolean result = true;
    boolean solution = new medium._0200_0299._207_course_schedule.Solution()
        .canFinish(numCourses, prerequisites);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    int numCourses = 5;
    int[][] prerequisites = {{1, 4}, {2, 4}, {3, 1}, {3, 2}};
    Boolean result = true;
    boolean solution = new medium._0200_0299._207_course_schedule.Solution()
        .canFinish(numCourses, prerequisites);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    int numCourses = 4;
    int[][] prerequisites = {{0, 1}, {1, 2}, {2, 3}, {3, 1}};
    Boolean result = false;
    boolean solution = new medium._0200_0299._207_course_schedule.Solution()
        .canFinish(numCourses, prerequisites);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    int numCourses = 3;
    int[][] prerequisites = {{1, 0}, {1, 2}, {0, 1}};
    Boolean result = false;
    boolean solution = new medium._0200_0299._207_course_schedule.Solution()
        .canFinish(numCourses, prerequisites);
    Assert.assertTrue(result.equals(solution));
  }


}
