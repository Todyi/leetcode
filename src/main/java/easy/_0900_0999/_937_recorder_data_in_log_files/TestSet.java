package easy._0900_0999._937_recorder_data_in_log_files;


import common.Comparators;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig",
        "let3 art zero"};
    String[] result = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1",
        "dig2 3 6"};
    String[] solution = new easy._0900_0999._937_recorder_data_in_log_files.Solution()
        .reorderLogFiles(logs);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test1() {
    String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
    String[] result = {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
    String[] solution = new easy._0900_0999._937_recorder_data_in_log_files.Solution()
        .reorderLogFiles(logs);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

  @Test
  public void test2() {
    String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo",
        "a2 act car"};
    String[] result = {"a2 act car", "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1",
        "zo4 4 7"};
    String[] solution = new easy._0900_0999._937_recorder_data_in_log_files.Solution()
        .reorderLogFiles(logs);
    Assert.assertTrue(Comparators.isSame(result, solution));
  }

}
