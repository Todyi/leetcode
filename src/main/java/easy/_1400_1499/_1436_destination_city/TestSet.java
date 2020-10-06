package easy._1400_1499._1436_destination_city;


import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public List<List<String>> toPaths(String[][] path) {
    List<List<String>> res = new ArrayList<>();
    for (String[] s : path) {
      List<String> p = new ArrayList<>();
      p.add(s[0]);
      p.add(s[1]);
      res.add(p);
    }
    return res;
  }

  @Test
  public void test0() {
    List<List<String>> paths = toPaths(
        new String[][]{{"London", "New York"}, {"New York", "Lima"}, {"Lima", "Sao Paulo"}});
    String result = "Sao Paulo";
    String solution = new easy._1400_1499._1436_destination_city.Solution()
        .destCity(paths);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    List<List<String>> paths = toPaths(
        new String[][]{{"B","C"},{"D","B"},{"C","A"}});
    String result = "A";
    String solution = new easy._1400_1499._1436_destination_city.Solution()
        .destCity(paths);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    List<List<String>> paths = toPaths(
        new String[][]{{"A","Z"}});
    String result = "Z";
    String solution = new easy._1400_1499._1436_destination_city.Solution()
        .destCity(paths);
    Assert.assertTrue(result.equals(solution));
  }

}
