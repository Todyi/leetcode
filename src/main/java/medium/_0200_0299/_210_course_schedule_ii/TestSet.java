package medium._0200_0299._210_course_schedule_ii;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int numCourses = 2;
    int[][] prerequisites = {{1, 0}};
    int[] result = {0, 1};
    int[] solution = new medium._0200_0299._210_course_schedule_ii.Solution()
        .findOrder(numCourses, prerequisites);
    for (int i = 0; i < numCourses; i++) {
      Assert.assertTrue(result[i] == solution[i]);
    }
  }

  @Test
  public void test1() {
    int numCourses = 4;
    int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
    int[] result = {0, 2, 1, 3};
    int[] solution = new medium._0200_0299._210_course_schedule_ii.Solution()
        .findOrder(numCourses, prerequisites);
    for (int i = 0; i < numCourses; i++) {
      Assert.assertTrue(result[i] == solution[i]);
    }
  }

  @Test
  public void test2() {
    int numCourses = 1;
    int[][] prerequisites = {};
    int[] result = {0};
    int[] solution = new medium._0200_0299._210_course_schedule_ii.Solution()
        .findOrder(numCourses, prerequisites);
    for (int i = 0; i < numCourses; i++) {
      Assert.assertTrue(result[i] == solution[i]);
    }
  }

  @Test
  public void test3() {
    int numCourses = 2;
    int[][] prerequisites = {{0, 1}, {1, 0}};
    int[] result = {};
    int[] solution = new medium._0200_0299._210_course_schedule_ii.Solution()
        .findOrder(numCourses, prerequisites);
    Assert.assertTrue(result.length == solution.length);
  }


}
