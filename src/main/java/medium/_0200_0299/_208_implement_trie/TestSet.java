package medium._0200_0299._208_implement_trie;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    Trie trie = new Trie();
    trie.insert("apple");
    Assert.assertEquals(trie.search("apple"), true);
    Assert.assertEquals(trie.search("app"), false);
    Assert.assertEquals(trie.startsWith("app"), true);
    trie.insert("app");
    Assert.assertEquals(trie.search("app"), true);
  }

  @Test
  public void test1() {
    Trie trie = new Trie();
    Assert.assertEquals(trie.search("a"), false);
  }

}
