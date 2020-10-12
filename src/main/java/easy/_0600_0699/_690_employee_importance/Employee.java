package easy._0600_0699._690_employee_importance;


import java.util.List;

public class Employee {
  public int id;
  public int importance;
  public List<Integer> subordinates;

  public Employee(int id, int importance, List<Integer> subordinates) {
    this.id = id;
    this.importance = importance;
    this.subordinates = subordinates;
  }
}
