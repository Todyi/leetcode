package easy._600_699._690_employee_importance;

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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  //  Runtime: 5 ms, faster than 54.20% of Java online submissions for Employee Importance.
  //  Memory Usage: 41 MB, less than 34.15% of Java online submissions for Employee Importance.
  public int getImportance(List<Employee> employees, int id) {
    Map<Integer, Employee> map = new HashMap<>();
    Employee target = null;
    for (Employee employee : employees) {
      if (id == employee.id) {
        target = employee;
      }
      map.put(employee.id, employee);
    }
    int sum = target.importance;
    while (0 < target.subordinates.size()) {
      int i = target.subordinates.get(0);
      target.subordinates.remove(0);
      if (map.containsKey(i)) {
        Employee e = map.get(i);
        map.remove(i);
        target.subordinates.addAll(e.subordinates);
        sum += e.importance;
      }
    }

    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

