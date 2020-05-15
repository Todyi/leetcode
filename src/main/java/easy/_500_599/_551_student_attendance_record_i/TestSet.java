package easy._500_599._551_student_attendance_record_i;


import common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String s = "PPALLP";
    Boolean result = true;
    boolean solution = new easy._500_599._551_student_attendance_record_i.Solution()
        .checkRecord(s);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String s = "PPALLL";
    Boolean result = false;
    boolean solution = new easy._500_599._551_student_attendance_record_i.Solution()
        .checkRecord(s);
    Assert.assertTrue(result.equals(solution));
  }

}
