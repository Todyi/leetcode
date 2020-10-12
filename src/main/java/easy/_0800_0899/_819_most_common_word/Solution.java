package easy._0800_0899._819_most_common_word;

//Given a paragraph and a list of banned words,
// return the most frequent word that is not in the list of banned words.
// It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
//
// Words in the list of banned words are given in lowercase, and free of punctuation.
// Words in the paragraph are not case sensitive. The answer is in lowercase.
//
//
//
//
// Example:
//
//
//Input:
//paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
//banned = ["hit"]
//Output: "ball"
//Explanation:
//"hit" occurs 3 times, but it is a banned word.
//"ball" occurs twice (and no other word does),
// so it is the most frequent non-banned word in the paragraph.
//Note that words in the paragraph are not case sensitive,
//that punctuation is ignored (even if adjacent to words, such as "ball,"),
//and that "hit" isn't the answer even though it occurs more because it is banned.
//
//
//
//
// Note:
//
//
// 1 <= paragraph.length <= 1000.
// 0 <= banned.length <= 100.
// 1 <= banned[i].length <= 10.
// The answer is unique, and written in lowercase (even if its occurrences in pa
//ragraph may have uppercase symbols, and even if it is a proper noun.)
// paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
//
// There are no hyphens or hyphenated words.
// Words only consist of letters, never apostrophes or other punctuation symbols
//.
//
// Related Topics String
// 👍 680 👎 1628


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了99.34% 的Java用户
  //  内存消耗:39 MB,击败了97.60% 的Java用户
//  public String mostCommonWord(String paragraph, String[] banned) {
//    char[] charArr = paragraph.toCharArray();
//    int wordBegin = 0;
//    HashMap<String, Integer> map = new HashMap<>();
//    for (int i = 0; i < charArr.length; i++) {
//      if (!Character.isLetter(charArr[i])) {
//        String word = paragraph.substring(wordBegin, i).toLowerCase();
//        wordBegin = i + 1;
//        if (0 < word.length()) {
//          map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//      } else if (i == charArr.length - 1) {
//        String word = paragraph.substring(wordBegin).toLowerCase();
//        map.put(word, map.getOrDefault(word, 0) + 1);
//      }
//    }
//    for (String ban : banned) {
//      map.remove(ban);
//    }
//    int max = -1;
//    String word = null;
//    for (String key : map.keySet()) {
//      if (max < map.get(key)) {
//        max = map.get(key);
//        word = key;
//      }
//    }
//    return word;
//  }


  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39.2 MB,击败了96.09% 的Java用户
  class Node {

    Node[] nextChar = new Node[26];
    boolean baned = false;
    int count;
  }

  public String mostCommonWord(String paragraph, String[] banned) {
    String word = null;
    int count = 0, wordBegin = 0;
    Node root = new Node();
    Node point = root;
    for (String ban : banned) {
      char[] banArr = ban.toCharArray();
      for (int i = 0; i < banArr.length; i++) {
        int cIndex = banArr[i] - 'a';
        if (point.nextChar[cIndex] == null) {
          point.nextChar[cIndex] = new Node();
        }
        point = point.nextChar[cIndex];
      }
      point.baned = true;
      point = root;
    }
    paragraph = paragraph.toLowerCase();
    char[] pArr = paragraph.toCharArray();
    point = root;
    for (int i = 0; i < pArr.length; i++) {
      if (Character.isLetter(pArr[i])) {
        int cIndex = pArr[i] - 'a';
        if (point.nextChar[cIndex] == null) {
          point.nextChar[cIndex] = new Node();
        }
        point = point.nextChar[cIndex];
      } else {
        if (point != root && !point.baned) {
          point.count++;
          if (count < point.count) {
            count = point.count;
            word = paragraph.substring(wordBegin, i);
          }
        }
        point = root;
        wordBegin = i + 1;
      }
    }
    if (point != root && !point.baned) {
      point.count++;
      if (count < point.count) {
        word = paragraph.substring(wordBegin);
      }
    }

    return word;
  }


}
//leetcode submit region end(Prohibit modification and deletion)

