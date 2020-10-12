package easy._0000_0099._038_count_and_say;

/**
 * @program: leetcode
 * @description: 38.Count and Say
 * @author: hdy
 * @create: 2019-11-27
 **/
public class CountAndSay {

  private static String[] init = {"1", "11", "21", "1211", "111221"};


  public static String countAndSay(int n) {
    return say(n);
  }

  public static String say(int n) {
    if (n <= 5 && n > 0) {
      return init[n - 1];
    }

    String n_1 = say(n - 1);
    char[] arr = n_1.toCharArray();
    int i = 0;
    int num = 1;
    StringBuffer seq = new StringBuffer();
    while (i + 1 <= arr.length) {
      if (i + 1 == arr.length) {
        seq.append(num).append(arr[i]);
      } else if (arr[i] != arr[i + 1]) {
        seq.append(num).append(arr[i]);
        num = 1;
      } else {
        num++;
      }
      i++;
    }

    return seq.toString();
  }


}
