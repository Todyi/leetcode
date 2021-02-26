package medium._0200_0299._210_course_schedule_ii;

//There are a total of n courses you have to take labelled from 0 to n - 1.
//
// Some courses may have prerequisites, for example,
// if prerequisites[i] = [ai, bi] this means you must take the course bi before the course ai.
//
// Given the total number of courses numCourses and a list of the prerequisite pairs,
// return the ordering of courses you should take to finish all courses.
//
// If there are many valid answers, return any of them. If it is impossible to finish all courses,
// return an empty array.
//
//
// Example 1:
//
//
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: [0,1]
//Explanation: There are a total of 2 courses to take.
// To take course 1 you should have finished course 0. So the correct course order is [0,1].
//
//
// Example 2:
//
//
//Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
//Output: [0,2,1,3]
//Explanation: There are a total of 4 courses to take.
// To take course 3 you should have finished both courses 1 and 2.
// Both courses 1 and 2 should be taken after you finished course 0.
//So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
//
//
// Example 3:
//
//
//Input: numCourses = 1, prerequisites = []
//Output: [0]
//
//
//
// Constraints:
//
//
// 1 <= numCourses <= 2000
// 0 <= prerequisites.length <= numCourses * (numCourses - 1)
// prerequisites[i].length == 2
// 0 <= ai, bi < numCourses
// ai != bi
// All the pairs [ai, bi] are distinct.
//
// Related Topics Depth-first Search Breadth-first Search Graph Topological Sort
//
// 👍 3348 👎 161


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Course Schedule II.
  //  Memory Usage: 39.6 MB, less than 94.12% of Java online submissions for Course Schedule II.
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    int idx = numCourses - 1, len = prerequisites.length;
    int[] seq = new int[numCourses];
    //-1:added in seq
    //:n courses need to finish this course
    int[] course = new int[numCourses];
    boolean[] visited = new boolean[len];
    for (int[] item : prerequisites) {
      course[item[1]]++;
    }
    boolean flag = true;
    while (flag) {
      flag = false;
      for (int i = 0; i < len; i++) {
        int[] item = prerequisites[i];
        if (!visited[i]) {
          if (course[item[0]] < 1) {
            if (course[item[0]] == 0) {
              seq[idx--] = item[0];
              course[item[0]] = -1;
            }
            course[item[1]]--;
            visited[i] = true;
            flag = true;
          }
        }
      }
    }
    for (int i = 0; i < numCourses && -1 < idx; i++) {
      if (0 < course[i]) {
        return new int[]{};
      }
      if (course[i] == 0) {
        seq[idx--] = i;
      }
    }
    return seq;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
