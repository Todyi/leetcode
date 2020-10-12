package easy._0600_0699._690_employee_importance;

//You are given a data structure of employee information, which includes the employee's unique id,
// his importance value and his direct subordinates' id.
//
// For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3.
// They have importance value 15, 10 and 5, respectively.
// Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]],
// and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1,
// the relationship is not direct.
//
// Now given the employee information of a company, and an employee id,
// you need to return the total importance value of this employee and all his subordinates.
//
//
// Example 1:
//
//
//Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
//Output: 11
//Explanation:
//Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3.
// They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.
//
//
//
//
// Note:
//
//
// One employee has at most one direct leader and may have several subordinates.
//
// The maximum number of employees won't exceed 2000.
//
//
//
// Related Topics Hash Table Depth-first Search Breadth-first Search

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

import java.util.List;

class Solution {

  //  Runtime: 3 ms, faster than 100.00% of Java online submissions for Employee Importance.
  //  Memory Usage: 40.6 MB, less than 76.94% of Java online submissions for Employee Importance.
  public int getImportance(List<Employee> employees, int id) {
    Employee[] map = new Employee[2001];
    for (Employee employee : employees) {
      map[employee.id] = employee;
    }
    return sumWithSubordinates(id, map);
  }

  public int sumWithSubordinates(int id, Employee[] map) {
    Employee e = map[id];
    int sum = e.importance;
    for (Integer i : e.subordinates) {
      if (map[i] != null) {
        Employee s = map[i];
        sum += sumWithSubordinates(s.id, map);
      }
    }
    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

