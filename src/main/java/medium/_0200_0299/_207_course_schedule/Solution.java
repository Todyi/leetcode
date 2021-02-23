package medium._0200_0299._207_course_schedule;

//There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
// You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that
// you must take course bi first if you want to take course ai.
//
//
//
// For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
//
//
// Return true if you can finish all courses. Otherwise, return false.
//
//
// Example 1:
//
//
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: true
//Explanation: There are a total of 2 courses to take.
//To take course 1 you should have finished course 0. So it is possible.
//
//
// Example 2:
//
//
//Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
//Output: false
//Explanation: There are a total of 2 courses to take.
//To take course 1 you should have finished course 0,
// and to take course 0 you should also have finished course 1. So it is impossible.
//
//
//
// Constraints:
//
//
// 1 <= numCourses <= 105
// 0 <= prerequisites.length <= 5000
// prerequisites[i].length == 2
// 0 <= ai, bi < numCourses
// All the pairs prerequisites[i] are unique.
//
// Related Topics Depth-first Search Breadth-first Search Graph Topological Sort
//
// 👍 5308 👎 214

import java.util.ArrayList;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了99.42% 的Java用户
  //  内存消耗:39.5 MB,击败了78.74% 的Java用户
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    ArrayList<LinkedList<Integer>> adjList = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) {
      adjList.add(new LinkedList<>());
    }
    for (int[] item : prerequisites) {
      adjList.get(item[0]).add(item[1]);
    }
    //-1:visited by other course
    // 0:unvisited
    //-1:visited by current course
    int[] visitedMap = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
      if (isCycle_dfs(adjList, visitedMap, i)) {
        return false;
      }
    }
    return true;
  }

  public boolean isCycle_dfs(ArrayList<LinkedList<Integer>> adjList, int[] visitedMap, int course) {
    if (visitedMap[course] == -1) {
      return false;
    }
    if (visitedMap[course] == 1) {
      return true;
    }
    visitedMap[course] = 1;
    LinkedList<Integer> preList = adjList.get(course);
    for (int i = 0; i < preList.size(); i++) {
      if (isCycle_dfs(adjList, visitedMap, preList.get(i))) {
        return true;
      }
    }
    visitedMap[course] = -1;
    return false;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

