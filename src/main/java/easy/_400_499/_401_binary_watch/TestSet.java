package easy._400_499._401_binary_watch;


import com.alibaba.fastjson.JSON;
import java.util.List;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    int num = 1;
    String[] result = {"1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"};
    List<String> solution = new easy._400_499._401_binary_watch.Solution().readBinaryWatch(num);
    System.out.println(JSON.toJSONString(result));
    System.out.println(JSON.toJSONString(solution));
  }

  @Test
  public void test1() {
    int num = 0;
    String[] result = {"0:00"};
    List<String> solution = new easy._400_499._401_binary_watch.Solution().readBinaryWatch(num);
    System.out.println(JSON.toJSONString(result));
    System.out.println(JSON.toJSONString(solution));
  }

}
