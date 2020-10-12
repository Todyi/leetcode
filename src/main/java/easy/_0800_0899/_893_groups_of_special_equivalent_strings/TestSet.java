package easy._0800_0899._893_groups_of_special_equivalent_strings;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    String[] A = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
    Integer result = 3;
    int solution = new easy._0800_0899._893_groups_of_special_equivalent_strings.Solution()
        .numSpecialEquivGroups(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test1() {
    String[] A = {"abc", "acb", "bac", "bca", "cab", "cba"};
    Integer result = 3;
    int solution = new easy._0800_0899._893_groups_of_special_equivalent_strings.Solution()
        .numSpecialEquivGroups(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test2() {
    String[] A = {"ea", "we", "vd", "qx", "zd", "dm", "vc", "uh", "ps", "pd", "sy", "bq", "lm",
        "hb", "pi", "ca", "he", "hq", "wl", "bb", "rs", "db", "ca", "ry", "cd", "rl", "ee", "us",
        "br", "dm", "cf", "vm", "me", "jo", "lh", "pc", "mt", "tn", "br", "hb", "pi", "wl", "dm",
        "qx", "pi", "mt", "pi", "pi", "db", "us"};
    Integer result = 36;
    int solution = new easy._0800_0899._893_groups_of_special_equivalent_strings.Solution()
        .numSpecialEquivGroups(A);
    Assert.assertTrue(result.equals(solution));
  }

  @Test
  public void test3() {
    String[] A = {"naxeixzzxqlsekzdzefi", "wlerclymemtfnakxmtvq", "mhwnbuwtvmqqceimnypr",
        "bulmctscpvrvkfevhyoo", "jggtfippwywhsvkkezke", "ldmgzrwdnuspmqyxxanp",
        "mscqvootxbhbhirejnwc", "faadquvjpysknlaxhxot", "sfzroqxiiqrcmfthavhi",
        "vshdpffkdlmfpwovuuet", "qahtacxzqwzpfatzpbzr", "yeodwmzpyuuaeuprmxax",
        "updtulswuiqpktefjkkz", "xwmtcajmxdjawefmrhkn", "aaxodqtjpagggbqubdym",
        "kfgrflodqfjkiglkqdce", "narefcacncsmrqutsvzo", "floocrafrenuwhmqkydn",
        "jgdbdjiasgzyksjkidau", "aufzfpxwqslnekanwqym", "bjoxmkktjsmxzemnrfjr",
        "lrbkyyrojqkbxzujaybm", "kpccivvmbzfhelcdbeby", "pisctytkfndsuabftwal",
        "tumoyafxefizneaojkje", "iuvsjndkimhaodehygzc", "akmgbtivxxwojbywubsr",
        "audasydbzdigjkjsigkj", "vihncorqmcwbxthsjboe", "bxmfktjjmkoszrrxmnje",
        "vzclbmieevbdcpkhbcfy", "tcfytndfsiusaabkpltw", "updputszqtukeljfkwki",
        "jxmjkrjnbxzemkotmfrs", "wtmexhxmcnjwjarafdkm", "mbyoavjtxxskbbugwwir",
        "aulkqpfqxwwsazfmynen", "xqfazszeexndielkzzxi", "dhvajdhkiceuisygzmon",
        "mjonrrjtbxzxjsmkmfke", "iiacoihrmhzqxfrqsftv", "laypnrxpsgwxndzdmumq",
        "okndfyvusjalathxpaqx", "mkiajonefzyoaujeextf", "uwufszekkpupktjldiqt",
        "jaohvmykduinzsedhcig", "survptlvcchyevboofkm", "ktepklufupszdwutjiqk",
        "rwfmmtxnjdkaxmwechja", "vxyawletemkfcqtrnmml"};
    Integer result = 27;
    int solution = new easy._0800_0899._893_groups_of_special_equivalent_strings.Solution()
        .numSpecialEquivGroups(A);
    Assert.assertTrue(result.equals(solution));
  }

}
