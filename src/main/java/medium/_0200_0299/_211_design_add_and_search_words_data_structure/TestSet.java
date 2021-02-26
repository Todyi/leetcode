package medium._0200_0299._211_design_add_and_search_words_data_structure;


import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  @Test
  public void test0() {
    WordDictionary wordDictionary = new WordDictionary();
    wordDictionary.addWord("bad");
    wordDictionary.addWord("dad");
    wordDictionary.addWord("mad");
    Assert.assertEquals(wordDictionary.search("pad"), false); // return False
    Assert.assertEquals(wordDictionary.search("bad"), true); // return True
    Assert.assertEquals(wordDictionary.search(".ad"), true); // return True
    Assert.assertEquals(wordDictionary.search("b.."), true); // return True
  }

  @Test
  public void test1() {
    WordDictionary wordDictionary = new WordDictionary();
    wordDictionary.addWord("a");
    wordDictionary.addWord("a");
    Assert.assertEquals(wordDictionary.search("."), true);
    Assert.assertEquals(wordDictionary.search("a"), true);
    Assert.assertEquals(wordDictionary.search("aa"), false);
    Assert.assertEquals(wordDictionary.search(".a"), false);
    Assert.assertEquals(wordDictionary.search("a."), false);
  }

  @Test
  public void test2() {
    WordDictionary wordDictionary = new WordDictionary();
    wordDictionary.addWord("ran");
    wordDictionary.addWord("rune");
    wordDictionary.addWord("runner");
    wordDictionary.addWord("runs");
    wordDictionary.addWord("add");
    wordDictionary.addWord("adds");
    wordDictionary.addWord("adder");
    wordDictionary.addWord("addee");
    Assert.assertEquals(wordDictionary.search("r.n"), true);
    Assert.assertEquals(wordDictionary.search("ru.n.e"), false);
    Assert.assertEquals(wordDictionary.search("add"), true);
    Assert.assertEquals(wordDictionary.search("add."), true);
    Assert.assertEquals(wordDictionary.search("adde."), true);
    Assert.assertEquals(wordDictionary.search(".an."), false);
    Assert.assertEquals(wordDictionary.search("...s"), true);
    Assert.assertEquals(wordDictionary.search("....e."), true);
    Assert.assertEquals(wordDictionary.search("......."), false);
    Assert.assertEquals(wordDictionary.search("..n.r"), false);
  }

}
