package easy._0600_0699._690_employee_importance;


import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public <T> List<T> arrayToList(T[] subordinates) {
    List<T> res = new ArrayList<>();
    for (T subordinate : subordinates) {
      res.add(subordinate);
    }
    return res;
  }

  @Test
  public void test0() {
    List<Employee> employees = arrayToList(new Employee[]{
        new Employee(1, 5, arrayToList(new Integer[]{2, 3})),
        new Employee(2, 3, arrayToList(new Integer[]{})),
        new Employee(3, 3, arrayToList(new Integer[]{}))
    });
    int id = 1;
    Integer result = 11;
    int solution = new easy._0600_0699._690_employee_importance.Solution()
        .getImportance(employees, id);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    List<Employee> employees = arrayToList(new Employee[]{
        new Employee(101, 3, arrayToList(new Integer[]{})),
        new Employee(2, 5, arrayToList(new Integer[]{101}))
    });
    int id = 101;
    Integer result = 3;
    int solution = new easy._0600_0699._690_employee_importance.Solution()
        .getImportance(employees, id);
    Assert.assertTrue(result.equals(solution));
  }

}
