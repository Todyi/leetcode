package easy._0700_0799._720_longest_word_in_dictionary;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] bits = {"w", "wo", "wor", "worl", "world"};
    String result = "world";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] bits = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
    String result = "apple";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String[] bits = {"b", "br", "bre", "brea", "break", "breakf", "breakfa", "breakfas",
        "breakfast", "l", "lu", "lun", "lunc", "lunch", "d", "di", "din", "dinn", "dinne",
        "dinner"};
    String result = "breakfast";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String[] bits = {"yo", "ew", "fc", "zrc", "yodn", "fcm", "qm", "qmo", "fcmz", "z", "ewq", "yod",
        "ewqz", "y"};
    String result = "yodn";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test4() {
    String[] bits = {"m", "ma", "mat", "math", "s", "sc", "sci", "scie", "scien", "scienc",
        "science", "a", "ar", "art"};
    String result = "science";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test5() {
    String[] bits = {"k", "lg", "it", "oidd", "oid", "oiddm", "kfk", "y", "mw", "kf", "l", "o",
        "mwaqz", "oi", "ych", "m", "mwa"};
    String result = "oiddm";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test6() {
    String[] bits = {"rac", "rs", "ra", "on", "r", "otif", "o", "onpdu", "rsf", "rs", "ot", "oti",
        "racy", "onpd"};
    String result = "otif";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test7() {
    String[] bits = {"o", "a", "ajd", "ajdpw", "ojowj", "okpnd", "okpn", "ef", "oetj", "ajdp",
        "ojo", "o", "ok", "oet", "o", "oj", "ojowjy", "e"};
    String result = "ojo";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test8() {
    String[] bits = {"vsw", "vs", "zwu", "vsx", "nc", "o", "vswus", "orv", "imf", "i", "v", "zw",
        "vs"};
    String result = "vsw";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test9() {
    String[] bits = {"htncv","htncvn","b","mvaqrm","mv","mvaqr","mva","ht","mvaq","i","h","htnc"};
    String result = "ht";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test10() {
    String[] bits = {"aqfmw","qv","aqf","rju","uw","ahx","aq","rj","a","ah","uwp","ahxm"};
    String result = "ahxm";
    String solution = new easy._0700_0799._720_longest_word_in_dictionary.Solution()
        .longestWord(bits);
    Assert.assertTrue(result.equals(solution));
  }

}
